/*
 * This class provides a Structure for the Subjects with following data:
 * 1. id = Unique Subject Id
 * 2. name = Subject Name
 * 3. teacher = Teacher that will teach a particular subject
 * 4. timeDuration = Time Duration required to complete the subject (in hrs)
 */
package dataset;

public class Subject {
    private String id;
    private String name;
    private Teacher teacher;
    private int timeDuration;
    
    public Subject(String id,String name,Teacher teacher,int timeDuration){
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.timeDuration = timeDuration;
    }
    
    public String getId(){ return id; }
    public String getName(){ return name; }
    public Teacher getTeacher(){ return teacher; }
    public int getTimeDuration(){ return timeDuration; }
    public void decrementTimeDuration(){ timeDuration -= 1; }
    
    @Override
    public String toString(){ return name; }
}
