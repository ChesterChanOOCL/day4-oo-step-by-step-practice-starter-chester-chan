package oo;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public void join(Klass klass) {
        if (klass != null) {
            this.klass = klass;
        }
    }

    public boolean isIn(Klass klass) {
        if (this.klass == null) {
            return false ;
        }
        return this.klass.equals(klass);
    }
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String introduce() {
        StringBuilder introduce = new StringBuilder(super.introduce());
        introduce.append(" I am a student.");
        if (klass != null) {
            introduce.append(" I am in class ").append(klass.getClassNumber()).append(".");
        }
        return introduce.toString();
    }
}