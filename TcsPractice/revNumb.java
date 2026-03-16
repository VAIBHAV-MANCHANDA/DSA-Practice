import java.util.*;
class revNumb{
    public static void main (String[] args){
        revNumb ob = new revNumb();
        int reversed=ob.rev(456);
        System.out.print("reversed" + reversed);
    }
    
    public int rev (int n){
        int rem=0, digit=0;
        while(n>0){
            rem=n%10;
            digit=digit*10+rem;
            n=n/10;
        }
        return digit;
    }
}