/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Juan
 */
public class StartUp {
    public static void main(String[] args) {
        IntroToProgrammingCourse course1 = new IntroToProgrammingCourse("IntroToProgramming", "CRN100");
        IntroJavaCourse course2 = new IntroJavaCourse("IntroJava", "CRN101");
        AdvancedJavaCourse course3 = new AdvancedJavaCourse("AdvancedJava", "CRN102");
        
        System.out.println(course1.getCourseName()+ ' '+course1.getCourseNumber());
        System.out.println(course2.getCourseName()+ ' '+course2.getCourseNumber());
        System.out.println(course3.getCourseName()+ ' '+course3.getCourseNumber());
        
    }
}
