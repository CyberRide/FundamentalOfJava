/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionMaking;

/**
 *
 * @author DYNAMIC BEAUTY
 */

import javax.swing.JOptionPane;

public class Quiz1 {
    // main method
    public static void main(String args[]){
    	// question declaration
     String question = "To accept input from user, you must import? \n"
            + "(a) import java.util.Scanner;\n"
            + "(b) import java.*.JOptionPane;\n"
            + "(c) import java.*;\n"
            + "(d) import javac.swing.*;\n";
    
 // answer variable declaration
 String answer = "";
// while statement to loop through the user input till he gets the correct answer
 while (!answer.equals("A")){
       
        answer = JOptionPane.showInputDialog(null,question); 
  
    answer = answer.toUpperCase();
  
    if(answer.equals("A")){
        
JOptionPane.showMessageDialog(null,"Correct"); 
    }
    else if (answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")){
    
    JOptionPane.showMessageDialog(null,"Incorrect answer. Please enter A, B, C, D, or E");
    }
    else 
    {
   JOptionPane.showMessageDialog(null,"Invalid answer. Please try again");

    }
 }
}

} 
   
