// 339b - Xenia and Ringroad

// Time 624 ms
// Memory	0 KB

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t = s.nextInt();
        
        int current = 1;
        int count = 0;
        
       for (int i = 0; i< t; i++){
           int c = s.nextInt();
           
           if (c > current){
               count+= c-current;
           }else if (c < current){
               count += n - current + c;
           }
           current= c;
       }
        System.out.println(count);
    }
}
