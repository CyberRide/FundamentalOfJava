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
public class java {
    public static void main(String args[]){
      String  FName;
      String last;
      int age;
      //To Accept input from users
      Scanner in = new Scanner(System.in);
       System.out.print("Enter Your First Name : ");
		    FName = in.nextLine();
       System.out.print("Enter Your Last Name : ");
        last = in.nextLine();
        System.out.print("Enter Your Age : ");
        age = in.nextInt();
        System.out.println(" ");
        System.out.println("First Name: " + FName);
        System.out.println("MLast Name: " + last);
        System.out.println("Age: " + age);
        
        
    }
    
    
    
    
}
