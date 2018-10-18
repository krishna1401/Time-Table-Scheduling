/*
 * This class provides a Structure for the Class i.e. the subject of a course to be assigned with teacher and room.
 * Information:
 * 1. id = Unique Class id
 * 2. course = Course to be placed in class
 * 3. subject = Subject to be taught
 * 4. room = Room Assigned
 * 5. teacher = Teacher Assigned
 */
package dataset;

public class Class {
    private String id;
    private Course course;
    private Subject subject;
    private Room room;
    private Teacher teacher;
    
    public Class(String id,Course course){
        this.id = id;
        this.course = course;
    }
    
    public void setSubject(Subject subject){ this.subject = subject; }
    public void setRoom(Room room){ this.room = room; }
    public void setTeacher(Teacher teacher){ this.teacher = teacher; }
    
    public String getId(){ return id; }
    public Course getCourse(){ return course; }
    public Subject getSubject(){ return subject; }
    public Room getRoom(){ return room; }
    public Teacher getTeacher(){ return teacher; }
    @Override
    public String toString(){
        return "["+course.getName()+","+subject.getName()+","+room.getId()+","+teacher.getName()+"]";
    }
}