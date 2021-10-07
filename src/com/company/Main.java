package com.company;

public class Main {

    public static void main(String[] args) {
        Mother[] arrayDad = {createObject("Eldest_Daughter"), createObject("Son"), createObject("Younger_Daughter")};
        for (Mother a : arrayDad) {
            a.print();

        }

    }

    public static Mother createObject(String className) {
        switch (className) {
            case "Eldest_Daughter":
                Eldest_Daughter Masha = new Eldest_Daughter(19, "Masha", 185);
                return Masha;
            case "Son":
                Son Artem = new Son(13, "Artem", "drawing");
                return Artem;
            case "Younger_Son":
                Younger_Daughter Katya = new Younger_Daughter(8, "Misha", "Samsung");
                return Katya;

        }
        return null;
    }
}
