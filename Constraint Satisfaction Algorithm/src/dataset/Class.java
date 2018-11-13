/*
 * This class provides a Structure for the Class i.e. the subject of a course to be assigned with teacher and room.
 * Information:
 * 1. id = Unique Class id
 * 2. course = Course to be placed in class
 * 3. subject = Subject to be taught
 * 4. room = Room Assigned
 * 5. classType = Lecture/Tutorial/Lab
 * 6. teacher = Teacher Assigned
 * 7. time = Time of Class
 */
package dataset;

public class Class {
    private String id;
    private Course course;
    private Subject subject;
    private Room room;
    private String classType;
    private Teacher teacher;
    private TimeSlot time;
    
    public Class(String id,Course course,TimeSlot time){
        this.id = id;
        this.course = course;
        this.time = time;
    }
    
    public void setSubject(Subject subject){ this.subject = subject; }
    public void setRoom(Room room){ this.room = room; }
    public void setClassType(String classType){this.classType = classType; }
    public void setTeacher(Teacher teacher){ this.teacher = teacher; }
    public void setNoClass(){
        subject = null;
        room = null;
        teacher = null;
    };
    
    public String getId(){ return id; }
    public Course getCourse(){ return course; }
    public Subject getSubject(){ return subject; }
    public Room getRoom(){ return room; }
    public String getClassType(){ return classType; }
    public Teacher getTeacher(){ return teacher; }
    public TimeSlot getTimeSlot(){ return time; }
    @Override
    public String toString(){
        String message;
        if(subject == null){
            message = "["+time.toString()+","+course.getName()+",NULL, NULL, NULL]";
        }else{
            message = "["+time.toString()+","+course.getName()+","+subject.getName()+","+room.getId()+","+teacher.getName()+"]";
        }
        return message;
    }
    public String timeTableView(){
        String message;
        if(subject == null){
            message = "";
        }else{
            message = "" + teacher.getId() + "\n" + subject.getId();
            if(classType.equalsIgnoreCase("tutorial")){
                message += "\n (Tut.)";
            }else if(classType.equalsIgnoreCase("lab")){
                message += "\n LAB";
            }
        }
        return message;
    }
}
