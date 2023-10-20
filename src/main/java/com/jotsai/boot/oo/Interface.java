package com.jotsai.boot.oo;

public class Interface {
    public static void main(String[] args) {
        // 给一个有普通收入、工资收入和稿费收入的小伙伴算税:
        InterfaceIncome[] incomes = new InterfaceIncome[] {
            new InterfaceNormalIncome(3000),
            new InterfaceSalary(7500),
            new InterfaceAuthorRemuneration(15000)
        };
        System.out.println(totalTax(incomes));
    }

    public static double totalTax(InterfaceIncome... incomes) {
        double total = 0;
        for (InterfaceIncome income: incomes) {
            total = total + income.getTax();
        }
        return total;
    }
}

interface InterfaceIncome {
    double getTax();
}

abstract class InterfaceAbstractIncome {
    protected double income;

    public InterfaceAbstractIncome(double income) {
        this.income = income;
    }
}


class InterfaceNormalIncome extends InterfaceAbstractIncome implements InterfaceIncome {
    public InterfaceNormalIncome(double income) {
        super(income);
    }

    public double getTax() {
        return income * 0.1;
    }
}

class InterfaceSalary extends InterfaceAbstractIncome implements InterfaceIncome {
    public InterfaceSalary(double income) {
        super(income);
    }

    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}

class InterfaceAuthorRemuneration extends InterfaceAbstractIncome implements InterfaceIncome {
    public InterfaceAuthorRemuneration(double income) {
        super(income);
    }

    public double getTax() {
        return Math.max(0, income - Math.max(800, income * 0.2)) * 0.2 * (1 - 0.3);
    }
}