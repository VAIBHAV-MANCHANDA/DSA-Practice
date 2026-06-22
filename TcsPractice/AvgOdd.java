import java.util.*;
public class AvgOdd {
    public static void main(String[] args){
        avgOdd();
    }

    public static void avgOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length then values of arr");
        int length = sc.nextInt();
        int arr[] = new int[length];
        int count=0;
        int sum=0;
        double avg=0.00;
        for(int i=0; i<length; i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2 != 0){
                count ++;
                sum+=arr[i];
            }

        }

        if(count==0){
            System.out.println("0 0 0.00");
        }
        else{
            avg = (double)sum/count;
            System.out.println(count);
            System.out.println(sum);
            System.out.printf("%.2f",avg);
        }
    }
}
