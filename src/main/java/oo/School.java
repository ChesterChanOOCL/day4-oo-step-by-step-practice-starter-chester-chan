package oo;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;

    public School() {
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
}