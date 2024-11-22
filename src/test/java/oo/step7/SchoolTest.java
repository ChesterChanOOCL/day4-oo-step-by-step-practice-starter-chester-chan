package oo.step7;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import oo.Klass;
import oo.School;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SchoolTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));
    }

    private String systemOut() {
        return outContent.toString();
    }
//    @Test
//    public void should_print_message_when_assign_leader_given_another_student_is_in_the_class() {
//        Klass klass = new Klass(2);
//        Student bob = new Student(1, "Bob", 18);
//        bob.join(klass);
//        klass.attach(bob);
//        Student tom = new Student(1, "Tom", 18);
//        tom.join(klass);
//
//        klass.assignLeader(tom);
//
//        assertThat(systemOut()).contains("I am Bob, student of Class 2. I know Tom become Leader.");
//    }
//    @Test
//    public void should_introduce_all_teachers_and_students_when_start_school() {
//        School school = new School();
//        Klass klass = new Klass(2);
//        Student bob = new Student(1, "Bob", 18);
//        bob.join(klass);
//        klass.attach(bob);
//        Student tom = new Student(1, "Tom", 18);
//        tom.join(klass);
//        klass.attach(tom);
//        Teacher jerry = new Teacher(1, "Jerry", 21);
//        jerry.assignTo(klass);
//        klass.attach(jerry);
//        school.addKlass(klass);
//
//        school.startSchool();
//
//        assertThat(systemOut()).contains("My name is Bob. I am 18 years old. I am a student. I am in class 2.",
//                "My name is Tom. I am 18 years old. I am a student. I am in class 2.",
//                "My name is Jerry. I am 21 years old. I am a teacher. I teach Class 2.");
//    }
}
