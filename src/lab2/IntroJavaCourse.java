package lab2;

/**
 * The IntroJavaCourse class overrides the methods from the super class
 * Programming Course. The only methods it does not override are the two methods 
 * for the prerequisites because not all the classes that implement from 
 * ProgrammingCourse have prerequisites.
 *
 * @author      Juan Carrillo
 * @version     1.00
 */
public class IntroJavaCourse implements ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;


    //overrides all methods from interface
    @Override
    public String getCourseNumber() {
        return courseNumber;
    }
    
    @Override
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    
    @Override
    public double getCredits() {
        return credits;
    }
    
    @Override
    public void setCredits(double credits) {
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
        this.prerequisites = prerequisites;
    }
    
    @Override
    public String getCourseName() {
        return courseName;
    }
    
    @Override
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    
}
