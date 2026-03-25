// race, care
import java.util.*;
public class Anagram {
    public static void main(String[] args){
        String s1 ="care";
        String s2="race";

        if(method2(s1,s2))
            System.out.print(("Anagram"));
        else
            System.out.print("Not anagram");
    }


    public static boolean method2(String s1, String s2){

        if(s1.length() != s2.length())
            return false;

        HashMap <Character,Integer> map = new HashMap<>();
        
        char ch;
        for(int i=0; i<s1.length(); i++){
            ch=s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0; i<s2.length(); i++){
             ch=s2.charAt(i);
             if(!map.containsKey(ch))
                return false;
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0){
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }
}



// public static boolean method1(String s1, String s2){
            
    //     if(s1.length() != s2.length())
    //         return false;

    //     char[] arr1 = s1.toCharArray();
    //     char[] arr2 = s2.toCharArray();

    //     Arrays.sort(arr1);
    //     Arrays.sort(arr2);

    //     return Arrays.equals(arr1,arr2);
    // }
