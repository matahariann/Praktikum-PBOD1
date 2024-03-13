package org.main;

import org.child.*;

public class Main {
    public static void main(String[] args) {
        Student Sunan = new Student("Sunan", 20, "Jakarta", "240602");
        Student Shaqi = new Student("Shaqi", 20, "Pekanbaru", "240603");
        Student Demas = new Student("Demas", 19, "Jakarta", "240604");

        Lecture Khadijah = new Lecture("Khadijah", 40, "Jakarta", "240501");
        Lecture Priyo = new Lecture("Priyo", 42, "Semarang", "240502");
        Lecture Aris = new Lecture("Aris", 50, "Kudus", "240503");

        Course PBO = new Course("PAIK123", "PBO");
        Course MBD = new Course("PAIK124", "MBD");
        Course ASA = new Course("PAIK125", "ASA");
        Course GKV = new Course("PAIK126", "GKV");
        Course STI = new Course("PAIK127", "STI");
        Course RPL = new Course("PAIK128", "RPL");
        

        // Method Class Student
        System.out.println("=======Student Data=========");
        Sunan.getDetails();
        System.out.println("----------------------------");
        Shaqi.getDetails();
        System.out.println("----------------------------");
        Demas.getDetails();
        System.out.println("");
        
        Sunan.enrollCourse(PBO);
        Sunan.enrollCourse(MBD);
        Sunan.enrollCourse(ASA);
        Sunan.viewEnrolledCourse();
        System.out.println("");

        Shaqi.enrollCourse(ASA);
        Shaqi.enrollCourse(STI);
        Shaqi.enrollCourse(RPL);
        Shaqi.viewEnrolledCourse();
        System.out.println("");

        Demas.enrollCourse(MBD);
        Demas.enrollCourse(GKV);
        Demas.enrollCourse(STI);
        Demas.viewEnrolledCourse();
        System.out.println("\n");
            
        // Method Class Lecture  
        System.out.println("=======Lecture Data=========");
        Khadijah.getDetails();
        System.out.println("----------------------------");
        Priyo.getDetails();
        System.out.println("----------------------------");
        Aris.getDetails();
        System.out.println("");

        Khadijah.teachCourse(PBO);
        Khadijah.teachCourse(MBD);
        Khadijah.viewTaughtCourses();
        System.out.println("");

        Priyo.teachCourse(ASA);
        Priyo.teachCourse(GKV);
        Priyo.viewTaughtCourses();
        System.out.println("");

        Aris.teachCourse(STI);
        Aris.teachCourse(RPL);
        Aris.viewTaughtCourses();
        System.out.println("\n");
        
        // Method Class Course
        GKV.addStudent(Sunan);
        RPL.addStudent(Shaqi);
        PBO.addStudent(Demas);

        GKV.removeStudent(Sunan);
        RPL.removeStudent(Shaqi);
        PBO.removeStudent(Demas);

        System.out.println("========Course Data=========");
        PBO.getDetails();
        System.out.println("----------------------------");
        MBD.getDetails();
        System.out.println("----------------------------");
        ASA.getDetails();
        System.out.println("----------------------------");
        GKV.getDetails();
        System.out.println("----------------------------");
        STI.getDetails();
        System.out.println("----------------------------");
        RPL.getDetails();
        System.out.println("");

        PBO.viewEnrolledStudents();
        MBD.viewEnrolledStudents();
        ASA.viewEnrolledStudents();
        GKV.viewEnrolledStudents();
        STI.viewEnrolledStudents();
        RPL.viewEnrolledStudents();
    }
}
