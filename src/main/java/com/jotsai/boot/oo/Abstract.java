package com.jotsai.boot.oo;

public class Abstract {
    public static void main(String[] args) {
        // 给一个有普通收入、工资收入和稿费收入的小伙伴算税:
        AbstractIncome[] incomes = new AbstractIncome[] {
            new AbstractNormalIncome(3000),
            new AbstractSalary(7500),
            new AbstractAuthorRemuneration(15000)
        };
        System.out.println(totalTax(incomes));
    }

    public static double totalTax(AbstractIncome... incomes) {
        double total = 0;
        for (AbstractIncome income: incomes) {
            total = total + income.getTax();
        }
        return total;
    }
}

abstract class AbstractIncome {
    protected double income;

    public AbstractIncome(double income) {
        this.income = income;
    }

    public abstract double getTax();
}

class AbstractNormalIncome extends AbstractIncome {
    public AbstractNormalIncome(double income) {
        super(income);
    }

    public double getTax() {
        return income * 0.1;
    }
}

class AbstractSalary extends AbstractIncome {
    public AbstractSalary(double income) {
        super(income);
    }

    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}

class AbstractAuthorRemuneration extends AbstractIncome {
    public AbstractAuthorRemuneration(double income) {
        super(income);
    }

    public double getTax() {
        return Math.max(0, income - Math.max(800, income * 0.2)) * 0.2 * (1 - 0.3);
    }
}