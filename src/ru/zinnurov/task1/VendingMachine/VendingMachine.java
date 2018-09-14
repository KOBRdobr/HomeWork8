package ru.zinnurov.task1.VendingMachine;
/*
 *@author Nail Zinnurov
 *           cobratms@gmail.com
 *           on ${DATE}
 */
public class VendingMachine {
    private double money = 0;
    private String[] drinks;

    public VendingMachine(String[] drinks) {
        this.drinks = drinks;
    }

    public void addMoney(double money) {
        this.money = money;
    }

    protected String getDrink(int key){
        if(key > this.drinks.length) {
            return null;
        }
        return this.drinks[key];
    }

    public void giveMeADrink(int key){
        if (this.money > 0) {
            String drink = getDrink(key);
            if (drink == null) {
                System.out.println("Такого напитка нет!");
            } else {
                System.out.println("Возьмите ваш напиток: " + drink);
            }
        } else {
            System.out.println("Бесплатно не работаем!");
        }
    }
}
