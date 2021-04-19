/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist;
import java.util.Scanner;

/**
 *
 * @author heri
 */
public class StringSample {
    
StringBuilder str = new StringBuilder();


    
    public void displayStrings(){
  String str;
  String concat;
Scanner sc = new Scanner(System.in);  
System.out.println("Enter Anything");
        str = sc.nextLine();
 System.out.println(str.indexOf(str));
 System.out.println("String length is:"+ str.length());
 System.out.println("Character at index 2 is:"+ str.charAt(2));
 System.out.println("Enter anything to concat");
         concat =sc.nextLine();
 System.out.println("Concatenated string is:"+ str.concat(concat));
 System.out.println("String comparison is:"+ str.compareTo(concat));
 System.out.println("Last index of str is:"+ str.lastIndexOf("str"));
 System.out.println("Replaced string is:"+ str.replace('v','a'));
 System.out.println("Substring is:"+ str.substring(2, 5));


}
public static void main(String[] args) {
StringSample objStrBuild = new StringSample();
objStrBuild.displayStrings();
}
}
   
