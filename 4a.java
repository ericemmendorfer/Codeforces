//Beta Round 4 A. Watermelon


// Time 248 ms	
// Memory 4700 KB  


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n%2==0 && n>2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
