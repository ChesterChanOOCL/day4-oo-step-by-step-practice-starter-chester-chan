package oo;

public class Klass {

    private int classNumber ;
    private Student leader;
    public Klass(int classNumber){
        this.classNumber = classNumber;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public boolean isLeader(Student student){
        return student.equals(leader);
    }

    public void assignLeader(Student student){
        if (student.getKlass() == null || student.getKlass().getClassNumber() != this.classNumber){
            System.out.print("It is not one of us.\n");
        }
        else {
            this.leader = student;
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
}
