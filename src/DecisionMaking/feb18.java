/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionMaking;

/**
 *
 * @author heri
 */
// classname objname = new classname();
// Method are function declear in class
//Note:Instance variables are accessed by object using dot(.) operator
//Syntax OF MEthod
/**accesspecifer returntype method /name(with/without parameters){
statement;}
*/
//Private:only within the class
//Public:visible to the class/other class within the package
//Protected:visible to the class and the class that inherit the class
//parameters are variable pass in a method; two type of parameters 1; formal 2; actual:which are call arguement
public class feb18
{
    int a; int b;
    public static void main(String args[]){
        feb18 fe = new feb18();
        fe.a=5;
        fe.b=10;
        System.out.println("value of a is " + fe.a);
        System.out.println("value of b is " +fe.b);
    }
    
}
