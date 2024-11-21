package oo;

public class Teacher extends Person {

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce(){
        StringBuilder introduce = new StringBuilder();
        return super.introduce() + " I am a teacher.";
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
