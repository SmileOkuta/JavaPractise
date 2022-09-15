package assignments;

public class NumberPattern {
    public static void main(String[] args) {
//        pattern1();
//        NumberPattern2();
    }

    public static void pattern1(){
        int row = 5;
        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" " + i);
            }
            for (int j = 2; j <= i ; j++){
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }


    public static void NumberPattern2(){
        for (int i = 0; i <= 5; i++) {
            int number = 1;
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print((int) (number + k));
            }
            for (int l = i - 1; l >= 0; l--) {
                System.out.print((int) (number + l));
            }
            System.out.println();
        }
    }


}
