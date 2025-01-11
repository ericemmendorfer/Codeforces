// 50a - Domino Piling

// Time 	342 ms	
// Memory 0 KB

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int l = s.nextInt();
        
        int area = h*l;
        
        if(area % 2 == 0){
            System.out.println(area/2);
        }else{
            System.out.println((area-1)/2);
        }
        
    }
}
