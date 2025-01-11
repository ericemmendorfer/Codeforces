// 617a - Elephant

// Time 	171 ms	
// Memory 0 KB

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int steps = 0;
        
        if (n > 4) {
            steps += n / 5;
            n = n % 5;
        }
        if (n > 3) {
            steps += n / 4;
            n = n % 4;
        }
        if (n > 2) {
            steps += n / 3;
            n = n % 3;
        }
        if (n > 1) {
            steps += n / 2;
            n = n % 2;
        }
        if (n > 0) {
            steps += n / 1;
            n = n % 1;
        }
        
        System.out.println(steps);
    }
}
