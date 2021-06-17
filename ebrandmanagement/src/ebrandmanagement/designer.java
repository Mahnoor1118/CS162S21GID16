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
public class designer extends Person{
    
    private String email;
    private String experience;
    private String qualification;
    private String username;
    private String password;
    private String Name;
    private String PhoneNumber;
    private String CNIC;
    private String Gender;
    private String Salary;
    
    //getter setter

    public String getEmail() {
        return email;
    }

    public String getExperience() {
        return experience;
    }

    public String getQualification() {
        return qualification;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getName() {
        return Name;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPhNo() {
        return PhoneNumber; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCnic() {
        return CNIC;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getGender() {
       return Gender; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String Name) {
       this.Name= Name; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPhNo(String PhoneNumber) {
        this.PhoneNumber= PhoneNumber; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCnic(String CNIC) {
        this.CNIC= CNIC; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setGender(String Gender) {
        this.Gender= Gender; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSalary() {
        return Salary; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSalary(String Salary) {
        this.Salary= Salary; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
