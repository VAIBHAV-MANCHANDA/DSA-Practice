public class RotateArray {
    public static void main(String[] args){
        int arr[]={1, 2, 3, 4, 5, 6, 7, 8};
        int k=3;
        RotateArray ob = new RotateArray();
        ob.rotation(arr,k);
    }

    public void rotation(int arr[], int k){
        int l = arr.length;
        k= k % l; // handle large inputs 
        
        // reverse whole array
        reverse(arr,0, l-1);

        // reverse first k elements
        reverse(arr, 0, k-1);

        // reverse remaining elements 
        reverse(arr, k, l-1);

        for(int i=0; i<l; i++){
            System.out.print(arr[i]);
        }

    }



    public void reverse(int arr[], int start, int end){
        int temp;
        while(start < end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}








//         RotateArray ob = new RotateArray();
//         int[] result = ob.rotation(arr, k);

//         for(int num : result){
//             System.out.print(num + " ");
//         }
//     }
//     public int[] rotation(int arr[], int k){
//         int l= arr.length,temp;
//         for(int i=0; i<l/2; i++){
//             temp=arr[i];
//             arr[i]= arr[l-i-1];
//             arr[l-i-1]=temp;
//         }
//         for(int i=0; i<k; i++){
//             temp=arr[i];
//             arr[i]= arr[k-i-1];
//             arr[k-i-1]=temp;
//         }
        
//        int start = k, end = l - 1;
//         while(start < end){
//             temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
        
//         }
//         return arr;
//     }
// }

