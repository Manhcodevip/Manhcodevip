/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class Acount {
          private int accID;
    private String email;
    private String password;
    private String fullnameString;
    private int status;
    private String phone;
    private int role;

    public Acount() {
    }

    public Acount(int accID, String email, String password, String fullnameString, int status, String phone, int role) {
        this.accID = accID;
        this.email = email;
        this.password = password;
        this.fullnameString = fullnameString;
        this.status = status;
        this.phone = phone;
        this.role = role;
    }


    public int getAccID() {
        return accID;
    }

    public void setAccID(int accID) {
        this.accID = accID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullnameString() {
        return fullnameString;
    }

    public void setFullnameString(String fullnameString) {
        this.fullnameString = fullnameString;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    } 
}
