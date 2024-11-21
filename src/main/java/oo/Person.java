package oo;

public class Person {
    private final int id;
    private final String name;
    private final int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        StringBuilder introduce = new StringBuilder();
        introduce.append("My name is ").append(name).append(". I am ").append(age).append(" years old.");
        return introduce.toString();
    }

    //getName()
    public String getName() {
        return name;
    }
    @Override
     public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object == null || getClass() != object.getClass()) {
                return false;
            }
            Person person = (Person) object;
            return id == person.id;
    }
    public static void main(String[] args) {
        Person person1 = new Person(1, "John Doe", 30);
    }
}
