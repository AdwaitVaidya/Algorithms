package com;

import java.io.*;

public class Main {





    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new FileReader("Input.txt"));
        FileWriter output = new FileWriter("Output.txt");

        int[] unsortedArray = new int[Integer.parseInt(input.readLine())];

        for (int i = 0 ; i < unsortedArray.length ; i++ ){
            unsortedArray[i] = Integer.parseInt(input.readLine());
        }

        int[] sortedArray = selectionSort(unsortedArray,0);

        for (int x: sortedArray) {
            output.append(String.valueOf(x));
            output.append("\n");
        }



        input.close();
        output.close();



    }

    private static int[] selectionSort(int[] unsortedArray,int start) {
        if (start == unsortedArray.length-1) return unsortedArray;
        int c = unsortedArray[start];
        int index = 0;
        for (int i = start+1 ; i < unsortedArray.length ; i++){
            if (c>unsortedArray[i]){
                c = unsortedArray[i];
                index = i;
            }
        }
        int temp = unsortedArray[start];
        unsortedArray[start] = c;
        unsortedArray[index] = temp;

        ++start;

        return selectionSort(unsortedArray,start);
    }
}
