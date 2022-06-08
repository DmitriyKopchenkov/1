package ru.feduncov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

class PortTest {

    @Test
    void getArrayOfNumbers() {
        Port port = new Port(new String[]{"1,3-5", "2", "3-4"});
        int[] actual = port.getArrayOfNumbers();
        int[] expected = {1, 3, 4, 5, 2, 3, 4};
        Assertions.assertArrayEquals(expected, actual);

        Assertions.assertArrayEquals(new int[]{1}, new Port(new String[]{"1"}).getArrayOfNumbers());
        Assertions.assertArrayEquals(new int[]{}, new Port(new String[]{}).getArrayOfNumbers());
    }

    @Test
    void getUniqueGroupsElements() {
        Port port = new Port(new String[]{"1,3-5", "2", "3-4"});
        Set<List<Integer>> actual = port.getUniqueGroupsElements();
        Set<List<Integer>> expected = Set.of(List.of(1, 2, 3),
                List.of(1, 2, 4), List.of(3, 2, 3), List.of(3, 2, 4), List.of(4, 2, 3),
                List.of(4, 2, 4), List.of(5, 2, 3), List.of(5, 2, 4));
        Assertions.assertEquals(expected, actual);
    }
}