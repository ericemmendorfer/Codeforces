// 122a Lucky Division

// Time 374 ms
// Memory 0 KB


import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // List of all lucky numbers up to 1000
        int[] luckyNumbers = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
        
        boolean isAlmostLucky = false;
        
        // Check if n is divisible by any lucky number
        for (int luckyNumber : luckyNumbers) {
            if (n % luckyNumber == 0) {
                isAlmostLucky = true;
                break;
            }
        }
        
        // Output the result
        if (isAlmostLucky) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
