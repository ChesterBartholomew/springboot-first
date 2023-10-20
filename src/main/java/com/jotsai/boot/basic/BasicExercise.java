package com.jotsai.boot.basic;

import java.util.Scanner;

public class BasicExercise {
    public static void basicInteger(int n) {
        // 整型练习
        // int n = 100;
        // TODO: sum = 1 + 2 + ... + n
        int sum = (1 + n) * n / 2;
        System.out.println(sum);
        System.out.println(sum == 5050 ? "测试通过" : "测试失败");
    }

    public static void basicFloat(double a, double b, double c) {
        // 浮点数练习
//        double a = 1.0;
//        double b = 3.0;
//        double c = -4.0;
        // 求平方根可用 Math.sqrt():
        // System.out.println(Math.sqrt(2)); ==> 1.414
        // TODO:
        double middleSqrt = Math.sqrt(b * b - 4 * a * c);
        double r1 = (0 - b + middleSqrt) / ( 2 * a );
        double r2 = (0 - b - middleSqrt) / ( 2 * a );
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == 1 && r2 == -4 ? "测试通过" : "测试失败");
    }

    public static void basicBoolean(int age) {
        // 布尔型练习
        // int age = 7;
        // primary student的定义: 6~12岁
        boolean isPrimaryStudent = age >= 6 && age <= 12;
        System.out.println(isPrimaryStudent ? "Yes" : "No");
    }

    public static void basicCharString() {
        // 请将下面一组int值视为字符的Unicode码，把它们拼成一个字符串：
        int a = 72;
        int b = 105;
        int c = 65281;
        // FIXME:
        String s = "" + (char) a + (char) b + (char) c;
        System.out.println(s);
    }

    public static void basicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("上次考试成绩: ");
        int lastScore = scanner.nextInt();
        System.out.print("本次考试成绩: ");
        int thisScore = scanner.nextInt();
        System.out.printf("成绩提高的百分比: %.2f%%\n", (thisScore - lastScore) * 100.0 / lastScore);
    }

    public static void main(String[] args) {
        BasicExercise.basicInteger(100);
        BasicExercise.basicFloat(1.0, 3.0, -4.0);
        BasicExercise.basicBoolean(7);
        BasicExercise.basicCharString();
        BasicExercise.basicInputOutput();
    }
}
