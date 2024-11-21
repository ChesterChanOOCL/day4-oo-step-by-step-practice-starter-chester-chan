package oo;

public class Klass {

    private int classNumber ;

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
