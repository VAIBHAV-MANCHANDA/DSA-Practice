// import java.util.*;
public class GcdHcf {
    public static void main(String[] args){
        System.out.println(result(12,18));
    }

public static int result(int a, int b){
    int rem;
    
    while(b!=0 ){
        rem=a%b;
        a=b;
        b=rem;
    }
    return a;
}
}
