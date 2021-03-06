package lab2;

import javax.swing.JOptionPane;

/**
 * This class overrides all the methods from the super class. It keeps all its properties
 * since the super class is an interface.
 *
 * @author      Juan Carrillo
 * @version     1.00
 */
public class IntroToProgrammingCourse implements ProgrammingCourse{
    private String courseName;
    private String courseNumber;
    private double credits;
    
    //overrides all methods from interface
    @Override
    public String getCourseNumber() {
        return courseNumber;
    }
    
    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    
    @Override
    public double getCredits() {
        return credits;
    }
    
    @Override
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
    @Override
    public String getCourseName() {
        return courseName;
    }
    
    @Override
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    
}
