package controller;

import dataset.TimeTable;
import dataset.Class;
import java.util.ArrayList;

public class Main {
    private Data data;
    private ArrayList<TimeTable> result;
    public static void main(String args[]){
        Main main = new Main();
        main.data = new Data();
        //main.printAvailableData();
        Schedule schedule = new Schedule(main.data);
        if(schedule.getSchedule()){
            main.result = schedule.getTimeTable();
            ArrayList<Class> classes = schedule.getClasses();
            main.printTimeTable();
        }else{
            System.out.println("No Schedule Possible");
        }
    }
    private void printTimeTable(){
        
    }
    
    private void printAvailableData(){
        System.out.println("Available Courses ==>");
        data.getCourses().forEach(course -> {System.out.println("Id: "+course.getId()+", Name: " + course.getName()+
                                                                ", Maximum Students: "+course.getMaxNumOfStudents());});
        
        System.out.println("Availbale Rooms ==>");
        data.getRooms().forEach(room -> {System.out.println("Id: "+room.getId()+", Capacity: "+room.getCapacity());});
        
        System.out.println("Available Teachers ==>");
        data.getTeachers().forEach(teacher -> {System.out.println("Id: "+teacher.getId()+", Name: "+teacher.getName());});
        
        System.out.println("Available Subjects ==>");
        data.getSubjects().forEach(subject -> {System.out.println("Id: "+subject.getId()+", Name: "+subject.getName()+
                                                                  ", Teacher Code: "+subject.getTeacher().getId()+
                                                                  ", Duration (in hrs): "+subject.getTimeDuration());});
    }
}