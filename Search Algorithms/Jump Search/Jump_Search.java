package com;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int length = Integer.parseInt(input.nextLine());
        int[] array =new int[length];

        for (int i =0;i<length;i++){
            array[i] = Integer.parseInt(input.nextLine());
        }

        int value = Integer.parseInt(input.nextLine());
        int jumpValue = 7;
        if (array[0] > value) {
            System.out.println("The number is smaller than the smallest number in the array");
            return;
        }
        if (array[array.length-1] < value) {
            System.out.println("The number is larger than the largest number in the array");
            return;
        }
        int position = jumpSearch(array,value,jumpValue,0);
        if (position==-1) System.out.println("THe value is not present in the array");
        else {
            System.out.println(position+1);
        }

    }

    private static int jumpSearch(int[] array, int value, int jumpValue,int startPosition) {
        if (array[startPosition] == value) return value;
        if (array[startPosition] < value) return jumpSearch(array,value,jumpValue,startPosition+jumpValue);
        else{
            for (int i = startPosition-1;i>startPosition-jumpValue;i--){
                if (array[i]== value)return i;
            }
        }
        return -1;
    }
}
