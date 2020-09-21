package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("Input.txt");
        /*writer.write("20");
        writer.write("\n");

        for(int i = 0 ; i < 20 ; i ++){
            writer.write(String.valueOf(i*3));
            writer.write("\n");
        }

        writer.write("16");

        writer.close();*/
        BufferedReader input = new BufferedReader(new FileReader("Input.txt"));
        int length = 20; //Integer.parseInt(input.readLine());

        int[] array = new int[length];
        for(int i = 0; i<length;i++) array[i] = i*3;// Integer.parseInt(input.readLine());

        int value = 16;// Integer.parseInt(input.readLine());

        if (value < array[0]){
            System.out.println("The number is smaller than the smallest number in the array");
            return;
        }
        if (value > array[array.length-1]) {
            System.out.println("The number is larger than the largest number in the array");
            return;
        }

        int position = interpolationSearch(array,value,0,array.length-1);

        System.out.println(position);


    }

    private static int interpolationSearch(int[] array, int value, int start, int end) {
        int pos = start + ((value-array[start])*(end-start) / (array[end]-array[start]));
        if (array[pos]==value) return pos;
        else if (value>array[pos]) return interpolationSearch(array,value,pos+1,end);
        else if(value<array[pos]) return interpolationSearch(array,value,start,pos-1);




        return -1;
    }
}
