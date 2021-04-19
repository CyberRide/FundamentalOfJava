/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionMaking;
import java.util.Scanner;

/**
 *
 * @author heri
 */
public class Ass {
       public static void main(String[] args)

{
   int i;
   int j,n;
   System.out.print("Input number of patterns : ");
  Scanner in = new Scanner(System.in);
		    n = in.nextInt();

   for(i=0;i<=n;i++)
   {
	for(j=0;j<=i;j++)
	  System.out.print("*");

    System.out.println("");
    }
}
}
    

