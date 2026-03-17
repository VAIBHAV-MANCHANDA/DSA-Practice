import java.util.*;

public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int l = sc.nextInt();
        System.out.println("Enter values for array");
        int[] arr=new int[l];

        for(int i=0; i<l; i++){
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int i=0; i<l/2; i++){

            // System.out.println("Swapping " + arr[i] + " and " + arr[l-1-i]);

            temp=arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }
        System.out.println("Reversed array");
        for (int num : arr){
            System.out.println(num);
        }
 sc.close();
    }
   
}
