package ru.zinnurov.task3.ObjectCounter;
/*
 *@author Nail Zinnurov
 *           cobratms@gmail.com
 *           on ${DATE}
 *
 */
public class Counter {
    private static int count;

    public Counter() {
        count++;
        objectCounter();
    }

    private void objectCounter() {
        System.out.println("Создано объектов: " + count);
    }



}
