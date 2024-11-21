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
        // Check if the object is an instance of Person and is not null
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        // Cast the object to a Person
        Klass klass = (Klass) object;
        return classNumber == klass.classNumber;
    }
}
