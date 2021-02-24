package com.spring.model;

public class Person {

    private int age;
    private String name;

    public Person(final String name, final int age){
        this.age = age;
        this.name = name;
    }

    public Person() {

    }

    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    @Override
    public String toString(){
        return "Person [name = " +this.name + " ]";
    }
}
