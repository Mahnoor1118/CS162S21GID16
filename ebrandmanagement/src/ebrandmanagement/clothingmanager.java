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
public class clothingmanager extends Manager {
    private String clothcode;
    private String clothdetail;
    private String amount;
    private String cost;
    
    //getter setter

    public String getClothcode() {
        return clothcode;
    }

    public String getClothdetail() {
        return clothdetail;
    }

    public String getAmount() {
        return amount;
    }

    public String getCost() {
        return cost;
    }

    public void setClothcode(String clothcode) {
        this.clothcode = clothcode;
    }

    public void setClothdetail(String clothdetail) {
        this.clothdetail = clothdetail;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
    
    

    
}
