package ru.feduncov;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = {"1,3-5", "2", "3-4,5"};
        Port port = new Port(array);
        System.out.println(Arrays.toString(port.getArrayOfNumbers()));
        System.out.println(port.getUniqueGroupsElements());
    }
}
