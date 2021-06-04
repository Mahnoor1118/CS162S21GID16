/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebrandmanagement;

import java.util.ArrayList;

/**
 *
 * @author samyan
 */
public class Ebrandmanagement {
    static Ebrandmanagement e = null;
    public static Ebrandmanagement getInstance() {
        if (e == null) {
            e = new Ebrandmanagement();
            return e;

        }
        return e;

    }
    private Ebrandmanagement() {

    }

    private final ArrayList<Manager> man = new ArrayList<>();

   

    public ArrayList<Manager> getMan() {
        return man;
    }
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         MainMenu Frame1 = new MainMenu();
        Frame1.setVisible(true);
        
    }
    
}
