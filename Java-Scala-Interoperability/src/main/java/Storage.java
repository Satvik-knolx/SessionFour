package com.knoldus;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private final List<Integer> elements = new ArrayList<Integer>();

    // add an element to the list of elements
    public void addElement(int element) {
        elements.add(element);
    }

    // remove an element from the list of elements
    public void removeElement(int element) {
        elements.remove(Integer.valueOf(element));
    }

    // remove all elements from the list of elements
    public void removeAll() {
        elements.clear();
    }

    // check if the list of elements contains the specified element
    public boolean checkIfContains(int element) {
        return elements.contains(element);
    }
}
