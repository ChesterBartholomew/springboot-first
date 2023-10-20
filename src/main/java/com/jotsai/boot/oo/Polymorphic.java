package com.jotsai.boot.oo;

public class Polymorphic {
    public static void main(String[] args) {
        // 给一个有普通收入、工资收入和稿费收入的小伙伴算税:
        PolymorphicIncome[] incomes = new PolymorphicIncome[] {
                new PolymorphicIncome(3000),
                new PolymorphicSalary(7500),
                new PolymorphicAuthorRemuneration(15000)
        };
        System.out.println(totalTax(incomes));
    }

    public static double totalTax(PolymorphicIncome... incomes) {
        double total = 0;
        for (PolymorphicIncome income: incomes) {
            total = total + income.getTax();
        }
        return total;
    }
}

class PolymorphicIncome {
    protected double income;

    public PolymorphicIncome(double income) {
        this.income = income;
    }

    public double getTax() {
        return income * 0.1; // 税率10%
    }
}

class PolymorphicSalary extends PolymorphicIncome {
    public PolymorphicSalary(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}

class PolymorphicAuthorRemuneration extends PolymorphicIncome {
    public PolymorphicAuthorRemuneration(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return Math.max(0, income - Math.max(800, income * 0.2)) * 0.2 * (1 - 0.3);
    }
}