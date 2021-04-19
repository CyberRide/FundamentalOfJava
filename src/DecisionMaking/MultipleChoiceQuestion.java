/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionMaking;

/**
 *
 * @author heri
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class MultipleChoiceQuestion {
    static int nQuestions = 0;
    static int nCorrect = 0;
// method declaration
     public static String ask(String question)
     {
      
 String answer ="";
while (answer.equals("")){
    System.out.println(question);
    Scanner sc = new Scanner (System.in);
answer =  sc.nextLine();
  
answer = answer.toUpperCase();
if (answer.equals("A") ||answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")){
}
else 
 {
     System.out.println("Invalid answer. Please try again");
    }
      } 
     return answer.toUpperCase();
     }
 static void check(String question, String correctAnswer){
     String q1;
     String q2;
     String q3;
        String answer = ask(question);
       // nQuestions = question.length();
       nQuestions++;
         if(answer.equals(correctAnswer)){
             System.out.println("Correct");
         nCorrect ++;
                 }
         else {
             System.out.println("Incorrect. The correct answer is "+correctAnswer);

         }     
 
        
     }
 
    public static void main(String args[]){
        
        String q1 = "Java declaration statement must end with?\n(a) Comma\n(b) Colon\n(c) Semicolon\n(d) Fullstop\n(e) None\n";
        String q2 = "The loop keyword of java is\n(a) Orange\n(b) While\n(c) Byte\n(d) Double\n(e) Float\n";
        String q3 = "Which one of the following languages is pure object oriented language?\n(a) Java\n(b) C++\n(c) Pascal\n(d) C\n(e) Static\n";
check(q1,"C");
check(q2,"B");
check(q3,"A");
System.out.println(+nCorrect+" correct answers out of "+nQuestions);
  
}

} 
    