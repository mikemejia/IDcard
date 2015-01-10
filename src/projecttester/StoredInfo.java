/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttester;
import java.awt.*;
import javax.swing.*;
import java.io.*;
//this Class stores the Info of the student and will soon store the image 
//of the student
/**
 *
 * @author Mike
 */
public class StoredInfo {
    private static String lastName;
    private static String firstName;
    private static String iD;
   // Private location for the student id
    //one more string for location of students image
    
    public String getLast(){
        String r = "";
        char[]Entry = lastName.toCharArray();
     for(int b = 0; b < Entry.length; b++ ){
         if(b == 0){Entry[b] = Character.toUpperCase(Entry[b]);}
         else
          Entry[b] = Character.toLowerCase(Entry[b]);
             
         r = r + Entry[b];
     }
    return r;
    }
    public String getFirst(){
        String r = "";
        char[]Entry = firstName.toCharArray();
     for(int b = 0; b < Entry.length; b++ ){
         if(b == 0){Entry[b] = Character.toUpperCase(Entry[b]);}
         else
          Entry[b] = Character.toLowerCase(Entry[b]);
             
         r = r + Entry[b];
     }
    return r;
    }
    public String getID(){
    return iD;
    }
    public void setLast(String a){
    this.lastName= a; 
    }
    public void setFirst(String a){
    this.firstName = a; 
    }
    public void setID(String a){
    this.iD = a; 
    }
           
    
    
}
