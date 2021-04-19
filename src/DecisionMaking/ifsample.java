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
public class ifsample {
    public static void main (String args[]){
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
        num=s.nextInt();
        if (num < 10) { System.out.println("Number is less Than 10");
        }
        else {System.out.println("Number is Equal to 10");
        }
}
}
    
