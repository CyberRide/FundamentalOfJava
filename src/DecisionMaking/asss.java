/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionMaking;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author heri
 */

public class asss
{
	 static boolean check(String a)
	{
		a = a.toLowerCase();
		if(a.equals("a") || a.equals("b") || a.equals("c"))
		{
			return true;
		} 
		else
		{
			System.out.println("Please pick A, B, or C");
			return false;
		}
	}
	 static String ask(String[] q) 
	{
		String fmtQuestion = "";
		String answer = "";
		
          for (int i = 0; i < q.length; i++)
			fmtQuestion += q[i] + "\n";		
		do 
		{
                    System.out.println(fmtQuestion);
			Scanner sc = new Scanner(System.in);
                         answer = sc.nextLine();
		}
			
		 while (answer == null || !(check(answer)));
		
		return answer;
	}
	 static boolean correctAnswer(String a, String r) 
	{
		r = r.toUpperCase();
		if(a.equals(r)) 
		{
			System.out.println("Correct!");
			return true;
		}
		else
		{
			System.out.println("The correct answer is: \n" + a);
			return false;
		}
	}
	 static void show(int c, int i)
	{
		int number = c + i;
		String fmtGrade = "";
		
		fmtGrade += "You answered " + c + " correctly and " + i + " incorrectly";
		System.out.println(fmtGrade);
	}

	public static void main(String[] args)
	{
		int i = 0; 
		int correct = 0;
		int incorrect = 0;
		String response ="";
		String[][] fmtQuestion = new String[5][4];
		String[]answer = new String[5];
		
		fmtQuestion[0][0] = "Which one of these is not a primitive data type?";
		fmtQuestion[0][1] = "A) integer";
		fmtQuestion[0][2] = "B) char";
		fmtQuestion[0][3] = "C) String";
		answer[0] = "C";
		
		fmtQuestion[1][0] = "Java source code is stored in files with what extension?";
		fmtQuestion[1][1] = "A) .class";
		fmtQuestion[1][2] = "B) .java";
		fmtQuestion[1][3] = "C) .jav";
		answer[1] = "B";
		
		fmtQuestion[2][0] = "The best environment for developing Java applications is?";
		fmtQuestion[2][1] = "A) A UNIX server hosted by a corporate entity";
		fmtQuestion[2][2] = "B) Eclipse IDE";
		fmtQuestion[2][3] = "C) Whatever you are most comfortable in";
		answer[2] = "C";
		
		fmtQuestion[3][0] = "Java can be used to write?";
		fmtQuestion[3][1] = "A) Web Applications";
		fmtQuestion[3][2] = "B) Desktop programs";
		fmtQuestion[3][3] = "C) All of the above";
		answer[3] = "C";
		
		fmtQuestion[4][0] = "Which GUI toolkit comes included with Java?";
		fmtQuestion[4][1] = "A) Swing";
		fmtQuestion[4][2] = "B) Gtk";
		fmtQuestion[4][3] = "C) JavaFX";
		answer[4] = "A";
		do 
		{
			response = ask(fmtQuestion[i]);
			if(correctAnswer(answer[i], response))
				correct += 1;
			else
				incorrect += 1;
                        
			
			i++;
		} while(i < fmtQuestion.length);
		
		show(correct, incorrect);
	}
}