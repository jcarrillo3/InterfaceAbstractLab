package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse{

    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName, courseNumber, credits, prerequisites);
    }

    @Override
    public String getCourseNumber() {
        return "L117";
    }

    @Override
    public double getCredits() {
        return 4.0;
    }

    @Override
    public String getPrerequisites() {
        return "Intro to Programming";
    }

    @Override
    public String getCourseName() {
        return "Java Programming";
    }


}
