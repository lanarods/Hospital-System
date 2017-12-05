/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_qlis;

import java.util.Objects;

/**
 *
 * @author cstuser
 */
public class DOCTOR {
    private int DoctorID;
    private String   DoctorLastName;
    private String DoctorFirstName;
    private String HospitalName;
    private String  speciality;
    private int  TestID;
    private int  DoctorTel;

    public DOCTOR() {
        this.DoctorID = 0;
        this.DoctorLastName = "";
        this.DoctorFirstName = "";
        this.HospitalName ="";
        this.speciality = "";
        this.TestID = 0;
                
        this.DoctorTel = 0;
    }

    public DOCTOR(int DoctorID, String DoctorLastName, String DoctorFirstName, String HospitalName, String speciality, int TestID, int DoctorTel) {
        this.DoctorID = DoctorID;
        this.DoctorLastName = DoctorLastName;
        this.DoctorFirstName = DoctorFirstName;
        this.HospitalName = HospitalName;
        this.speciality = speciality;
        this.TestID = TestID;
        this.DoctorTel = DoctorTel;
    }

    public void setDoctorID(int DoctorID) {
        this.DoctorID = DoctorID;
    }

    public void setDoctorLastName(String DoctorLastName) {
        this.DoctorLastName = DoctorLastName;
    }

    public void setDoctorFirstName(String DoctorFirstName) {
        this.DoctorFirstName = DoctorFirstName;
    }

    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setTestID(int TestID) {
        this.TestID = TestID;
    }

    public void setDoctorTel(int DoctorTel) {
        this.DoctorTel = DoctorTel;
    }

    public int getDoctorID() {
        return DoctorID;
    }

    public String getDoctorLastName() {
        return DoctorLastName;
    }

    public String getDoctorFirstName() {
        return DoctorFirstName;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getTestID() {
        return TestID;
    }

    public int getDoctorTel() {
        return DoctorTel;
    }

    @Override
    public String toString() {
        return "DOCTOR{" + "DoctorID=" + DoctorID + ", DoctorLastName=" + DoctorLastName + ", DoctorFirstName=" + DoctorFirstName + ", HospitalName=" + HospitalName + ", speciality=" + speciality + ", TestID=" + TestID + ", DoctorTel=" + DoctorTel + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.DoctorID;
        hash = 83 * hash + Objects.hashCode(this.DoctorLastName);
        hash = 83 * hash + Objects.hashCode(this.DoctorFirstName);
        hash = 83 * hash + Objects.hashCode(this.HospitalName);
        hash = 83 * hash + Objects.hashCode(this.speciality);
        hash = 83 * hash + this.TestID;
        hash = 83 * hash + this.DoctorTel;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DOCTOR other = (DOCTOR) obj;
        if (this.DoctorID != other.DoctorID) {
            return false;
        }
        if (this.TestID != other.TestID) {
            return false;
        }
        if (this.DoctorTel != other.DoctorTel) {
            return false;
        }
        if (!Objects.equals(this.DoctorLastName, other.DoctorLastName)) {
            return false;
        }
        if (!Objects.equals(this.DoctorFirstName, other.DoctorFirstName)) {
            return false;
        }
        if (!Objects.equals(this.HospitalName, other.HospitalName)) {
            return false;
        }
        if (!Objects.equals(this.speciality, other.speciality)) {
            return false;
        }
        return true;
    }
   
}
