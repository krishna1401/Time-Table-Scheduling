/*
 * Provides complete information necessary for Time Table Scheduling
 * 1. Rooms
 * 2. Courses
 * 3. Teachers
 * 4. Subject
 * 5. Time Slot
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
    private ArrayList<TimeSlot> time_slots;
    private int numberOfCourse = 0;
    
    public Data(){ initialize(); }
    
    private Data initialize(){
        
        //Initializing Rooms
        Room room1 = new Room("SH1","",50);
        Room room2 = new Room("R114","",50);
        Room room3 = new Room("R115","",50);
        Room room4 = new Room("CR1","",30);
        Room room5 = new Room("LAB1","",50);
        Room room6 = new Room("LAB2","",50);
        rooms = new ArrayList<>(Arrays.asList(room1,room2,room3,room4,room5,room6));
        
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
        Subject subject1 = new Subject("MCS-101","Design & Analysis of Algorithms",teacher12,3,4,0);
        Subject subject2 = new Subject("MCS-102","Artificial Intelligence",teacher13,3,0,2);
        Subject subject3 = new Subject("MCS-103","Information Security",teacher14,4,0,2);
        Subject subject4 = new Subject("MCS-104","Database System & Implementation",teacher7,4,0,3);
        Subject subject5 = new Subject("MCS-105","Computational Intelligence",teacher1,3,0,4);
        
        Subject subject6 = new Subject("MCS-302","Design Image Processing & Multi-media",teacher8,3,0,0);
        Subject subject7 = new Subject("MCS-303","Neural Network",teacher13,0,0,4);
        Subject subject8 = new Subject("MCS-304","Software Quality Assurance & Testing",teacher15,3,0,2);
        Subject subject25 = new Subject("MCS-311","Special Topic in Data Mining",teacher17,3,0,2);
        Subject subject26 = new Subject("MCS-312","Special Topic in Theoritical Computer Science",teacher12,3,0,0);
        Subject subject27 = new Subject("MCS-316","Special Topic in Artificial Intelligence",teacher16,3,0,4);
        
        
        Subject subject9 = new Subject("MCA-101","Objective Orientec Programming",teacher1,2,0,6);
        Subject subject10 = new Subject("MCA-102","Systems Programming",teacher2,3,0,4);
        Subject subject11 = new Subject("MCA-103","Statistical Techniques",teacher3,2,0,4);
        Subject subject12 = new Subject("MCA-104","Computer System Architecture",teacher4,3,0,4);
        Subject subject13 = new Subject("MCA-105","Economics",teacher5,4,1,0);
        Subject subject14 = new Subject("MCA-106","Technical Communication",teacher6,4,0,0);
        
        Subject subject15 = new Subject("MCA-301","Design & Analysis of Algorithms",teacher7,3,0,4);
        Subject subject16 = new Subject("MCA-302","Software Engineering",teacher8,3,0,4);
        Subject subject17 = new Subject("MCA-303","Database Systems",teacher4,3,0,4);
        Subject subject18 = new Subject("MCA-304","Automata Theory",teacher9,3,4,0);
        Subject subject19 = new Subject("MCA-305","Operating Systems",teacher10,6,0,0);
        
        Subject subject20 = new Subject("MCA-503","Data Mining",teacher2,3,0,4);
        Subject subject21 = new Subject("MCA-505","Artificial Intelligence",teacher3,4,0,3);
        Subject subject22 = new Subject("MCA-506","Digital Image Processing",teacher9,3,0,4);
        Subject subject23 = new Subject("MCA-509","Software Quality Assurance & Testing",teacher11,5,0,0);
        Subject subject24 = new Subject("MCA-517","Satellite & Mobile Communication Network",teacher10,6,0,0);
        
        subjects = new ArrayList<>(Arrays.asList(subject1,subject2,subject3,subject4,subject5,subject6,
                                                 subject7,subject8,subject9,subject10,subject11,subject12,
                                                 subject13,subject14,subject15,subject16,subject17,subject18,
                                                 subject19,subject20,subject21,subject22,subject23,subject24));
        
        //Initializing Course
        Course course1 = new Course("MSC-1","M.Sc. 1st Year",
                                    new ArrayList<>(Arrays.asList(subject1,subject2,subject3,subject4,subject5)),
                                    40);
        Course course3 = new Course("MSC-2","M.Sc. 2nd Year",
                                    new ArrayList<>(Arrays.asList(subject6,subject7,subject8,subject25,subject26,subject27)),
                                    25);
        Course course2 = new Course("MCA-1","MCA 1st Year",
                                    new ArrayList<>(Arrays.asList(subject9,subject10,subject11,subject12,subject13,subject14)),
                                    40);
        Course course4 = new Course("MCA-2","MCA 2nd Year",
                                    new ArrayList<>(Arrays.asList(subject15,subject16,subject17,subject18,subject19)),
                                    40);
        Course course5 = new Course("MCA-3","MCA 3rd Year",
                                    new ArrayList<>(Arrays.asList(subject20,subject21,subject22,subject23,subject24)),
                                    30);
        
        courses = new ArrayList<>(Arrays.asList(course1,course2,course3,course4,course5));
        
        TimeSlot time1 = new TimeSlot("Mo1","9:00 AM - 10:00 AM","Monday");
        TimeSlot time2 = new TimeSlot("Tu1","9:00 AM - 10:00 AM","Tuesday");
        TimeSlot time3 = new TimeSlot("We1","9:00 AM - 10:00 AM","Wednesday");
        TimeSlot time4 = new TimeSlot("Th1","9:00 AM - 10:00 AM","Thrusday");
        TimeSlot time5 = new TimeSlot("Fr1","9:00 AM - 10:00 AM","Friday");
        time_slots = new ArrayList<>(Arrays.asList(time1,time2,time3,time4,time5));
        time1 = new TimeSlot("Mo2","10:00 AM - 11:00 AM","Monday");
        time2 = new TimeSlot("Tu2","10:00 AM - 11:00 AM","Tuesday");
        time3 = new TimeSlot("We2","10:00 AM - 11:00 AM","Wednesday");
        time4 = new TimeSlot("Th2","10:00 AM - 11:00 AM","Thrusday");
        time5 = new TimeSlot("Fr2","10:00 AM - 11:00 AM","Friday");
        time_slots.addAll(Arrays.asList(time1,time2,time3,time4,time5));
        time1 = new TimeSlot("Mo3","11:00 AM - 12:00 PM","Monday");
        time2 = new TimeSlot("Tu3","11:00 AM - 12:00 PM","Tuesday");
        time3 = new TimeSlot("We3","11:00 AM - 12:00 PM","Wednesday");
        time4 = new TimeSlot("Th3","11:00 AM - 12:00 PM","Thrusday");
        time5 = new TimeSlot("Fr3","11:00 AM - 12:00 PM","Friday");
        time_slots.addAll(Arrays.asList(time1,time2,time3,time4,time5));
        time1 = new TimeSlot("Mo4","12:00 PM - 1:00 PM","Monday");
        time2 = new TimeSlot("Tu4","12:00 PM - 1:00 PM","Tuesday");
        time3 = new TimeSlot("We4","12:00 PM - 1:00 PM","Wednesday");
        time4 = new TimeSlot("Th4","12:00 PM - 1:00 PM","Thrusday");
        time5 = new TimeSlot("Fr4","12:00 PM - 1:00 PM","Friday");
        time_slots.addAll(Arrays.asList(time1,time2,time3,time4,time5));
        time1 = new TimeSlot("Mo5","1:00 PM - 2:00 PM","Monday");
        time2 = new TimeSlot("Tu5","1:00 PM - 2:00 PM","Tuesday");
        time3 = new TimeSlot("We5","1:00 PM - 2:00 PM","Wednesday");
        time4 = new TimeSlot("Th5","1:00 PM - 2:00 PM","Thrusday");
        time5 = new TimeSlot("Fr5","1:00 PM - 2:00 PM","Friday");
        time_slots.addAll(Arrays.asList(time1,time2,time3,time4,time5));
        time1 = new TimeSlot("Mo6","2:00 PM - 3:00 PM","Monday");
        time2 = new TimeSlot("Tu6","2:00 PM - 3:00 PM","Tuesday");
        time3 = new TimeSlot("We6","2:00 PM - 3:00 PM","Wednesday");
        time4 = new TimeSlot("Th6","2:00 PM - 3:00 PM","Thrusday");
        time5 = new TimeSlot("Fr6","2:00 PM - 3:00 PM","Friday");
        time_slots.addAll(Arrays.asList(time1,time2,time3,time4,time5));
        time1 = new TimeSlot("Mo7","3:00 PM - 4:00 PM","Monday");
        time2 = new TimeSlot("Tu7","3:00 PM - 4:00 PM","Tuesday");
        time3 = new TimeSlot("We7","3:00 PM - 4:00 PM","Wednesday");
        time4 = new TimeSlot("Th7","3:00 PM - 4:00 PM","Thrusday");
        time5 = new TimeSlot("Fr7","3:00 PM - 4:00 PM","Friday");
        time_slots.addAll(Arrays.asList(time1,time2,time3,time4,time5));
        time1 = new TimeSlot("Mo8","4:00 PM - 5:00 PM","Monday");
        time2 = new TimeSlot("Tu8","4:00 PM - 5:00 PM","Tuesday");
        time3 = new TimeSlot("We8","4:00 PM - 5:00 PM","Wednesday");
        time4 = new TimeSlot("Th8","4:00 PM - 5:00 PM","Thrusday");
        time5 = new TimeSlot("Fr8","4:00 PM - 5:00 PM","Friday");
        time_slots.addAll(Arrays.asList(time1,time2,time3,time4,time5));
        
        numberOfCourse = courses.size();
        
        return this;
    }
    
    public ArrayList<Room> getRooms(){ return rooms; }
    public ArrayList<Subject> getSubjects(){ return subjects; }
    public ArrayList<Teacher> getTeachers(){ return teachers; }
    public ArrayList<Course> getCourses(){ return courses; }
    public ArrayList<TimeSlot> getTimeSlots(){ return time_slots; }
    public int getNumberOfCourse(){ return numberOfCourse; }
    
}
