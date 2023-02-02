package ru.kopchenkov;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = {"1,3-5", "2", "3-4,5"};// пример из задания создание массива строк
        Port port = new Port(array);
        System.out.println(Arrays.toString(port.getArrayOfNumbers()));//вывести на экран метод, преобразовывающий массив строк indexes в массив
        //последовательностей чисел;
        System.out.println(port.getUniqueGroupsElements());//вывести на экран метод, возвращающий все возможные упорядоченные пары элементов
        //полученных массивов чисел
    }
}
