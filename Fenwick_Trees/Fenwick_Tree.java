package com;

public class Main {
    static int reccurence(int[] array,int end,int numberOfTurns){
        int sum = 0;
        for (int i = end; i > end-numberOfTurns; i--) {
            sum+=array[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] array = {5,2,9,-3,5,20,10,-7,2,3,-4,0,-2,15,5};
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length ; i++) {
            String str = Integer.toBinaryString(i+1);
            if (str.equals("0")) {
                newArray[0] = array[0];
                continue;
            }
            int num = str.lastIndexOf('1');
            int  bt = (int) Math.pow(2,str.length() - (str.lastIndexOf('1')+1));
            newArray[i] =  reccurence(array,i,bt);

        }


        for (int num: newArray) {
            System.out.println(num);
        }






    }
}
