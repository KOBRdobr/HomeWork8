package ru.zinnurov.task1.VendingMachine;
/*
 *@author Nail Zinnurov
 *           cobratms@gmail.com
 *           on ${DATE}
 */
public class VendingMachineForTea extends VendingMachine {
    private String[] hotDrinks = new String[] {"Чай черный", "Чай зеленый", "Кофе"};

    @Override
    protected String getDrink(int key){
        if(key > this.hotDrinks.length) {
            return "";
        }
        return this.hotDrinks[key];
    }
}
