package ru.zinnurov.task1;
/*
 *@author Nail Zinnurov
 *           cobratms@gmail.com
 *           on ${DATE}
 */
import ru.zinnurov.task1.VendingMachine.VendingMachine;
import ru.zinnurov.task1.VendingMachine.VendingMachineForTea;

public class Main {

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        vm.addMoney(100);
        vm.giveMeADrink(4);

        VendingMachineForTea vmft = new VendingMachineForTea();
        vmft.addMoney(150);
        vmft.giveMeADrink(1);
    }
}
