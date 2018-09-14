package ru.zinnurov.task1;
/*
 *@author Nail Zinnurov
 *           cobratms@gmail.com
 *           on ${DATE}
 */
import ru.zinnurov.task1.VendingMachine.VendingMachine;

public class Main {

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine(new String[] {"Кока-кола", "Спрайт", "Фанта"});

        vm.addMoney(100);
        vm.giveMeADrink(4);

        VendingMachine vmft = new VendingMachine(new String[] {"Чай черный", "Чай зеленый", "Кофе"});
        vmft.addMoney(150);
        vmft.giveMeADrink(1);
    }
}
