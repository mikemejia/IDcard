/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttester;
import javax.swing.*;
import java.awt.*;

import java.io.*;
/**
 *
 * @author Mike
 */
public class UserEntryTester {
    /*Tests the input of the user for the first and last name
     */
    public boolean tester(String a){
      boolean t = true;
      char[]Entry = a.toCharArray();
     for(int b = 0; b < Entry.length; b++ ){
        t = Character.isLetter(Entry[b]);
        if(t == false){
            JOptionPane.showMessageDialog(null, "Check Your last/First"
                    + " Name");
            break;}
        
    }
      return t;
    }
    /*Tests if the id of the user is numeric and if its the correct length 
     * of 8.
     * will create a message diaglog box with the error that is created.
     */
    public boolean IDtester(String a){
     boolean t = true;
     if(a.length() < 8 || a.length() > 8){
     t = false;
     JOptionPane.showMessageDialog(null, "Wrong Length Correct ID: Length of "
             + "8");
            
     return t;
     }
     //changes entry into a char array to go through each element and determine 
     //if it is a digit
     char[]Entry = a.toCharArray();
     for(int b = 0; b < Entry.length; b++ ){
        t = Character.isDigit(Entry[b]);
        if(t == false){
            JOptionPane.showMessageDialog(null, "Correct ID only numeric input");
            break;}
    }
      return t;
    }
    
    
}
