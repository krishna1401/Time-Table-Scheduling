/*
 * This class provides a Structure for the Subjects with following data:
 * 1. id = Unique Subject Id
 * 2. name = Subject Name
 * 3. teacher = Teacher that will teach a particular subject
 * 4. lectureTime = Total time of Lecture (in hrs)
 * 5. tutorialTime = Total time of Tutorial (in hrs) (if any)
 * 6. practicalTime = Total time of Practical (in hrs) (if any)
 */
package dataset;

public class Subject {
    private String id;
    private String name;
    private Teacher teacher;
    private int lectureTime;
    private int tutorialTime;
    private int practicalTime;
    
    public Subject(String id,String name,Teacher teacher,int lectureTime,int tutorialTime, int practicalTime){
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.lectureTime = lectureTime;
        this.tutorialTime = tutorialTime;
        this.practicalTime = practicalTime;
    }
    
    public String getId(){ return id; }
    public String getName(){ return name; }
    public Teacher getTeacher(){ return teacher; }
    public int getLectureTime(){ return lectureTime; }
    public int getTutorialTime(){ return tutorialTime; }
    public int getPracticalTime(){ return practicalTime; }
    public void decrementLectureTime(){ lectureTime -= 1;}
    public void decrementTutorialTime(){ tutorialTime -= 1;}
    public void decrementPracticalTime(){ practicalTime -= 1;}
    
    @Override
    public String toString(){ return name; }
}
