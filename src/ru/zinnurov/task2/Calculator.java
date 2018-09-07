package ru.zinnurov.task2;
/*
 *@author Nail Zinnurov
 *           cobratms@gmail.com
 *           on ${DATE}
 */

public class Calculator {
    static double fitstNum, secNum;
    static String sign;
    static final int PERCENT = 100;

    public Calculator(double firstNum, double secNum, String sign) {
        this.fitstNum = firstNum;
        this.secNum = secNum;
        this.sign = sign;
    }

    public static void chooseOperation() {
        switch (sign) {
            case "+" :
                addition();
                break;
            case "-" :
                subtraction();
                break;
            case "/" :
                division();
                break;
            case "*" :
                multiplication();
                break;
            case "%" :
                percent();
                break;
            default:
                System.out.println("Введите знак операции!");
        }
    }

    private static void addition() {
        System.out.println("Ответ : " + (fitstNum + secNum));
    }

    private static void subtraction() {
        System.out.println("Ответ : " + (fitstNum - secNum));
    }

    private static void division() {
        if(secNum != 0) {
            System.out.println("Ответ : " + (fitstNum / secNum));
        }
        else {
            System.out.println("На ноль делить нелья!");
        }
    }

    private static void multiplication() {
        System.out.println("Ответ : " + (fitstNum * secNum));
    }

    private static void percent() {
        System.out.println("Ответ : " + ((fitstNum * secNum) / PERCENT));
    }


}
