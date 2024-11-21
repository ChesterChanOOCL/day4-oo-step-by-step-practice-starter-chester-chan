package oo;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    public static final String SPACE = " ";
    private List<Klass> klassList;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        klassList = new ArrayList<>();
    }

    public String introduce() {
        StringBuilder introduce = new StringBuilder(super.introduce());

        if (this.klassList.isEmpty() || this.klassList == null) {
            introduce.append(" I am a teacher.");
        } else {
            introduce.append(" I am a teacher.").append(SPACE).append("I teach Class ");
            for (int i = 0; i < this.klassList.size(); i++) {
                introduce.append(this.klassList.get(i).getClassNumber());
                if (i != this.klassList.size() - 1) {
                    introduce.append(", ");
                }
            }
            introduce.append(".");
        }
        return introduce.toString();
    }

    public boolean belongsTo(Klass klass) {
        return this.klassList.contains(klass);
    }

    public void assignTo(Klass klass) {
        this.klassList.add(klass);
    }

    public boolean isTeaching(Student student) {
        return this.klassList.contains(student.getKlass());
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}