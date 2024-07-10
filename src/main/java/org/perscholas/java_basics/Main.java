package org.perscholas.java_basics;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        addInt(12, 10);
        addDouble(5.5, 5.5);
        addIntDouble(10, 5.5);
        returnLargerNum(10, 500);
        twoDoubles(12.2, 24.2);
        printQ();
        printCalculation(10);
        cafeStuff(2, "coffee");
    }
    public static void addInt(int x, int y) {
        int z = x + y;
        System.out.printf("1) The Sum of %d, and %d is %d%n", x, y, z);
    }

    public static void addDouble(double x, double y) {
        double z = x + y;
        System.out.printf("2) The Sum of %f, and %f is %f%n", x, y, z);
    }

    public static void addIntDouble(int x, double y) {
        double z = x + y;
        System.out.printf("3) The Sum of %d, and %f is %f%n", x, y, z);
    }

    public static void returnLargerNum(int x, int y) {
        double largerNum;
        int smallerNum;

        if (x > y) {
            largerNum = x;
            smallerNum = y;
            double z = largerNum / smallerNum;
            System.out.printf("4) The larger of the two numbers" +
                    " is %f, while the smaller number is %d, " +
                    "and %d divided by %d " +
                    "is equal to %f%n ", largerNum, smallerNum, x, y, z);
        }
        if (x < y) {
            largerNum = y;
            smallerNum = x;
            double z = largerNum / smallerNum;
            System.out.printf("4) The larger of the two numbers" +
                    " is %f, while the smaller number " +
                    "is %d, and %d divided by %d " +
                    "is equal to %f%n", largerNum, smallerNum, x, y, z);
        }
    }

    public static void twoDoubles(double x, double y) {
        double isLarger = Math.max(x, y);
        if (isLarger == x) {
            double largerNum;
            largerNum = x;
            double smallerNum;
            smallerNum = y;
            double z = largerNum / smallerNum;
            System.out.printf("5) The larger of the two numbers" +
                    " is %f, while the smaller number is %f, " +
                    "and %f divided by %f " +
                    "is equal to %d%n", largerNum, smallerNum, x, y, (int) z);
        }
        if (isLarger == y) {
            double largerNum;
            largerNum = y;
            double smallerNum;
            smallerNum = x;
            double z = largerNum / smallerNum;
            System.out.printf("5) The larger of the two numbers" +
                    " is %f, while the smaller number is %f, and" +
                    " %f divided by %f " +
                    "is equal to %d%n", largerNum, smallerNum, x, y, (int) z);
        }
    }

    public static void printQ() {
        int x;
        x = 5;
        int y;
        y = 6;

        int q = y / x;
        System.out.printf("6) %d divided by %f is %d%n", x, (double) y, q);
    }

    public static void printCalculation(int x) {
        int y = 10;
        int z = x * y;
        System.out.printf("7) The Sum of %d, and %d is %d%n", x, y, z);
    }

    public static void cafeStuff(int num, String prod) {
        int coffee;
        coffee = 2;
        int cappuccino;
        cappuccino = 3;
        int espresso;
        espresso = 3;
        int greenTea;
        greenTea = 1;

        int subTotal = 0;

        switch (prod) {
            case "coffee":
                subTotal += (coffee * num);
                break;
            case "cappuccino":
                subTotal += (cappuccino * num);
                break;
            case "espresso":
                subTotal += (espresso * num);
                break;
            case "greenTea":
                subTotal += (greenTea * num);
                break;
            default:
                subTotal += 0;
                num = 0;
        }
        final double salesTax;
        salesTax = subTotal * 0.10;

        double totalSale;
        totalSale = (double) subTotal + salesTax;
        System.out.printf("8) You ordered %d order/s of %s.", num, prod);
        System.out.printf("\nYour total is %f%n", totalSale);
//
    }
}