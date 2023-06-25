package com.ramaguru.amrita.cys.jpl.datastructures;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The ArrayListExample class demonstrates the usage of ArrayList to store and iterate over a collection of student roll numbers.
 * It creates an ArrayList of student roll numbers, adds student roll numbers to it, and uses an Iterator to traverse and print the student roll numbers.
 * This class provides a basic example of working with ArrayList in Java.
 *
 * Usage:
 * - The program creates an ArrayList of strings to represent student roll numbers.
 * - It adds student roll numbers to the ArrayList.
 * - It retrieves an Iterator from the ArrayList to iterate over its elements.
 * - It uses the Iterator to print the student roll numbers one by one.
 *
 * Note: This example uses a simple ArrayList of strings and manually retrieves and prints the elements.
 *
 * Dependencies:
 * - None
 *
 * @author Deepthi J
 * @version 0.5
 */
public class ArrayListExample {
    /**
     * The main method is the entry point of the program.
     * It demonstrates the usage of ArrayList to store and iterate over a collection of student roll numbers.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Make a collection
        ArrayList<Integer> u21cys = new ArrayList<Integer>();

        // ArrayList<String> u21cys = new ArrayList<String>();
        //int rollNumber[] = new double[5];


        u21cys.add(21026);
        u21cys.add(21027);
        u21cys.add(21028);
        u21cys.add(21029);
        u21cys.add(21030);
        // Get the iterator
        Iterator<Integer> it = u21cys.iterator();

        // Print the cars using the iterator
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
    }
}