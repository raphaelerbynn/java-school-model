package com.company;

import java.util.List;

public class Lecturer {
    private String name;
    private List<Student> students;

    public Lecturer(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }


    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
