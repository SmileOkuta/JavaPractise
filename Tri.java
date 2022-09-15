package assignments;

public class Tri {
    public static void main(String[] args) {
        int row = 5;

        for (int s = 1; s <= row; s++) {
            for (int r = row; r >= s+2; r--) {
                System.out.print(" ");
            }
            for (int t = 1; t <= s; t++) {
                System.out.print(s + " ");
            }
            System.out.println( );
        }
    }
    }