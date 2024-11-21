package oo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    public static final String SPACE = " ";
    private List<Klass> klassList;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        klassList = new ArrayList<>();
    }

    public String introduce() {
        StringBuilder introduce = new StringBuilder(super.introduce());

        if (this.klassList == null || this.klassList.isEmpty()) {
            introduce.append(" I am a teacher.");
        } else {
            introduce.append(" I am a teacher.").append(SPACE).append("I teach Class ");
            String classNumbers = this.klassList.stream()
                    .map(klass -> String.valueOf(klass.getClassNumber()))
                    .collect(Collectors.joining(", "));
            introduce.append(classNumbers).append(".");
        }
        return introduce.toString();
    }

    public boolean belongsTo(Klass klass) {
        return this.klassList.contains(klass);
    }

    public void assignTo(Klass klass) {
        this.klassList.add(klass);
    }

    public List<Klass> getKlassList() {
        return klassList;
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