package ru.zinnurov.task2;
import java.util.Scanner;

/*
 *@author Nail Zinnurov
 *           cobratms@gmail.com
 *           on ${DATE}
 */
public class Main {

    private static double input() {
        Scanner in = new Scanner(System.in);
        double choice;  //Переменная хранящая выбор пользователя

        while (true) {
            if (in.hasNextDouble()) {
                choice = in.nextDouble();
                break;
            } else {
                System.out.println("Введите числа!");
                in.next();
            }
        }

        return choice;
    }

    public static void main(String[] args) {
        double firstNum, secNum;
        String sign;

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        firstNum = input();
        System.out.println();

        System.out.print("Что сделать с числом: ");
        sign = in.next();
        System.out.println();

        System.out.print("Введите второе число: ");
        secNum = input();
        System.out.println();

        Calculator.chooseOperation(firstNum, secNum, sign);




    }
}
