package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse{
    
    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        super(courseName, courseNumber, credits);
    }
    
 
    @Override
    public String getCourseNumber() {
        return "CRN-100";
    }

    @Override
    public double getCredits() {
        return 4;
    }

    @Override
    public String getCourseName() {
        return "Intro to Programming";
    }

    @Override
    public String getPrerequisites() {
        return "None";
    }
    
}
