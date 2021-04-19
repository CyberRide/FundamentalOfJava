/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Arr {
//Declare a single-dimensional array named marks
int marks[]; // line 1
/**
* Instantiates and initializes a single-dimensional array
*
* @return void
*/
public void storeMarks() {
// Instantiate the array
marks = new int[4]; // line 2
System.out.println("toring Marks. Please wait...");
// Initialize array elements
marks[0] = 65; // line 3
marks[1] = 47;
marks[2] = 75;
marks[3] = 50;
}
public void displayMarks() {
System.out.println("Marks are:");
// Display the marks
System.out.println(marks[0]);
System.out.println(marks[1]);
System.out.println(marks[2]);
System.out.println(marks[3]);
}
public static void main(String[] args) {
//Instantiate class OneDimension
Arr oneDimenObj = new Arr(); //line 4
//Invoke the storeMarks() method
oneDimenObj.storeMarks();
oneDimenObj.displayMarks();
}
}
