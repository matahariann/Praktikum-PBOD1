package org.child;

import java.util.ArrayList;
import org.parent.Parent;

public class Course extends Parent{
    private Lecture lecture;
    private ArrayList<Student> studentsEnrolled;

    public Course(String courseCode, String courseName){
        this.ID = courseCode;
        this.name = courseName;
        this.studentsEnrolled = new ArrayList<Student>();
    }

    public Lecture getLecture(){
        return this.lecture;
    }

    public void setLecture(Lecture lecture){
        this.lecture = lecture;
    }

    public void getDetails(){
        System.out.println("Course Code\t: " + getID());
        System.out.println("Course Name\t: " + getName());
    }
    
    public void addStudent(Student S){
        this.studentsEnrolled.add(S);
    }

    public void removeStudent(Student S){
        this.studentsEnrolled.remove(S);
    }

    public void viewEnrolledStudents(){
        System.out.println("Enrolled Students " + getName() + " : ");
        for (Student student: this.studentsEnrolled){
            student.getDetails();
            System.out.println("");
        }
    }
}
