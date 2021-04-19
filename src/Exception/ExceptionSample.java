package Exception;

import java.util.Scanner;
public class ExceptionSample {
   
    void div(){
      
     int a,b;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter first value");
     a = sc.nextInt();
     System.out.println("Enter second value");
     b = sc.nextInt();
    int c = a/b;
    System.out.println(c);
    }

    
    void arr(){
        try{
    int [] marks = new int[4];
    int i = marks[4];
    System.out.println(i);
    
    }   
catch(Exception ex){
System.out.println("Wrong index call");
System.out.println(ex.getMessage());
}   
    }
    public static void main(String args[]){
    ExceptionSample es = new ExceptionSample();
    //es.div();
    es.arr();
    }
}
