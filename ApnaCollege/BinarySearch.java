import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        int arr[]={1,2,5,7,90,54,9,67};
        int target = 9;
        System.out.println(binarySearch(arr, target));
    }
    public static int binarySearch(int arr[], int target){
        Arrays.sort(arr);
        int l= arr.length;
        int left=0, mid, right=l-1;
        while(left <= right){
            
            mid= (left+right)/2;
            if(arr[mid]==target)
                return mid;

            if(target<arr[mid]){
                right = mid-1;
            }
            if(target>arr[mid]){
                left = mid+1;
            }

        }
        return -1;
    }
}
