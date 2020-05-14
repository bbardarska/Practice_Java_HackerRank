
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

