/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionMaking;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author heri
 */
public class b {
   public static void main(String[] args)
{
   int i, col, row;
   System.out.print("Input number of patterns : ");
   Scanner s = new Scanner(System.in);
   row = s.nextInt();
   for(i=1;i<=row;i++)
   {
	for(col=1;col<=i;col++)
	  System.out.print(" * ");

    System.out.println("");
    }
}
}
