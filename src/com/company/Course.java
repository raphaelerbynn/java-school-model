package com.company;

import java.util.List;


public class Course {

    private Lecturer lecturer;
    private List<Student> students;
    private Level courseLevel;

    public Course(Lecturer lecturer, List<Student> students, Level courseLevel) {
        this.lecturer = lecturer;
        this.students = students;
        this.courseLevel = courseLevel;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Level getCourseLevel() {
        return courseLevel;
    }
}
