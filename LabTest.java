/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_qlis;

/**
 *
 * @author cstuser
 */
public class LabTest {
    private int idTest = 0;
    private String TestDate="";
    private String TestName = "";
    private String TestDescription = "";
    private String Ins_Number = "";

    public LabTest() {
     idTest = 0;
     String TestDate="";
     String TestName = "";
     String TestDescription = "";
     String Ins_Number = "";
    }



    public void setIdTest(int idTest) {
        this.idTest = idTest;
    }

    public void setTestDate(String TestDate) {
        this.TestDate = TestDate;
    }

    public void setTestName(String TestName) {
        this.TestName = TestName;
    }

    public void setTestDescription(String TestDescription) {
        this.TestDescription = TestDescription;
    }

    public void setIns_Number(String Ins_Number) {
        this.Ins_Number = Ins_Number;
    }

    public int getIdTest() {
        return idTest;
    }

    public String getTestDate() {
        return TestDate;
    }

    public String getTestName() {
        return TestName;
    }

    public String getTestDescription() {
        return TestDescription;
    }

    public String getIns_Number() {
        return Ins_Number;
    }

   
    @Override
    public String toString() {
        return "LabTest{" + "idTest=" + idTest + ", TestDate=" + TestDate + ", TestName=" + TestName + ", TestDescription=" + TestDescription + ", Ins_Number=" + Ins_Number + '}';
    }
              
      
}
