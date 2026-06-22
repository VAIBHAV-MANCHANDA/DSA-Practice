public class LCM {
    public static void main(String[] args){
        int a=6, b=12;
        // System.out.print(method1(a,b));
        // System.out.print(method2GCD(a,b));
        System.out.print(method2LCM(a,b));
    }

    // public static int method1(int a, int b){
    //     int start;
    //     if(a>b)
    //         start=a;
    //     else 
    //         start=b;

    //     for(int i=start; i<a*b; i++){
    //         if(i%a == 0 && i%b == 0){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    public static int method2GCD(int a, int b){
        int rem=1;
        while(rem>0){
            rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }

    public static int method2LCM(int a, int b){
        int gcd = method2GCD(a, b);
        return (a*b)/gcd;
        
    }
}
