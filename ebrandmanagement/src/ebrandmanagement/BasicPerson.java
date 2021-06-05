/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebrandmanagement;

/**
 *
 * @author fatym
 */
public abstract class BasicPerson extends Person {
    private String name;
    private String phNo;
    private String cnic;
    private String gender;
    private String salary;
    
    
   

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the phNo
     */
    public String getPhNo() {
        return phNo;
    }

    /**
     * @param phNo the phNo to set
     */
    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    /**
     * @return the cnic
     */
    public String getCnic() {
        return cnic;
    }

    /**
     * @param cnic the cnic to set
     */
    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
     public  String getSalary() {
        return salary;
    }

    
    public void setSalary(String salary) {
        this.salary = salary;
    }

    
    //abstract method
    public abstract String getUsername() ;
    
    public abstract String getPassword() ;

    public abstract String getQualification() ;
    
    public abstract String getEmail();
    
    public abstract void setEmail(String Email) ;
    
    public abstract void setUsername(String username) ;

    public abstract void setPassword(String password) ;

    public abstract void setQualification(String qualification) ;

}
