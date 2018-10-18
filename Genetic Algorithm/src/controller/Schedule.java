/*
 * This java script creates a Schedule for a particular day.
 */
package controller;

import dataset.Class;
import dataset.Subject;
import java.util.ArrayList;
public class Schedule {
    private ArrayList<Class> classes;
    private int classNumber = 0;
    private Data data;
    private boolean isFitnessChanged = true;
    private int numberOfConflicts = 0;
    private double fitness = -1;
    
    public Schedule(Data data){
       this.data = data;
       classes = new ArrayList<>(data.getNumberOfClasses());
    }
    public Data getData(){ return data; }
    public Schedule initialize(){
        new ArrayList<>(data.getCourses()).forEach(course ->{
            Class newClass = new Class(Integer.toString(classNumber++),course);
            newClass.setRoom(data.getRooms().get((int)(data.getRooms().size()*Math.random())));
            Subject temporary = data.getSubjects().get((int)(data.getSubjects().size()*Math.random()));
            newClass.setSubject(temporary);
            newClass.setTeacher(data.getTeacherById(temporary.getTeacherId()));
            classes.add(newClass);
        });
        return this;
    }
    public int getNumberOfConflicts(){
        return numberOfConflicts;
    }
    public ArrayList<Class> getClasses(){
        isFitnessChanged = true;
        return classes;
    }
    private double calculateFitness(){
        numberOfConflicts = 0;
        classes.forEach(x -> {
            if(x.getRoom().getCapacity() < x.getCourse().getMaxNumOfStudents()) numberOfConflicts++;
            classes.stream().filter(y -> classes.indexOf(y) >= classes.indexOf(x)).forEach(y -> {
                
            });
        });
        return 0;
    }
    public double getFitness(){
        if(isFitnessChanged == true){
            fitness = calculateFitness();
            isFitnessChanged = false;
        }
        return fitness;
    }
}