import java.util.*;
public class OnlyDigits{
    public static void main(String[] args) {
        String n = "1A";
        System.err.println(check(n));
    }

    public static boolean check(String n){
        int l = n.length();
        char ch;
        boolean result = true;
        for(int i=0; i<l; i++){
            ch=n.charAt(i);
            if(!((int)ch>=48 && (int)ch<=57))
                return false;
                
        }
        return true;
    }
}