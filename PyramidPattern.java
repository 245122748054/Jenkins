public class PyramidPattern {
    public static void main(String[] args) {
        int n = 5;  // Number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");  // Print leading spaces
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");  // Print stars
            }
            System.out.println();  // New line after each row
        }
    }
}

