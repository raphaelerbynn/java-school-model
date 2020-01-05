package com.company;
enum Level{
    LEVEL100, LEVEL200, LEVEL300, LEVEL400;
}

public class Student {
    private int id;
    private String name;
    private Level studentLevel;

    public Student(int id, String name, Level studentLevel) {
        this.id = id;
        this.name = name;
        this.studentLevel = studentLevel;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Level getStudentLevel() {
        return studentLevel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studentLevel=" + studentLevel +
                '}';
    }
}
