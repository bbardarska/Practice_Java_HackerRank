import java.io.*;
import java.util.*;
import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myString = "";
        int num = 1;
        while(scan.hasNext()){
            myString = scan.nextLine();
            System.out.println(num + " " + myString);
            ++num;
        }
    }
}
