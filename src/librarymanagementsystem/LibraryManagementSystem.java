/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

/**
 *
 * @author WAY4WARD
 */
public class LibraryManagementSystem {

   
         public static void main(String[] args) {
         Loading id = new Loading();
     id.setVisible(true);
    
      try{
            for(int i=0;i<=100;i++){
                Thread.sleep(80);
                id.jLabel2.setText(Integer.toString(i)+"%");
                id.jProgressBar1.setValue(i);
                
                if(i==100){
                    id.setVisible(false);
                     Login lg = new Login();
                    lg.setVisible(true);
                   
                }
            }
        }catch(Exception e){ 
      }
    
    }
}
    
    

