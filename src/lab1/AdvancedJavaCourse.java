package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse{

    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName, courseNumber, credits, prerequisites);
    }
    
    @Override
    public String getPrerequisites() {
        return "Java Programming";
    }

    @Override
    public String getCourseName() {
        return "Advanced Java Programming";
    }

    @Override
    public String getCourseNumber() {
        return "L117_2";
    }

    @Override
    public double getCredits() {
        return 4;
    }

    
}
