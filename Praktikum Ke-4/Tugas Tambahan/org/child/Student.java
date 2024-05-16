package org.child;

import java.util.ArrayList;
import org.parent.Parent;

public class Student extends Parent{
    private ArrayList<Course> coursesEnrolled;

    public Student(String name, int age, String address, String studentID){
        this.name = name;
        this.age = age;
        this.address = address;
        this.ID = studentID;
        this.coursesEnrolled = new ArrayList<Course>();
    }

    public void enrollCourse(Course C){
        this.coursesEnrolled.add(C);
        C.addStudent(this);
    }
    
    public void viewEnrolledCourse(){
        int i = 1;
        
        System.out.println("Course Enrolled " + getName() + ": ");
        for (Course course: this.coursesEnrolled){
            System.err.print(i + ". ");
            System.out.println(course.getName());
            i++;
        }
    }
}