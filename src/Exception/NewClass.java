/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author heri
 */
import java.util.Scanner;
public class NewClass {
    void CheckAge(int age){
        if(age < 18) throw new ArithmeticException("Not Eligible ");
        else{
            System.out.println("Eligible for voting");
            
        }
    }
    public static void main(String args []){
        int c;
        System.out.println("Enter Your Age");
        
        Scanner sc = new Scanner (System.in);
        c =sc.nextInt();
        
        
        
        NewClass old = new NewClass();
        try{
        old.CheckAge(c);
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
}
