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
        lab2.IntroToProgrammingCourse course1 = new lab2.IntroToProgrammingCourse("IntroToProgramming", "CRN100");
        lab2.IntroJavaCourse course2 = new lab2.IntroJavaCourse("IntroJava", "CRN101");
        lab2.AdvancedJavaCourse course3 = new lab2.AdvancedJavaCourse("AdvancedJava", "CRN102");
        
        System.out.println(course1.getCourseName()+ ' '+course1.getCourseNumber());
        System.out.println(course2.getCourseName()+ ' '+course2.getCourseNumber());
        System.out.println(course3.getCourseName()+ ' '+course3.getCourseNumber());
        
        //Liskov's substitution principle can be beneficial if the class you 
        //instatiate inherits and only contains the methods from the superclass.
        //You might need to use a method that only belongs to the sub class 
    }
}
