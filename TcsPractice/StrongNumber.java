// 3. Strong Number Check
// Write a program to check if a given number is a Strong Number.
//  A number is strong if the sum of the factorials of its digits equals the number itself.
//  Input: 145
// Output: Yes (Since 1! + 4! + 5! = 1 + 24 + 120 = 145)
public class StrongNumber {
    public static void main(String[] args){
        StrongNumber ob=new StrongNumber();
        System.out.println(ob.check(145));
    }
    public boolean check(int n){
        int temp=n;
        int rem, fact=1, sum=0;
        while(temp>0){
            rem=temp%10;
            for(int i=1; i<=rem; i++){
                fact*=i;
            }
            sum+=fact;
            fact=1;
            temp=temp/10;
            
        }
        if(sum==n)
            return true;
        else
            return false;
    }
}
