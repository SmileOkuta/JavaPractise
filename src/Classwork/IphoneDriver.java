package Classwork;

public class IphoneDriver {
    public static void main(String[] args) {
        Iphone.setPrice(52);
        System.out.printf("The price is : %.2f", Iphone.getPrice());

        System.out.println();
        
        Iphone iphone = new Iphone();
        iphone.setColour("Black");
        System.out.printf("The colour is : %s ", iphone.getColour());

    }


}