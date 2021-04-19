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
public class b2 {
   public static void main(String[] args)
   {
      String Ans;     
      String  name = "David";   
      String choice;
      Scanner s = new Scanner(System.in);

      do
      {
         System.out.print("What's My Name: ");
         Ans = s.nextLine();
         System.out.print("Enter Y for yes or N for no: ");
         choice = s.nextLine();
         if(Ans.equals(name) )
         {
             System.out.println("You Are Correct");
         }
         else if (choice.equals("Y"))
         {
             System.out.print("What's My Name: ");
             Ans = s.nextLine(); 
           if  (Ans.equals(name))
         {
             System.out.println("You Are Correct");
             break;
         } 
         }
          else if (choice.equals("N"))
          {
              break;
          }
      }
      while ((Ans.equals(name)) || (Ans.equals(name)));
   }
   
}
    

