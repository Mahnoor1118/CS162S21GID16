/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebrandmanagement;

import java.util.ArrayList;

/**
 *
 * @author fatym
 */
public class Studio {
    private static Studio instance ;
    public ArrayList<Manager> managerList = new ArrayList<>();
    public ArrayList<designer> designerList = new ArrayList<>();
    public ArrayList<worker> workerList=new ArrayList<>();
    
    public static Studio getInstance(){
        if(instance==null)
        {
            instance =new Studio();
        }
        return instance;
    }
    
    public void addManager(Manager a)
    {
        managerList.add(a);
    }
    
    public void deleteManager(int a)
   {
       managerList.remove(a);
   }
   
   public void updateManager(Manager b, int a )
   {
       managerList.set(a,b); 
       
   }
   
   public void addDesigner(designer a)
    {
        designerList.add(a);
    }
    
    public void deleteDesigner(int a)
   {
       designerList.remove(a);
   }
   
   public void updateDesigner(designer b, int a )
   {
       designerList.set(a,b); 
       
   }
   
   public void addWorker(worker a)
    {
        workerList.add(a);
    }
   
   public void updateWorker(worker b, int a )
   {
       workerList.set(a,b); 
   }
     
    public void deleteWorker(int a)
   {
       workerList.remove(a);
   }
}
