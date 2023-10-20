package com.jotsai.boot.basic;

import java.util.Arrays;

public class ArrayExercise {
    public static void arraySort() {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        // 排序前:
        System.out.println(Arrays.toString(ns));

        // TODO:
//        Integer[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
//        Arrays.sort(ns, (a, b) -> Integer.compare(b, a));
        for (int i = 0; i < ns.length; i++) {
            for (int j = 0; j < ns.length - i - 1; j++) {
                if (ns[j] < ns[j+1]) {
                    int temp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = temp;
                }
            }
        }

        // 排序后:
        System.out.println(Arrays.toString(ns));
        if (Arrays.toString(ns).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }

    public static void arrayMultiple() {
        // 用二维数组表示的学生成绩:
        int[][] scores = {
                { 82, 90, 91 },
                { 68, 72, 64 },
                { 95, 91, 89 },
                { 67, 52, 60 },
                { 79, 81, 85 },
        };
        // TODO:
        double average = 0;
        int studentCount = 0;
        for (int[] scoreArray: scores) {
            for (int score: scoreArray) {
                studentCount++;
                average += score;
            }
        }
        average = average / studentCount;
        System.out.println(average);
        if (Math.abs(average - 77.733333) < 0.000001) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }

    public static void main(String[] args) {
        ArrayExercise.arraySort();
        ArrayExercise.arrayMultiple();
    }
}
