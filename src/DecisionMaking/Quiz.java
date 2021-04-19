/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionMaking;

import java.util.Scanner;



/**
 *
 * @author DYNAMIC BEAUTY
 */

import javax.swing.JOptionPane;

public class Quiz {
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
     Scanner sc = new Scanner(System.in);
      System.out.println(question);   
        answer = sc.nextLine();
  
    answer = answer.toUpperCase();
  
    if(answer.equals("A")){
        
System.out.println("Correct");      
    }
    else if (answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")){
    
    System.out.println("Incorrect answer. Please enter A, B, C, D, or E");
    }
    else 
    {
   System.out.println("Invalid answer. Please try again");

    }
 }
}

} 
   