package com.mycompany.springbasic1102.di;

public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" + "name=" + name + '}';
    }
    
    
}