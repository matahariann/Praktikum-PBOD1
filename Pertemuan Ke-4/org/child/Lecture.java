package org.child;

import java.util.ArrayList;
import org.parent.Parent;

public class Lecture extends Parent{
    private ArrayList<Course> coursesTaught;

    public Lecture(String name, int age, String address, String employeeID){
        this.name = name;
        this.age = age;
        this.address = address;
        this.ID = employeeID;
        this.coursesTaught = new ArrayList<Course>();
    }

    public void teachCourse(Course C){
        this.coursesTaught.add(C);
        C.setLecture(this);
    }

    public void viewTaughtCourses(){
        int i = 1;

        System.out.println(getName() + ", Taught Courses: ");
        for (Course course: this.coursesTaught){
            System.err.print(i + ". ");
            System.out.println(course.getName());
            i++;
        }
    }
}
