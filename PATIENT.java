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
public class PATIENT {
    private String Insurance_Number;
    private String PASSWORD;
    public String PersonStatus;
    private String  NameFirst;
    private String   NameLast;
    private String Dateofbirthday;
    private int    TelNumber;
    private String  EmailAddress;
     private String  Address;
    private int     DoctorID;

    public PATIENT()
    {
        this.Insurance_Number = "";
        this.PASSWORD = "";
        this.PersonStatus = "";
        this.NameFirst = "";
        this.NameLast = "";
        this.Dateofbirthday = "";
        this.TelNumber = 0;
        this.EmailAddress = "";
         this.Address = "";
        this.DoctorID = 0;
    }
 public PATIENT(String Insurance_Number, String PASSWORD, String PersonStatus, String NameFirst, String NameLast, String Dateofbirthday, int TelNumber, String EmailAddress,String Address, int DoctorID) {
        this.Insurance_Number = Insurance_Number;
        this.PASSWORD = PASSWORD;
        this.PersonStatus = PersonStatus;
        this.NameFirst = NameFirst;
        this.NameLast = NameLast;
        this.Dateofbirthday = Dateofbirthday;
        this.TelNumber = TelNumber;
        this.EmailAddress = EmailAddress;
         this.Address = Address;
        this.DoctorID = DoctorID;
    }
    public void setInsurance_Number(String Insurance_Number) {
        this.Insurance_Number = Insurance_Number;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public void setPersonStatus(String PersonStatus) {
        this.PersonStatus = PersonStatus;
    }

    public void setNameFirst(String NameFirst) {
        this.NameFirst = NameFirst;
    }

    public void setNameLast(String NameLast) {
        this.NameLast = NameLast;
    }

    public void setDateofbirthday(String Dateofbirthday) {
        this.Dateofbirthday = Dateofbirthday;
    }

    public void setTelNumber(int TelNumber) {
        this.TelNumber = TelNumber;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public void setDoctorID(int DoctorID) {
        this.DoctorID = DoctorID;
    }

    public String getInsurance_Number() {
        return Insurance_Number;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public String getPersonStatus() {
        return PersonStatus;
    }

    public String getAddress() {
        return Address;
    }

    public String getNameFirst() {
        return NameFirst;
    }

    public String getNameLast() {
        return NameLast;
    }

    public String getDateofbirthday() {
        return Dateofbirthday;
    }

    public int getTelNumber() {
        return TelNumber;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public int getDoctorID() {
        return DoctorID;
    }

    @Override
    public String toString() {
        return "PATIENT{" + "Insurance_Number=" + Insurance_Number + ", PASSWORD=" + PASSWORD + ", PersonStatus=" + PersonStatus + ", NameFirst=" + NameFirst + ", NameLast=" + NameLast + ", Dateofbirthday=" + Dateofbirthday + ", TelNumber=" + TelNumber + ", EmailAddress=" + EmailAddress + ", Address=" + Address + ", DoctorID=" + DoctorID + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.Insurance_Number);
        hash = 31 * hash + Objects.hashCode(this.PASSWORD);
        hash = 31 * hash + Objects.hashCode(this.PersonStatus);
        hash = 31 * hash + Objects.hashCode(this.NameFirst);
        hash = 31 * hash + Objects.hashCode(this.NameLast);
        hash = 31 * hash + Objects.hashCode(this.Dateofbirthday);
        hash = 31 * hash + this.TelNumber;
        hash = 31 * hash + Objects.hashCode(this.EmailAddress);
        hash = 31 * hash + Objects.hashCode(this.Address);
        hash = 31 * hash + this.DoctorID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PATIENT other = (PATIENT) obj;
        if (!Objects.equals(this.Insurance_Number, other.Insurance_Number)) {
            return false;
        }
        if (!Objects.equals(this.PASSWORD, other.PASSWORD)) {
            return false;
        }
        if (!Objects.equals(this.PersonStatus, other.PersonStatus)) {
            return false;
        }
        if (!Objects.equals(this.NameFirst, other.NameFirst)) {
            return false;
        }
        if (!Objects.equals(this.NameLast, other.NameLast)) {
            return false;
        }
        if (!Objects.equals(this.Dateofbirthday, other.Dateofbirthday)) {
            return false;
        }
        if (this.TelNumber != other.TelNumber) {
            return false;
        }
        if (!Objects.equals(this.EmailAddress, other.EmailAddress)) {
            return false;
        }
        if (!Objects.equals(this.Address, other.Address)) {
            return false;
        }
        if (this.DoctorID != other.DoctorID) {
            return false;
        }
        return true;
    }

   
    
    
}
