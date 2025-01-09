// 282A - 21. Bit ++

// Time 156 ms	
// Memory 0 KB

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left by nextInt()
        
        int x=0;

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            if(word.contains("+"))
                x++;
            else
                x--;
            
        }
        System.out.print(x);
    }
}
