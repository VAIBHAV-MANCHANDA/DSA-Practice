import java.util.*;

public class palindrome{
    public static void main( String[] args){
        palindrome obj = new palindrome();
        System.out.println(obj.check(6556));
    }
    public boolean check(int n){
        int rem=0, digits=0, temp=n;
        boolean result = false;
        while(temp>0){
            rem = temp%10;
            digits = digits * 10 + rem;
            temp=temp/10;
        }
        if( digits == n)
            result = true ;
        return result;
    }
}
