// 1a - Theater Square

// Time 156 ms	
// Memory 0 KB


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt(); // Length of the floor
        int k = s.nextInt(); // Width of the floor
        int a = s.nextInt(); // Side length of the tile
        
        // Calculate the number of tiles needed along the length and width
        long l = (n + a - 1L) / a; // Ensure long division to avoid overflow
        long w = (k + a - 1L) / a;  // Ensure long division to avoid overflow
        
        // Total tiles needed is the product of the two
        long tiles = l * w;
        
        System.out.println(tiles);
    }
}
