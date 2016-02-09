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
    private String prerequisites;
    
    //I overrode the setPrerequisites method because it is abstarct in my 
    //super class. It is abtract because I want the behavior of this method to be different  
    //for this particular class. Since it has no prerequisites, it will alwasy set it to
    //None no matter what the user tries to input.
    @Override
    public void setPrerequisites(String prerequisites) {
        this.prerequisites = "None";
    }   
}
