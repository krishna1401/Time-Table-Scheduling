/*
 * This class provides a Structure for the Courses with following data:
 * 1. id = Unique Course Id
 * 2. name = Course Name
 * 3. maxNumofStudents = Maximum Number of Students in a Course
 */
package dataset;

public class Course {
    private String id;
    private String name;
    private int maxNumofStudents;
    
    public Course(String id,String name,int maxNumofStudents){
        this.id = id;
        this.name = name;
        this.maxNumofStudents = maxNumofStudents;
    }
    
    public String getId(){ return id; }
    public String getName(){ return name; }
    public int getMaxNumOfStudents(){ return maxNumofStudents; }
    @Override
    public String toString(){ return name; }
}
