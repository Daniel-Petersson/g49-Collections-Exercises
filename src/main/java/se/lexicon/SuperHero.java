package se.lexicon;

public class SuperHero implements Comparable<SuperHero> {
    //Add fields for Id,Name and Age + getters and
    //setters. Have the class implement the Comparable interface
    //Fields
    private int id;
    private String name;
    private int age;

    //Constructors

    public SuperHero(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //Getters


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(SuperHero superHero) {
        if (this.age == superHero.age) {
            return 0;
        } else if (this.age > superHero.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
