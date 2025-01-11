// 158a - Next Round

//Time 342 ms	
//Size 0 KB

import java.util.Scanner;

public class ContestAdvancement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading input values
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] scores = new int[n];
        
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }
        
        int minScore = scores[k - 1]; // Score of the k-th place finisher
        int advance = 0;
        
        for(int score : scores){
            if (score >= minScore && score>0){
                advance++;
            }
        }
        
        
        System.out.println(advance);
        
    }
}
