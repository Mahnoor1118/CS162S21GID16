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
public class Person {
    private String name;
    private String phNo;
    private String cnic;
    private String gender;
    
    //getter setters 

    public String getName() {
        return name;
    }

    public String getPhNo() {
        return phNo;
    }

    public String getCnic() {
        return cnic;
    }

    public String getGender() {
        return gender;
    }
    
    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
