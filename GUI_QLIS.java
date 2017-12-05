/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_qlis;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JOptionPane;


public class GUI_QLIS  implements ActionListener  {
    
      //Create the  text fields
    static JTextField 
           loginTF,
           PasswordTF;
    
     MainFrame mainframe ;
     public GUI_QLIS()
    {
        //Create a frame object wframe
        JFrame wframe = new JFrame();


        //Set the title of the window
        wframe.setTitle("Quebec Laboratories Information System");
            //Create the two text field
        loginTF = new JTextField(10);
        PasswordTF = new JTextField(10); 
        
          //Create the two labels
        JLabel loginL = new JLabel("Enter Insurance Number: ", SwingConstants.RIGHT);
        JLabel PasswordL = new JLabel("Enter Password: ",SwingConstants.RIGHT);
        
        
         //Create OK Button 
       
        JButton ApplyB = new JButton("Apply");
        //Crete a Listner 
        ApplyB.addActionListener(this);
        
        //Crete Exit Button
        
        JButton CancelB=new JButton("Cancel");
        //Crete a Listner 
        CancelB.addActionListener(this);
        
         //Set the size of the window and display it
        wframe.setSize(400,200);
        wframe.setVisible(true);
        
         //Get the contanier
        Container pane = wframe.getContentPane();
        //Set the layaut
        pane.setLayout(new GridLayout(3,2));
        
        //Place the conponent in the pane
        pane.add(loginL);
        pane.add(loginTF);
        
        pane.add(PasswordL);
        pane.add(PasswordTF);
        
        pane.add(ApplyB);
        pane.add(CancelB);
      
    }
   
 @Override
       public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals("Apply"))
            {
                if(loginTF.getText().equals("MAKS") && PasswordTF.getText().equals("1234"))
//                   JOptionPane.showMessageDialog(null, "Welcome to the System "+loginTF.getText(),"Correct",JOptionPane.PLAIN_MESSAGE);
                  mainframe = new  MainFrame(); 
                else
                    JOptionPane.showMessageDialog(null, "Invalid Password or Login","Try again",JOptionPane.ERROR_MESSAGE);
            }
           else if(e.getActionCommand().endsWith("Cancel"))
            {
                    System.exit(0);
            } 
    }

   
}
