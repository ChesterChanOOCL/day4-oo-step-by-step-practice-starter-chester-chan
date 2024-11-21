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

    public void addStudent(Student student) {
        students.add(student);
    }

    public void startSchool() {
        for (Teacher teacher : teachers) {
            for (Klass klass : teacher.getKlassList()) {
                System.out.println("I am " + teacher.getName() + ", teacher of Class " + klass.getClassNumber() + ".");
            }
        }

        for (Student student : students) {
            if (student.getKlass() != null) {
                System.out.println("I am " + student.getName() + ", student of Class " + student.getKlass().getClassNumber() + ".");
            }
        }
    }
}