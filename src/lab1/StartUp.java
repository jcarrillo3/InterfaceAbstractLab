/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Juan
 */
public class StartUp {
    public static void main(String[] args) {
        
        //this architecture can look a bit messy or not very professional
        //this architecture is very easy to understand
        
        IntroToProgrammingCourse c1 = new IntroToProgrammingCourse();
        
        c1.setPrerequisites("Hello");
        
        System.out.println(c1.getPrerequisites());
        
        //Liskov's substitution principle can be beneficial if the class you 
        //instatiate inherits and only contains the methods from the superclass.
        //You might need to use a method that only belongs to the sub class 
        
    }
}
