/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Scanner;

/**
 *
 * @author heri
 */

class Sample{
    
    int matNo;
    String name;

    public Sample(int matNo, String name) {
        this.matNo = matNo;
        this.name = name;
    }
    
    
void add (){
int a,b;
// accept input from users
Scanner sc = new Scanner(System.in);
System.out.println("This is the parent class...........");
System.out.println("Enter a number");
a = sc.nextInt();
System.out.println("Enter another number");
b = sc.nextInt();
int sum = a+b;

System.out.println("The sum of " +a+ " and " +b+ " is " +sum);
}

}
public class inheritSample extends Sample{
    String course;

    public inheritSample(String course, int matNo, String name) {
        super(matNo, name);
        this.course = course;
    }
    void add(){
   super.add();
    System.out.println("This is the child class");
    }
    void display(){
    System.out.println("Displaying Information in the Child class.....");
    System.out.println("Matric Number: " +matNo);
    System.out.println("Name: " +name);
    System.out.println("Course: " +course);
    }
    
    
    public static void main(String [] args){
    inheritSample inS = new inheritSample("Java",10,"Ayomide");
    inS.add();
    inS.display();
    }
    
    
    
}
