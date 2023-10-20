package com.jotsai.boot.basic;

import java.util.HashMap;
import java.util.Scanner;

public class FlowExercise {
    public static void flowIf(double height, double weight) {
        double bmi = weight / (height * height);
        String result;
        if (bmi < 18.5) {
            result = "过轻";
        } else if (bmi < 25) {
            result = "正常";
        } else if (bmi < 28) {
            result = "过重";
        } else if (bmi < 32) {
            result = "肥胖";
        } else {
            result = "非常肥胖";
        }
        System.out.printf("身高：%.2f，体重：%.2f，BMI：%.2f，结果：%s\n", height, weight, bmi, result);
    }

    public static HashMap<Integer, String> numberChooseMap = new HashMap<Integer, String>() {{
        put(1, "剪刀");
        put(2, "石头");
        put(3, "布");
    }};

    public static void flowSwitch() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n请输入数字选择剪刀石头布，1=剪刀，2=石头，3=布\n第1次选择：");
        int chooseOne = scanner.nextInt();
        System.out.print("第2次选择：");
        int chooseTwo = scanner.nextInt();
        String result;

        switch (chooseOne * 10 + chooseTwo) {
            case 13:
            case 31:
                result = "剪刀胜";
                break;
            case 12:
            case 21:
                result = "石头胜";
                break;
            case 23:
            case 32:
                result = "布胜";
                break;
            default:
                result = "平局";
                break;
        }

        System.out.printf(
            "%s VS %s, %s",
            FlowExercise.numberChooseMap.get(chooseOne),
            FlowExercise.numberChooseMap.get(chooseTwo),
            result
        );
    }

    public static void flowWhile(int m, int n) {
        int sum = 0;
        // 使用while计算M+...+N:
        while (m <= n) {
            sum += m++;
        }
        System.out.println(sum);
    }

    public static void flowDoWhile(int m, int n) {
        int sum = 0;
        // 使用do while计算M+...+N:
        do {
            sum += m++;
        } while (m <= n);
        System.out.println(sum);
    }

    public static void flowFor1() {
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int i=ns.length - 1; i >= 0; i--) {
            System.out.println(ns[i]);
        }
    }

    public static void flowFor2() {
        int[] ns = { 1, 4, 9, 16, 25 };
        int sum = 0;
        for (int n: ns) {
            sum += n;
        }
        System.out.println(sum); // 55
    }

    public static void flowFor3(int n) {
        double pi = 0;
        for (int i=0; i<n; i++) {
            double m = 4 * (1.0 / (1 + 2 * i));
            if (i % 2 == 0) {
                pi += m;
            } else {
                pi -= m;
            }
        }
        System.out.println(pi);
    }

    public static void main(String[] args) {
        FlowExercise.flowIf(1.76, 86.0);
        // FlowExercise.flowSwitch();
        FlowExercise.flowWhile(20, 100);
        FlowExercise.flowDoWhile(20, 100);
        FlowExercise.flowFor1();
        FlowExercise.flowFor2();
        FlowExercise.flowFor3(10000);
    }
}
