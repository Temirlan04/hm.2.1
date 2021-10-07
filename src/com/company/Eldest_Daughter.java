package com.company;

public class Eldest_Daughter extends Mother {
    private int height;

    public Eldest_Daughter(int age, String name, int height) {
        super(age, name);
        this.height = height;
    }

    @Override
    public void print() {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(height);

    }
}
