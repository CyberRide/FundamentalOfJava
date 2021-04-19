/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;
import java.util.Scanner;
/**
 *
 * @author heri
 */
class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}
public class Test {
    static void displayAge(int age) throws MyException{
       if (age < 0)
           throw new MyException("Age cannot be less than 0");
       else
           System.out.println("input is vaild");
    }
    public static void main(String args []){
        int c;
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner (System.in);
        c =sc.nextInt();
        try{
        displayAge(c);
        }
        catch(MyException ex){
            System.out.println(ex.getMessage());
        }
    }

}
