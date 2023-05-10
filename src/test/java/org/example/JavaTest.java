package org.example;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


class JavaTest {

    @Test
    void whenInputListIsEmpty_ThenReturnEmptyMap() {
        List<Integer> testEmptyInput = new ArrayList<>();
        Map<Integer, Integer> result = Java.countElements(testEmptyInput);
        assertEquals(0, result.size());
    }

    @Test
    void whenInputTest1() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(5);
        list.add(4);
        Map<Integer, Integer> result = Java.countElements(list);
        assertEquals(4, result.size());
        assertEquals(2, result.get(1));
        assertEquals(2, result.get(4));
        assertEquals(1, result.get(3));
        assertEquals(2, result.get(5));

    }

    @Test
    void whenSameNumbers() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        Map<Integer, Integer> result = Java.countElements(list);
        assertEquals(1, result.size());
        assertEquals(3, result.get(1));
    }
}