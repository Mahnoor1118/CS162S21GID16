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
public abstract class Person {
    
    
    //getter setters 

    public abstract String getName() ;

    public abstract String getPhNo();

    public abstract String getCnic() ;

    public abstract String getGender() ;
       
    public abstract String getSalary() ;
    
    //setters

    public abstract void setName(String name) ;

    public abstract void setPhNo(String phNo);

    public abstract void setCnic(String cnic) ;

    public abstract void setGender(String gender);
            
    public abstract void setSalary(String salary) ;

}
