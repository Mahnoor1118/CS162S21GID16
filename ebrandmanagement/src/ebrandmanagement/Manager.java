/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebrandmanagement;

/**
 *
 * @author MAHNOOR SHAD
 */
public class Manager extends BasicPerson {
    private String username;
    private String password;
    private String qualification;
    private String categoury;
    private String Email;
    //private String salary;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getQualification() {
        return qualification;
    }

    public String getCategoury() {
        return categoury;
    }

    

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setCategoury(String categoury) {
        this.categoury = categoury;
    }

    
    public String getEmail() {
        return Email;
    }

    
    public void setEmail(String Email) {
        this.Email = Email;
    }

   
    

    
    
    
}
