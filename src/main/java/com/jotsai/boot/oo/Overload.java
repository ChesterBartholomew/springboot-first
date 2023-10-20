package com.jotsai.boot.oo;

public class Overload {
    public static void main(String[] args) {
        OverloadPerson ming = new OverloadPerson();
        OverloadPerson hong = new OverloadPerson();
        ming.setName("Xiao Ming");
        // TODO: 给Person增加重载方法setName(String, String):
        hong.setName("Xiao", "Hong");
        System.out.println(ming.getName());
        System.out.println(hong.getName());
    }
}

class OverloadPerson {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(String first, String last) {
        this.name = first + " " + last;
    }
}
