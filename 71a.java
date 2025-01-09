//71 A. Way Too Long Words

//Time 187 ms
//Memory 0 KB

import java.util.Scanner;

public class WayTooLongWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left by nextInt()

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            if (word.length() > 10) {
                System.out.println(word.charAt(0) + "" + (word.length() - 2) + "" + word.charAt(word.length() - 1));
            } else {
                System.out.println(word);
            }
        }
    }
}
