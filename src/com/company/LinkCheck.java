package com.company;

public class LinkCheck {

    public static boolean areNodesLinked(DoubleLinkedList list) {
        boolean result = true;
        if (list.size() > 0) {
            for (int i = 0; i < list.size() - 1; i++) {
                if ((list.get(i) != list.getPrev(i + 1)) && (list.getNext(i) != list.get(i + 1))) {
                    result = false;
                }
            }
        }
        return result;
    }
}
