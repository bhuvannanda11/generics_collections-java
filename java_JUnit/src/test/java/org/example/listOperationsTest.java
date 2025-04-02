package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class listOperationsTest {
    @Test
    public void testAddElement() {
        List<Integer> list = new ArrayList<>();
        listOperations.addElement(list, 5);
        assertTrue(list.contains(5));
    }

    @Test
    public void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        listOperations.removeElement(list, 5);
        assertFalse(list.contains(5));
    }
    @Test
    public void testGetSize() {
        List<Integer> list = new ArrayList<>();
        assertEquals(0, listOperations.getSize(list));

        listOperations.addElement(list, 10);
        assertEquals(1, listOperations.getSize(list));

        listOperations.removeElement(list, 10);
        assertEquals(0, listOperations.getSize(list));
    }

}