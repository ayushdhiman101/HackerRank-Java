// Using a helper stick (peg), shift all rings from peg A to peg B using peg C.

// All rings are initally placed in ascending order, smallest being on top.

// No bigger ring can be placed over a smaller ring.


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();     
        char s='A',h='B',d='C';
        solve(n,s,h,d);
        
    }
    public static void solve(int n,char s,char d,char h){
        if(n==1) {
            System.out.println("Moving ring " + n + " from " + s + " to " + d );
            return;
        }
    
        solve(n-1,s,h,d);
            System.out.println("Moving ring " + n + " from " + s + " to " + d );
        solve(n-1,h,d,s);
return;
    }
    
    
    
}
