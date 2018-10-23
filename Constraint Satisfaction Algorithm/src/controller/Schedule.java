package controller;

import dataset.Course;
import dataset.Subject;
import dataset.TimeTable;
import dataset.Class;
import dataset.Room;
import dataset.Teacher;
import java.util.ArrayList;
import java.util.Collections;

public class Schedule {
    private ArrayList<Class> classes;
    private ArrayList<TimeTable> timetable;
    private Data data;
    
    public Schedule(Data data){
       this.data = data;
       timetable = new ArrayList<>();
       classes = new ArrayList<>();
       for(int i = 0;i < data.getNumberOfCourse();i++){
            TimeTable temp = new TimeTable("" + i, data.getCourses().get(i));
            timetable.add(temp);
        }
    }
    
    private Subject availableSubject;
    private Room availableRoom;
    private void constraintSatisfaction(){
        data.getTimeSlots().forEach(time -> {
            rooms = (ArrayList<Room>) data.getRooms().clone();
            teachers = (ArrayList<Teacher>) data.getTeachers().clone();
            for(int course_index = 0;course_index < data.getCourses().size();course_index++){
                Course course = data.getCourses().get(course_index);
                Class assignedClass = new Class(course.getId()+";"+time.getId(),course,time);
                availableSubject = subjectAvailablity(course);
                availableRoom = roomAvailability(course);
                if(availableRoom != null && availableSubject != null){
                    //Remove Elements for Availability
                    rooms.remove(availableRoom);
                    switch (type) {
                        case 2:
                            availableSubject.decrementPracticalTime();
                            break;
                        case 1:
                            availableSubject.decrementTutorialTime(); 
                            break;
                        default:
                            availableSubject.decrementLectureTime();
                            break;
                    }
                    teachers.remove(availableSubject.getTeacher());
                    //Assign Class in the Time Table
                    assignedClass.setRoom(availableRoom);
                    assignedClass.setSubject(availableSubject);
                    assignedClass.setTeacher(availableSubject.getTeacher());
                }else{ assignedClass.setNoClass(); }
                classes.add(assignedClass);
                //System.out.println(assignedClass.toString());
                timetable.get(course_index).addClass(assignedClass);
            }
        });
    }
    
    private ArrayList<Room> rooms;
    private Room roomAvailability(Course course){
        Room available = null;
        if(course.getId().equals("MSC-1")){
            available = getRoomById("SH1");
        }else if(course.getId().equals("MCA-1")){
            available = getRoomById("R114");
        }else{
            for(int i = 0;i < rooms.size();i++){
                if(type == 2){
                    //Assigning Lab for Lab Subjects
                    if(rooms.get(i).getId().contains("LAB")){
                        available = rooms.get(i);
                        break;
                    }
                }else{
                    //Assigning Room for Lectures
                    if(rooms.get(i).getCapacity() >= course.getMaxNumOfStudents()){
                        available = rooms.get(i);
                        break;
                    }
                }
            }
        }
        return available;
    }
    public Room getRoomById(String id){
        Room temporary = null;
        for(int i = 0;i < rooms.size();i++){
            if(rooms.get(i).getId().contains(id)){
                temporary = rooms.get(i);
                break;
            }
        }
        return temporary;
    }
    
    private int type;
    private Subject subjectAvailablity(Course course){
        Subject available = null;
        Collections.shuffle(course.getSubjects());
        outer:
        for(int i = 0;i < course.getSubjects().size();i++){
            boolean loop_condition = true;
            type = 0;
            //Considers any of the possible Lecture/Tutorial/Lab at given time slot
            while(loop_condition){
                switch(type){
                    case 0: if(course.getSubjects().get(i).getLectureTime() > 0){
                                //Finding Lecture for Room
                                if(!teacherAvailability(course.getSubjects().get(i))){ continue outer; }
                                if(roomAvailability(course) == null){ type = 2; continue; }
                                available = course.getSubjects().get(i);
                                loop_condition = false;
                            }else{ type = 1; }
                            break;
                    case 1: if(course.getSubjects().get(i).getTutorialTime() > 0){
                                //Finding Lecture for Tutorial
                                if(!teacherAvailability(course.getSubjects().get(i))){ continue outer; }
                                if(roomAvailability(course) == null){ type = 2;continue; }
                                available = course.getSubjects().get(i);
                                loop_condition = false;
                            }else{ type = 2; }
                            break;
                    case 2: if(course.getSubjects().get(i).getPracticalTime() > 0){
                                //Finding Lecture for Practical
                                if(!teacherAvailability(course.getSubjects().get(i))){ continue outer; }
                                if(roomAvailability(course) == null){ type = -1; continue; }
                                available = course.getSubjects().get(i);
                                loop_condition = false;
                            }else{ type = -1; }
                            break;
                    default:
                            continue outer;
                }
            }
            if(!loop_condition)
                break;
        }
        return available;
    }
    
    private ArrayList<Teacher> teachers;
    private boolean teacherAvailability(Subject subject){
       return teachers.contains(subject.getTeacher());
    }
    
    private int total_time = 0;
    public boolean getSchedule(){
        boolean condition = true;
        data.getSubjects().forEach(subject -> {
            total_time += subject.getLectureTime();
        });
        if(total_time > 40*data.getRooms().size())
            condition = false;
        if(condition)
            constraintSatisfaction();
        return condition;
    }
    
    public ArrayList<TimeTable> getTimeTable(){ return timetable; }
    public ArrayList<Class> getClasses(){ return classes; }
}