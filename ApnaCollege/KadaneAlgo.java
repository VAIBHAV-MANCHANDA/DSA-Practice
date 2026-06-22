import java.util.*;
public class KadaneAlgo {
    public static void main(String[] args){

    }

    public static void sum(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array");
        int l = sc.nextInt();
        
        System.out.println("Enter values");
        int[] arr = new int[l];
        for(int i=0; i<l; i++){
            arr[i]=sc.nextInt();
        }

        // Kadane's Algo
        int maxSum = arr[0], currSum = arr[0];
        for(int i=1; i<l; i++){

            // either taking alone new element or 
            // new element + current sum (prev subarray)
            currSum = Math.max(arr[i], arr[i] + currSum);

            maxSum = Math.max(maxSum, currSum);
        }
    }
}
