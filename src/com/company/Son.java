package com.company;

public class Son extends Mother implements Printable{
    private String hobby;

    public Son(int age, String name, String hobby) {
        super(age, name);
        this.hobby = hobby;
    }


    @Override
    public void print() {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(hobby);

    }
}

