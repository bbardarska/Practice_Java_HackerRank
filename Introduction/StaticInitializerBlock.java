/*You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with
breadth B and height H . You should read the variables from the standard input.
If B<=0 or H<=0  , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.*/

import java.util.*;

public class StaticInitializerBlock {
    public static Scanner sc = new Scanner(System.in);
    private static boolean flag;
    private static byte B,H;
    static {
        B=sc.nextByte();
        H=sc.nextByte();
        if(B>0 && H>0){
            flag=true;
        } else {
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }
    
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }

}

