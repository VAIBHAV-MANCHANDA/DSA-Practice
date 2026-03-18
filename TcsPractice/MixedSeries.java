//  The Mixed Series Problem 
// (Extremely Common)
// Find the $N^{th}$ term of the following series: 1, 1, 2, 2, 4, 4, 8, 8, 16, 16...
// Input: 6 (Find the 6th term)
// Output: 4
// Logic Hint: The series is a mix of two identical geometric progressions ($2^0, 2^1, 2^2...$) 
// at odd and even positions.


import java.util.*;
public class MixedSeries {
    public static void main(String[] args){
        MixedSeries ob=new MixedSeries();
        System.out.print(ob.series(5));
    }

    public int series(int n){
          return (int)Math.pow(2,(n-1)/2);
    }
}
