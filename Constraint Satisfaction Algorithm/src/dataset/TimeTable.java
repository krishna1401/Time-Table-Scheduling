/*
 * This class provides a Structure for the Time Table with following data:
 * 1. id = Unique Id
 * 2. course = Time Table Course
 * 3. class = Array List of all classes
 */
package dataset;

import java.util.ArrayList;

public class TimeTable {
    private String id;
    private Course course;
    private ArrayList<Class> classes;
    
    public TimeTable(String id,Course course){
        this.id = id;
        this.course = course;
    }
    
    public String getId(){ return id; }
    public Course getCourse(){ return course; }
    public ArrayList<Class> getClasses(){ return classes; }
    
    public void addClass(Class addClass){ classes.add(addClass); }
}
