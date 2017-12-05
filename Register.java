/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_qlis;

import java.util.Objects;

/**
 *
 * @author rodsa
 */
public class Register {
    
    private String Login ;
    private String PASSWORD;
    private String Status;

   
 public Register() {
      
        this.Login = "";
        this.PASSWORD = "";
        this.Status = " ";
 
    }
    public Register( String Login, String PASSWORD,String Status) {
      
        this.Login = Login;
        this.PASSWORD = PASSWORD;
         this.Status = Status;
    }

  
    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

   

    public String getLogin() {
        return Login;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    @Override
    public String toString() {
        return "Register{" + "Login=" + Login + ", PASSWORD=" + PASSWORD + ", Status=" + Status + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.Login);
        hash = 89 * hash + Objects.hashCode(this.PASSWORD);
        hash = 89 * hash + Objects.hashCode(this.Status);
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
        final Register other = (Register) obj;
        if (!Objects.equals(this.Login, other.Login)) {
            return false;
        }
        if (!Objects.equals(this.PASSWORD, other.PASSWORD)) {
            return false;
        }
        if (!Objects.equals(this.Status, other.Status)) {
            return false;
        }
        return true;
    }

  
   
   
}



