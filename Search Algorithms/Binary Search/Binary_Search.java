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
        if (position == -1) {
        	System.out.println("value is lower than smallest number in array");
        }
		else if (position == -2) {
        	System.out.println("value is higher than largest number in array");
        }
        else if (position == -3) {
        	System.out.println("value isn't in the array");
        }

        else{
        	System.out.println(position);
        }
    }

    private static int binarySearchPosition(int value, int[] array, int start,int end) {
        if (value < array[start]) return -1;		// check if value is lower is lower than smallest value in array
        if (value > array[end]) return -2;		// check if value is higher is lower than highest value in array
        int mid = (start+end)/2;		//sets value of mid point
        if (value == array[mid]){
            return mid;			//return the location 
        }
        else if (value < array[mid]){
            return binarySearchPosition(value,array,start,mid-1);		//sends a recursion step with start point as start and the end point as mid
        }
        else if (value > array[mid]){
            return binarySearchPosition(value,array,mid+1,end);			//sends a recursion step with start point as mid and the end point as end
        }
        if (start+1 == end) return -3; 			// returns -3 to signify the value isnt present in the binary search
        return 0;			
    }
}
