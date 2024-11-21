package oo;

import java.util.ArrayList;
import java.util.List;
public class Teacher extends Person {
    private List<Klass> klassList;
    public Teacher(int id, String name, int age) {
        super(id, name, age);
        klassList = new ArrayList<Klass>();
    }
    public String introduce() {
        StringBuilder introduce = new StringBuilder(super.introduce());
        introduce.append(" I am a teacher. I teach Class ");
        for (int i = 0; i < klassList.size(); i++) {
            introduce.append(klassList.get(i).getClassNumber());
            if (i != klassList.size() - 1) {
                introduce.append(", ");
            }
        }
        introduce.append(".");
        return introduce.toString();
    }

    public boolean belongsTo(Klass klass){
        return this.klassList.contains(klass);
    }

    public void assignTo(Klass klass) {
        this.klassList.add(klass);
    }
    public boolean isTeaching(Student student){
        return this.klassList.contains(student.getKlass());
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
