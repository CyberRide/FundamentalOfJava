/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.z
 */
package Arraylist;
import java.util.ArrayList;
/**
 *
 * @author heri
 */
public class Boxing {
             void Autoboxing(){
	char ch = 'a'; 
		// Autoboxing- primitive to Character object conversion 
		Character a = ch; 
		ArrayList<Integer> arrayList; 
                 arrayList = new ArrayList<>();
		// Autoboxing because ArrayList stores only objects 
		arrayList.add(25); 
		// printing the values from object 
		System.out.println(arrayList.get(0)); 
}
void unboxing (){
Character ch = 'a'; 
        // unboxing - Character object to primitive conversion 
        char a = ch; 
        ArrayList<Integer> arrayList = new ArrayList<>(); 
        arrayList.add(24); 
          // unboxing because get method returns an Integer object 
int num = arrayList.get(0); 
         // printing the values from primitive data types 
        System.out.println(num);
}
	public static void main(String[] args) 
	{ 
	 Boxing bx = new Boxing();
	bx. Autoboxing();
	bx. unboxing();
 	} 
}
