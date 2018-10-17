/*
 * This class provides a Structure for the Subjects with following data:
 * 1. id = Unique Subject Id
 * 2. name = Subject Name
 * 3. teacherId = Teacher Id that will teach a particular subject
 * 4. timeDuration = Time Duration required to complete the subject (in hrs)
 */
package dataset;

public class Subject {
    private String id;
    private String name;
    private String teacherId;
    private int timeDuration;
    
    public Subject(String id,String name,String teacherId,int timeDuration){
        this.id = id;
        this.name = name;
        this.teacherId = teacherId;
        this.timeDuration = timeDuration;
    }
    
    public String getId(){ return id; }
    public String getName(){ return name; }
    public String getTeacherId(){ return teacherId; }
    public int getTimeDuration(){ return timeDuration; }
    @Override
    public String toString(){ return name; }
}
