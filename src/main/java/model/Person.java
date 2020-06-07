package model;


public class Person {

    public static final int ID_OF_NOT_PERSISTENT_PERSON = -1;

    private int id;
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.id = ID_OF_NOT_PERSISTENT_PERSON;
        this.name = name;
        this.gender = gender;
    }

    public Person(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender +
                '}';
    }
}
