package com.jotsai.boot.oo;

public class Construct {
    public static void main(String[] args) {
        // TODO: 给Person增加构造方法:
        ConstructPerson ming = new ConstructPerson("小明", 12);
        System.out.println(ming.getName());
        System.out.println(ming.getAge());
    }
}

class ConstructPerson {
    private String name;
    private int age;

    public ConstructPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
