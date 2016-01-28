package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      Juan Carrillo
 * @version     1.00
 */
public class IntroJavaCourse implements ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }
    
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
