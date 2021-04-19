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
public class Throwsample {
    void add() throws ArithmeticException{
        int a=5;
        int b=0;
        int c=a/b;
        System.out.println(c);
    }
    public static void main (String args[]){
        Throwsample sc = new Throwsample();
        try {
       sc.add();
    
        }   
    catch(ArithmeticException ex){
       System.out.println(ex.getMessage());
} 
                
    }
            
}
