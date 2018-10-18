/*
 * This class provides a Structure for the Courses with following data:
 * 1. id = Unique Course Id
 * 2. name = Course Name
 * 3. maxNumofStudents = Maximum Number of Students in a Course
 * 4. subjects = Subjects to be taught
 */
package dataset;

import java.util.ArrayList;

public class Course {
    private String id;
    private String name;
    private ArrayList<Subject> subjects;
    private int maxNumofStudents;
    
    public Course(String id,String name,ArrayList<Subject> subjects,int maxNumofStudents){
        this.id = id;
        this.name = name;
        this.subjects = subjects;
        this.maxNumofStudents = maxNumofStudents;
    }
    
    public String getId(){ return id; }
    public String getName(){ return name; }
    public ArrayList<Subject> getSubjects(){ return subjects; }
    public int getMaxNumOfStudents(){ return maxNumofStudents; }
    @Override
    public String toString(){ return name; }
}
