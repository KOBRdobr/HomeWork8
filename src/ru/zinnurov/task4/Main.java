package ru.zinnurov.task4;

import ru.zinnurov.task4.ContractToActConverter.Act;
import ru.zinnurov.task4.ContractToActConverter.Contract;
import ru.zinnurov.task4.ContractToActConverter.ContractToActConverter;
/*
 *@author Nail Zinnurov
 *           cobratms@gmail.com
 *           on ${DATE}
 */
public class Main {
    public static void main(String[] args) {
        Contract contract = new Contract();
        contract.setNumber("4");
        /*...*/
        Act act = ContractToActConverter.convertContracttoAct(contract);
    }
}
