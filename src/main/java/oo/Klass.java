package oo;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    private int classNumber;
    private Student leader;
    private List<Student> students;
    private List<Teacher> teachers;

    public Klass(int classNumber) {
        this.classNumber = classNumber;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public void assignLeader(Student student) {
        if (student.getKlass() == null || student.getKlass().getClassNumber() != this.classNumber) {
            System.out.print("It is not one of us.\n");

        } else {
            this.leader = student;
            students.add(student);
            notifyTeachers(student);
            notifyStudents(student);
        }
    }

    public boolean isLeader(Student student) {
        return student.equals(leader);
    }

    public void attach(Student student) {
        students.add(student);
    }
    public void attach(Teacher teacher) {
        teachers.add(teacher);
    }

    private void notifyTeachers(Student student) {
        for (Teacher teacher : teachers) {
            System.out.println("I am " + teacher.getName() + ", teacher of Class " + this.classNumber + ". I know " + student.getName() + " become Leader.");
        }
    }

    private void notifyStudents(Student student) {
        for (Student s : students) {
            if (!s.getName().equals(student.getName())) {
                System.out.println("I am " + s.getName() + ", student of Class " + this.classNumber + ". I know " + student.getName() + " become Leader.");
            }
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Klass klass = (Klass) object;
        return classNumber == klass.classNumber;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}