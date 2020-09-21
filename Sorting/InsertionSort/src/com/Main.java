package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader("Input.txt"));
        FileWriter output = new FileWriter("Output.txt");

        int[] unsortedArray = new int[Integer.parseInt(input.readLine())];

        int[] sortedArray = insertionSort(unsortedArray);











    }

    private static int[] insertionSort(int[] unsortedArray) {

        return  unsortedArray;
    }
}
