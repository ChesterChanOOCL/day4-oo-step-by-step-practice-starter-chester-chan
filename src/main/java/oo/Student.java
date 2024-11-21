package oo;

public class Student extends Person {

    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce() {
        StringBuilder introduce = new StringBuilder(super.introduce());
        return introduce.append(" I am a student. ").append("I am in class ").append(this.klass.getClassNumber()).append(".").toString();
    }
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    public boolean isIn(Klass klass){
        return this.klass == klass;
    }

    public void join(Klass klass) {
         this.klass =  klass;
    }
}
