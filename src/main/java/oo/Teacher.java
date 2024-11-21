package oo;

public class Teacher extends Person {
    private Klass klass;
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce(){
        StringBuilder introduce = new StringBuilder(super.introduce());
        return introduce.append(" I am a teacher. ").append("I teach  ").append(this.klass.getClassNumber()).append(".").toString();
    }

    public boolean belongsTo(Klass klass){
        return this.klass == klass;
    }

    public void assignTo(Klass klass) {
        this.klass =  klass;
    }
    public boolean isTeaching(Student student){
        return student.getKlass().getClassNumber() == klass.getClassNumber();
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
