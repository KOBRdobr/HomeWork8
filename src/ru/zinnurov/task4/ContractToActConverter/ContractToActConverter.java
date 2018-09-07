package ru.zinnurov.task4.ContractToActConverter;
/*
 *@author Nail Zinnurov
 *           cobratms@gmail.com
 *           on ${DATE}
 */
public class ContractToActConverter {
    public static Act convertContracttoAct(Contract contract) {
        if(contract != null) {
            return null;
        }
        Act act = new Act();
        act.setId(contract.getId());
        act.setDate(contract.getDate());
        act.setNumber(contract.getNumber());

        return act;
    }
}


