import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int[] array;
        int length = Integer.parseInt(input.nextLine());
        array = new int[length];
        for (int i = 0 ; i < length ; i++ ) {
            array[i] =  Integer.parseInt(input.nextLine());
        }
        int value =  Integer.parseInt(input.nextLine());


        int position = binarySearchPosition(value,array,0,array.length-1);
        System.out.println(position);
    }

    private static int binarySearchPosition(int value, int[] array, int start,int end) {
        if (value < array[start]) return -1;
        if (value > array[end]) return -1;
        int mid = (start+end)/2;
        if (value == array[mid]){
            return mid;
        }
        else if (value < array[mid]){
            return binarySearchPosition(value,array,start,mid-1);
        }
        else if (value > array[mid]){
            return binarySearchPosition(value,array,mid+1,end);
        }
        if (start+1 == end) return -1;
        return 0;
    }
}
