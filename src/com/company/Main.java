package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Student> students = Arrays.asList(
                new Student(2, "Kweku", Level.LEVEL100),
                new Student(3, "Kwesi", Level.LEVEL400),
                new Student(4, "adwoa", Level.LEVEL300),
                new Student(5, "esi", Level.LEVEL300),
                new Student(6, "mensah", Level.LEVEL200),
                new Student(7, "amen", Level.LEVEL100),
                new Student(8, "Kwesi", Level.LEVEL400),
                new Student(9, "pros", Level.LEVEL400),
                new Student(0, "wayo", Level.LEVEL300),
                new Student(11, "Kio", Level.LEVEL100),
                new Student(42, "ama", Level.LEVEL200)
        );
        Lecturer lecturer = new Lecturer("Prof", students);
        Course programming = new Course(lecturer, (Arrays.asList(new Student(10,"fii", Level.LEVEL300),
                new Student(50,"fiifi", Level.LEVEL200))), Level.LEVEL100);

        List<Student> stu_L100 = new ArrayList<>();
        for (Student l100_stu: students){
            if (l100_stu.getStudentLevel() == Level.LEVEL100){
                stu_L100.add(l100_stu);
            }
        }
       System.out.println(stu_L100);

        Course cms108 = new Course(lecturer, stu_L100, Level.LEVEL100);


        List<Student> stu_L200_L300 = new ArrayList<>();
        for (Student l200_l300_stu: students){
            if (l200_l300_stu.getStudentLevel() == Level.LEVEL200 || l200_l300_stu.getStudentLevel() == Level.LEVEL300){
                stu_L200_L300.add(l200_l300_stu);
            }
        }
        System.out.println(stu_L200_L300);
        Course audit200_300 = new Course(lecturer, stu_L200_L300, Level.LEVEL200);

        System.out.println(lecturer);



//        for (Student s: students) {
//            if (s.getId() == 2){
//                System.out.println(s);
//
//            }
//            if (s.getStudentLevel() == Level.LEVEL100){
//                System.out.println(s);
//            }
//        }





//        System.out.println(lecturer);
    }
}
