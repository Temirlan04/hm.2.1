package com.company;

public class Younger_Daughter extends Mother implements Printable{
    private String mobilePhone;

    public Younger_Daughter(int age, String name, String mobilePhone) {
        super(age, name);
        this.mobilePhone = mobilePhone;
    }

    @Override
    public void print() {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(mobilePhone);
    }
}
