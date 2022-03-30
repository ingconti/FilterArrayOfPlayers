package org.example;

enum Gender {
    MALE, FEMALE
}

public class Person {

    private int age;
    private String name;
    private Gender sex;

    public Person(int age, String name, Gender sex) {

        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Gender getSex() {

        return sex;
    }

    public void setSex(Gender sex) {

        this.sex = sex;
    }


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}