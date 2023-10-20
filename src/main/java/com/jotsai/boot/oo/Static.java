package com.jotsai.boot.oo;

public class Static {
    public static void main(String[] args) {
        StaticPerson ming = new StaticPerson("Xiao Ming", 12);
        StaticPerson hong = new StaticPerson("Xiao Hong", 15);
        System.out.println(StaticPerson.count);
    }
}


class StaticPerson {
    public String name;
    public int age;

    public static int count;

    public StaticPerson(String name, int age) {
        this.name = name;
        this.age = age;
        StaticPerson.count++;
    }
}