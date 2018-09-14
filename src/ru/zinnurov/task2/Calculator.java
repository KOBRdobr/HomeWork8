package ru.zinnurov.task2;
/*
 *@author Nail Zinnurov
 *           cobratms@gmail.com
 *           on ${DATE}
 */

public class Calculator {
    static final int PERCENT = 100;


    public static void chooseOperation(double firstNum, double secNum, String sign) {
        double result;

        switch (sign) {
            case "+" :
                result = addition(firstNum, secNum);
                System.out.println("Ответ: " + result);
                break;
            case "-" :
                result = subtraction(firstNum, secNum);
                System.out.println("Ответ: " + result);
                break;
            case "/" :
                result = division(firstNum, secNum);
                System.out.println("Ответ: " + result);
                break;
            case "*" :
                result = multiplication(firstNum, secNum);
                System.out.println("Ответ: " + result);
                break;
            case "%" :
                result = percent(firstNum, secNum);
                System.out.println("Ответ: " + result);
                break;
            default:
                System.out.println("Введите знак операции!");
        }
    }

    private static double addition(double firstNum, double secNum) {
        return  (firstNum + secNum);
    }

    private static double subtraction(double firstNum, double secNum) {
        return (firstNum - secNum);
    }

    private static double division(double firstNum, double secNum) {
        if(secNum != 0) {
            return (firstNum / secNum);
        }
        else {
            throw new ArithmeticException("Нельзя делить на ноль!");
        }
    }

    private static double multiplication(double firstNum, double secNum) {
        return  (firstNum * secNum);
    }

    private static double percent(double firstNum, double secNum) {
        return ((firstNum * secNum) / PERCENT);
    }


}
