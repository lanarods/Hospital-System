/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_qlis;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import javax.swing.JOptionPane;


public class ConnectJavaOracle {
    public static int ErrorType = -1;
    static Connection c;
    static Statement s ;
    static ResultSet rs;
    
    public static void openOracleConnection(String username,String password)
    {
    
        c = null;
        try{
            System.out.println("**********************************************");
            System.out.println("* CONNECTION*");
            System.out.println("**********************************************");
            System.out.println("*Loading the driver *");
            Class.forName("oracle.jdbc.OracleDriver");
           // String url = "jdbc:oracle:thin:@localhost:5500/em";
            String  url= "jdbc:oracle:thin:@localhost:1521:orcl";
            c = DriverManager.getConnection(url,username,password);
            s = c.createStatement();
//Oracle Enterprise Manager Database Express URL: https://localhost:5500/em
          // String query = query+"('"+ name +"','"+ SSN_id +"','"+number_whr+"','"+h_rate+"','"+Total_Income+"','"+NET_Amount+"','"+Fed_Tax+"','"+Prv_Tax+"','"+QP+"','"+E_Ins+"','"+QPP+"','"+Union_Deduction+"')";
    
        }
        catch(Exception e)
        {
        
            try
            {
                c.rollback();
            }
            catch(Exception ee)
            {
            System.out.println("Error! ");
            System.out.println("Error - Database Management for creating tables(): "+ e);
            System.out.println("Error - Class: "+ e.getClass());
            }
        }
       
    }
     public static ResultSet processSearchQuery(String query) {
         ErrorType = -1;
        try {
            
            //works for all SQL select
            rs = s.executeQuery(query);
            System.out.println("**********************************************");
            System.out.println("* PROSESS*");
            System.out.println("**********************************************");
            
        } catch (Exception e) {
            try {
                c.rollback();
            } catch (Exception ee) {
                System.out.println("Error!");
            }
            System.out.println("Error - Database Management for tables():" + e);
        }
        return rs;
    }
    public static void processQuery(String query)
    {
     
        try{
           
            System.out.println("**********************************************");
            System.out.println("* VALIDATION*");
            System.out.println("**********************************************");
            s.executeUpdate(query);
        }
        catch(Exception e)
        {
            try
            {
                c.rollback();
            }
            catch(Exception ee)
            {
            System.out.println("Error! ");
            System.out.println("Error - Database Management for creating tables(): "+ e);
            }
        }
    
    
    }
    
    
    public static void closeOracleConnection()
    {  
        try{
            c.commit();
            c.close();
        }
        catch(Exception e)
        {
        
            try
            {
                c.rollback();
            }
            catch(Exception ee)
            {
           
            System.out.println("Error - Database Management for creating tables(): "+ e);
            }
        }
    
    
    }
    
    public static void ErrorSearchMessage(Exception e)
    {
        System.out.println("Error Class: " + e.getClass());
        System.out.println("Error Search: " + e.getMessage());//ORA-00900
        if(e.getMessage().contains("ORA-00900")) // Insert error constraint.
        {
            ErrorType = 1;
        }
    }
    
    public static List<LinkedHashMap<String, Object>> RetrieveRecords(String query){
        int i = 0;
        String columName;
        List<LinkedHashMap<String, Object>> myRecords = new ArrayList<>();
        LinkedHashMap<String, Object> myRecord;
        try {
            ResultSet rs = s.executeQuery(query);
            
            while (rs.next()) {
                myRecord = new LinkedHashMap <>();
                ResultSetMetaData rsmd = rs.getMetaData();
                for(int j = 1; j <= rsmd.getColumnCount(); j++){
                    columName = rsmd.getColumnName(j);
                    myRecord.put(columName, rs.getObject(columName));
                }
                i++;
                myRecords.add(myRecord);
            }
        } catch (SQLException e ) {
            System.out.println(e.toString());
        }
        return myRecords;
    }
}
