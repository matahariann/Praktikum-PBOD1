package praktikum;

import java.util.ArrayList;

public class Lecture {
    private String name;
    private int age;
    private String address;
    private String employeeID;
    private ArrayList<Course> coursesTaught;

    public Lecture(String name, int age, String address, String employeeID){
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<Course>();
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setEmployeeID(String employeeID){
        this.employeeID = employeeID;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getAddress(){
        return this.address;
    }  

    public String getEmployeeID(){
        return this.employeeID;
    }

    public void getDetails(){
        System.out.println("Name\t\t: " + getName());
        System.out.println("Age\t\t: " + getAge());
        System.out.println("Address\t\t: " + getAddress());
        System.out.println("Employee ID\t: " + getEmployeeID());
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
            System.out.println(course.getCourseName());
            i++;
        }
    }
}
