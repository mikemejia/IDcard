/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttester;
import javax.swing.*;
import java.awt.event.*;
/**
 * this class creates the first frame that will ask the user for there first and 
 * last name with there id 
 *
 * @author Mike
 */
public class StudentInfo extends JFrame {
    private JPanel panel;
    private JLabel LastNameMessage, FirstNameMessage, StudentID;
    private JTextField LastNameTextField, FirstNameTextField, StudentIDTextField;
    private String LastEntry, FirstEntry;//string for the first name and last name
    private JButton calcButton;
    private final int WINDOW_WIDTH = 250;
    private final int WINDOW_HEIGHT = 300;
    public StudentInfo(){
        setTitle("Student ID creator");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buildPanel();
        add(panel);
        setVisible(true);
        
        
    
     }
/*the ActionListener will wait for the "Generate" button to be pressed
 it will retrieve the text from the first and last name text box and the id
 text box*/
    private class CalcButtonListener implements ActionListener {
        StoredInfo info = new StoredInfo();//creates an instance of studentInfo
        //which will store the last, first, and id for the Pic class
  public void actionPerformed(ActionEvent e)
  { UserEntryTester TT = new UserEntryTester();
    String inputLAST, inputFirst, inputID;
    Boolean checker = true;
    inputLAST = LastNameTextField.getText();
    boolean result = TT.tester(inputLAST);//test if it is all letters
    inputFirst = FirstNameTextField.getText();
    boolean result1 = TT.tester(inputFirst);
    inputID = StudentIDTextField.getText();
    boolean result2 = TT.IDtester(inputID);//tests if its length is 8 and isDigit
    if(result == false || result1== false || result2 == false)
        checker = false;// if any of the inputs are false than the id will not
    //be generated.
    /*
     if true the students info is set to the stored info class for the Pic
     class*/
    if (checker == true){
    info.setFirst(FirstNameTextField.getText());
    info.setLast(LastNameTextField.getText());
    info.setID(StudentIDTextField.getText());
    Pic image = new Pic(info);//an instance of the pic class is generated
    
    }
  
    
    //setVisible(false);
   
    
   }
    }
    /*Creates the JLabels asking the student for first/last name and there
     * student id
     */
   private void buildPanel(){
  
  LastNameMessage = new JLabel("Please Enter your Last Name:");
  LastNameTextField = new JTextField(10);
  FirstNameMessage = new JLabel("Please Enter your First Name:");
  FirstNameTextField = new JTextField(10);
  StudentID = new JLabel("Please Enter your Student ID:");
  StudentIDTextField = new JTextField(10);
  calcButton = new JButton("Generate");
  calcButton.addActionListener(new CalcButtonListener());//calls on the private
  //inner class when the button is clicked
  panel = new JPanel();
  
  panel.add(LastNameMessage);
  panel.add(LastNameTextField);
  panel.add(FirstNameMessage);
  panel.add(FirstNameTextField);
  panel.add(StudentID);
  panel.add(StudentIDTextField);
  panel.add(calcButton);
  }
    

}