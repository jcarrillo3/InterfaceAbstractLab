package lab2;

import javax.swing.JOptionPane;

/**
 * The AdvancedJavaCourse class overrides the methods from the super class
 * Programming Course. The only methods it does not override are the two methods 
 * for the prerequisites because not all the classes that implement from 
 * ProgrammingCourse have prerequisites.
 *
 * @author      Juan Carrillo
 * @version     1.00
 */
public class AdvancedJavaCourse implements ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }
    
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
    
    //this method is not from the interface
    //not all courses need prerequisites
    public String getPrerequisites() {
        return prerequisites;
    }
    
    //this method is not from the interface
    //not all courses need prerequisites
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
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
