// 996a - Two Frogs
// Time 156 ms
// Memory 0 KB

import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        
        for(int j=0; j<i;j++){
            int x = s.nextInt();
            int a = s.nextInt();
            int b = s.nextInt();
            
            if (a-b<1 && b-a<1){
                System.out.println("NO");
            }else if ((a-b)%2==0 || (b-a)%2==0)
                System.out.println("YES");
            else
                System.out.println("NO");
                
        }
    }
}
