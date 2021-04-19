/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heri
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Quiz {    
    public static void main(String[] args) {  
        
        MultipleChoiceQuestion question = new MultipleChoiceQuestion("What is a quiz?",
        "a test of knowledge, especially a brief informal test given to students",
        "42",
        "a duck",
        "to get to the other side",
        "To be or not to be, that is the question.",
        "a");
        question.check();      
        question.showResults();
        MultipleChoiceQuestion question1 = new MultipleChoiceQuestion("Java declaration statement must end with?",      
        "comma",
        "Colon",
        "Semicolon",
        "Fullstop" ,
        "None",
        "c");      
        question1.check();      
        question1.showResults();      
        MultipleChoiceQuestion question2 = new MultipleChoiceQuestion("The loop keyword of java is?",      
        "Orange",
        "While",
        "Byte",
        "Double", 
        "Float",
        "b");      
        question2.check();      
        question2.showResults();      
        MultipleChoiceQuestion question3 = new MultipleChoiceQuestion("Which one of the following languages is pure object oriented language?",      
        "Java",
        "C++",
        "Pascal",
        "c",
        "Static",
        "a");
        question3.check();      
        question3.showResults();    
        } 
    }