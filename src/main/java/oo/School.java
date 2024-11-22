package oo;
import oo.Klass;
import oo.School;
import oo.Student;
import oo.Teacher;
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
        for (Teacher teacher : this.teachers) {
            for (Klass klass : teacher.getKlassList()) {
                System.out.println("I am " + teacher.getName() + ", teacher of Class " + klass.getClassNumber() + ".");
            }
        }

        for (Student student : this.students) {
            if (student.getKlass() != null) {
                System.out.println("I am " + student.getName() + ", student of Class " + student.getKlass().getClassNumber() + ".");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Staring school.....");
        School school = new School();
        Teacher tom = new Teacher(1, "Tom", 21);
        Student man = new Student(1, "Man", 8);
        Klass klass1 = new Klass(1);
         school.addStudent(man);
        school.addTeacher(tom);
        school.startSchool();;
    }

    public void addKlass(Klass klass) {
        for (Teacher teacher : teachers) {
            if (teacher.belongsTo(klass)) {
                teacher.assignTo(klass);
            }
        }
    }
}