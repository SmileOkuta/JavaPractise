package assignments;

public class Star {
    public static void main(String[] args) {
        int row = 5;

        for (int s=1; s<=row; s++){
            for(int r=1; r<=row-s; r++){
                System.out.print("  ");
            }
            for (int t = 1; t <= s * 2 - 1; t ++){
                System.out.print("* ");
            }

            System.out.println();

        }


    }

}
