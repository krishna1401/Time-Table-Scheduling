/*
 * Provides complete information necessary for Time Table Scheduling
 * 1. Rooms
 * 2. Courses
 * 3. Teachers
 * 4. Subject
 */
package controller;

import dataset.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Data {
    private ArrayList<Room> rooms;
    private ArrayList<Subject> subjects;
    private ArrayList<Teacher> teachers;
    private ArrayList<Course> courses;
    private int numberOfClasses = 0;
    
    public Data(){ initialize(); }
    
    private Data initialize(){
        
        //Initializing Rooms
        Room room1 = new Room("R1",50);
        Room room2 = new Room("R2",50);
        Room room3 = new Room("R3",50);
        Room room4 = new Room("R4",30);
        rooms = new ArrayList<>(Arrays.asList(room1,room2,room3,room4));
        
        //Initializing Teachers
        Teacher teacher1 = new Teacher("NK","Dr. Naveen Kumar");
        Teacher teacher2 = new Teacher("SV","Dr. Sapna Varshney");
        Teacher teacher3 = new Teacher("PR","Dr. Priyanka Rathee");
        Teacher teacher4 = new Teacher("NS","Ms. Nisha");
        Teacher teacher5 = new Teacher("DK","Ms. Devki Kashyap");
        Teacher teacher6 = new Teacher("SP","Ms. Savita Pathak");
        Teacher teacher7 = new Teacher("RK","Ms. Reena Kasana");
        Teacher teacher8 = new Teacher("RC","Ms. Roni Chakre");
        Teacher teacher9 = new Teacher("MK","Ms. Megha Khandelwal");
        Teacher teacher10 = new Teacher("PKH","Mr. P.K. Hazra");
        Teacher teacher11 = new Teacher("VBS","Dr. V.B. Singh");
        Teacher teacher12 = new Teacher("NG","Prof. Neelima Gupta");
        Teacher teacher13 = new Teacher("PB","Prof. Punam Bedi");
        Teacher teacher14 = new Teacher("RG","Mr. Rajan Gupta");
        Teacher teacher15 = new Teacher("MS","Dr. Meera Sharma");
        Teacher teacher16 = new Teacher("SK","Dr. Sharanjit Kaur");
        Teacher teacher17 = new Teacher("VB","Dr. Vasudha Bhatnagar");
        teachers = new ArrayList<>(Arrays.asList(teacher1,teacher2,teacher3,teacher4,teacher5,teacher6,
                                                 teacher7,teacher8,teacher9,teacher10,teacher11,teacher12,
                                                 teacher13,teacher14,teacher15,teacher16,teacher17));
        
        //Initializing Subjects
        Subject subject1 = new Subject("MCS-101","Design & Analysis of Algorithms","NG",7);
        Subject subject2 = new Subject("MCS-102","Artificial Intelligence","PB",3);
        Subject subject3 = new Subject("MCS-103","Information Security","RG",6);
        Subject subject4 = new Subject("MCS-104","Database System & Implementation","RK",7);
        Subject subject5 = new Subject("MCS-105","Computational Intelligence","NK",11);
        
        Subject subject6 = new Subject("MCS-301","Elective 1","RC",6);
        Subject subject7 = new Subject("MCS-302","Elective 2","PB",6);
        Subject subject8 = new Subject("MCS-303","Elective 3","MS",6);
        
        Subject subject9 = new Subject("MCA-101","Objective Orientec Programming","NK",8);
        Subject subject10 = new Subject("MCA-102","Systems Programming","SV",7);
        Subject subject11 = new Subject("MCA-103","Statistical Techniques","PR",7);
        Subject subject12 = new Subject("MCA-104","Computer System Architecture","NS",7);
        Subject subject13 = new Subject("MCA-105","Economics","DK",5);
        Subject subject14 = new Subject("MCA-106","Technical Communication","SP",4);
        
        Subject subject15 = new Subject("MCA-301","Design & Analysis of Algorithms","RK",5);
        Subject subject16 = new Subject("MCA-302","Software Engineering","RC",6);
        Subject subject17 = new Subject("MCA-303","Database Systems","NS",6);
        Subject subject18 = new Subject("MCA-304","Automata Theory","MK",7);
        Subject subject19 = new Subject("MCA-305","Operating Systems","PKH",5);
        
        Subject subject20 = new Subject("MCA-501","Data Mining","SV",6);
        Subject subject21 = new Subject("MCA-505","Artificial Intelligence","PR",6);
        Subject subject22 = new Subject("MCA-506","Digital Image Processing","MK",7);
        Subject subject23 = new Subject("MCA-509","Software Quality Assurance & Testing","VBS",5);
        Subject subject24 = new Subject("MCA-517","Satellite & Mobile Communication Network","PKH",6);
        
        subjects = new ArrayList<>(Arrays.asList(subject1,subject2,subject3,subject4,subject5,subject6,
                                                 subject7,subject8,subject9,subject10,subject11,subject12,
                                                 subject13,subject14,subject15,subject16,subject17,subject18,
                                                 subject19,subject20,subject21,subject22,subject23,subject24));
        
        //Initializing Course
        Course course1 = new Course("MSC-1","M.Sc. 1st Year",
                                    new ArrayList<>(Arrays.asList(subject1,subject2,subject3,subject4,subject5)),
                                    40);
        Course course2 = new Course("MSC-2","M.Sc. 2nd Year",
                                    new ArrayList<>(Arrays.asList(subject6,subject7,subject8)),
                                    25);
        Course course3 = new Course("MCA-1","MCA 1st Year",
                                    new ArrayList<>(Arrays.asList(subject9,subject10,subject11,subject12,subject13,subject14)),
                                    40);
        Course course4 = new Course("MCA-2","MCA 2nd Year",
                                    new ArrayList<>(Arrays.asList(subject15,subject16,subject17,subject18,subject19)),
                                    40);
        Course course5 = new Course("MCA-3","MCA 3rd Year",
                                    new ArrayList<>(Arrays.asList(subject20,subject21,subject22,subject23,subject24)),
                                    30);
        
        courses = new ArrayList<>(Arrays.asList(course1,course2,course3,course4,course5));
        
        numberOfClasses = courses.size();
        
        return this;
    }
    
    private Teacher temporary;
    public Teacher getTeacherById(String id){
        teachers.forEach(teacher -> {
            if(teacher.getID().equalsIgnoreCase(id))
                temporary = teacher;
        });
        return temporary;
    }
    public ArrayList<Room> getRooms(){ return rooms; }
    public ArrayList<Subject> getSubjects(){ return subjects; }
    public ArrayList<Teacher> getTeachers(){ return teachers; }
    public ArrayList<Course> getCourses(){ return courses; }
    public int getNumberOfClasses(){ return numberOfClasses; }
}
