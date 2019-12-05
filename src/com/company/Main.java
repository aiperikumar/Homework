package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать!");
        String[] names = {"Белла","Эдвард","Джейкоб"};

        for (String name:names) {
            switch (name) {
                case "Белла":
                    System.out.println("Доброе утро, " + name + "!");
                    break;
                case "Эдвард":
                    System.out.println("Добрый день, " + name + "!");
                    break;
                case "Джейкоб":
                    System.out.println("Добрый вечер, " + name + "!");
                    break;
            }
        }

    }
    
}
