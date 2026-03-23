public class RotateArray {
    public static void main(String[] args){
        int arr[]={1, 2, 3, 4, 5};
        int k=2;
        RotateArray ob = new RotateArray();
        int[] result = ob.rotation(arr, k);

        for(int num : result){
            System.out.print(num + " ");
        }
    }
    public int[] rotation(int arr[], int k){
        int l= arr.length,temp;
        for(int i=0; i<l/2; i++){
            temp=arr[i];
            arr[i]= arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for(int i=0; i<k; i++){
            temp=arr[i];
            arr[i]= arr[k-i-1];
            arr[k-i-1]=temp;
        }
        
       int start = k, end = l - 1;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        
        }
        return arr;
    }
}

