package com.company.util;

import com.company.DoubleLinkedList;

public class LinkedListUtils {

    public static DoubleLinkedList intArrayToList(int[] array) {
        DoubleLinkedList list = new DoubleLinkedList();
        for (int j : array) {
            list.addLast(j);
        }
        return list;
    }

    public static int[] intListToArray(DoubleLinkedList list) throws IllegalStateException {
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}