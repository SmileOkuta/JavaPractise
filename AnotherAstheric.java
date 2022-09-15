package assignments;

public class AnotherAstheric {
    public static void main(String[] args) {

        int length = 15;
        int height = 8;

        for (int i = 0; i <= height; i++)
        {
            if (i % 2 == 0)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= length; j++)
            {
                if (j % 2 == 0)
                {
                    System.out.print(" ");
                }
                else if (j != length || i % 2 != 0)
                {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
