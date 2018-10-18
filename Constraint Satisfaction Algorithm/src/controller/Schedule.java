
package controller;

import dataset.Course;
import dataset.Subject;
import dataset.TimeTable;
import dataset.Class;
import dataset.Room;
import dataset.Teacher;
import java.util.ArrayList;

public class Schedule {
    private ArrayList<Class> classes;
    private ArrayList<TimeTable> timetable;
    private Data data;
    
    public Schedule(Data data){
       this.data = data;
       for(int i = 0;i < timetable.size();i++){
            TimeTable temp = new TimeTable("" + i, data.getCourses().get(i));
            timetable.add(temp);
        }
       constraintSatisfaction();
    }
    public Data getData(){ return data; }
    
    private Subject availableSubject;
    private Room availableRoom;
    private void constraintSatisfaction(){
        data.getTimeSlots().forEach(time -> {
            rooms = data.getRooms();
            teachers = data.getTeachers();
            for(int course_index = 0;course_index < data.getCourses().size();course_index++){
                Course course = data.getCourses().get(course_index);
                Class assignedClass = new Class(course.getId()+";"+time.getId(),course,time);
                availableSubject = subjectAvailablity(course);
                availableRoom = roomAvailability(course);
                if(availableRoom != null && availableSubject != null){
                    //Remove Elements for Availability
                    rooms.remove(availableRoom);
                    availableSubject.decrementTimeDuration();
                    teachers.remove(availableSubject.getTeacher());
                    //Assign Class in the Time Table
                    assignedClass.setRoom(availableRoom);
                    assignedClass.setSubject(availableSubject);
                    assignedClass.setTeacher(availableSubject.getTeacher());
                }else{ assignedClass.setNoClass(); }
                classes.add(assignedClass);
                timetable.get(course_index).addClass(assignedClass);
            }
        });
    }
    
    private ArrayList<Room> rooms;
    private Room roomAvailability(Course course){
        Room available = null;
        for(int i = 0;i < rooms.size();i++){
            if(rooms.get(i).getCapacity() > course.getMaxNumOfStudents()){
                available = rooms.get(i);
                break;
            }
        }
        return null;
    }
    
    
    private Subject subjectAvailablity(Course course){
        Subject available = null;
        for(int i = 0;i < course.getSubjects().size();i++){
            if(course.getSubjects().get(i).getTimeDuration() > 0){
                if(!teacherAvailability(available)){ continue; }
                available = course.getSubjects().get(i);
                break;
            }
        }
        return available;
    }
    
    private ArrayList<Teacher> teachers;
    private boolean teacherAvailability(Subject subject){
       return teachers.contains(subject.getTeacher());
    }
    
    private int total_time = 0;
    public boolean validateAvailability(){
        boolean condition = true;
        data.getSubjects().forEach(subject -> {
            total_time += subject.getTimeDuration();
        });
        if(total_time > 40*data.getRooms().size())
            condition = false;
        return condition;
    }
    
    public ArrayList<TimeTable> getTimeTable(){ return timetable; }
    public ArrayList<Class> getClasses(){ return classes; }
}