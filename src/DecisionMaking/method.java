/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionMaking;

/**
 *
 * @author heri
 */// instance variables
public class method {
/**    String name;
    String course;
    String department;
//instance method
    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Department: " + department);
    }
    public static void main(String args[]){
        method met = new method();
        met.name="Ayo";
        met.course="Java";
        met.department="Software Engineering";
        met.displayDetails();
    }
    
}
// note ; To invoke a method the object name is followed by the (.) operator and the methodname*/
static int add(){
    int a=5;
    int b=6;
    int sum=a+b;
    System.out.println(sum);
    return sum;
}
static int add (int a, int b){
    int sum=a+b;
    System.out.println(sum);
    return sum;
}
public static void main(String args[]){
    method met = new method();
    met.add();
    add(8,12);
}
}
// Static 
