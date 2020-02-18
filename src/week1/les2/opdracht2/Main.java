package week1.les2.opdracht2;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("iPad","1234AB", 612.00);
        product1.setBtw(19.0);
        System.out.println(product1);

        Product product2 = new Product("Paracethamol","5678CD");
        product2.setPrijs(1.90);
        product2.setBtw(6.0);
        System.out.println(product2);

        System.out.println("BTW percentage: " + product2.getBtw());
        System.out.println("Betaalde BTW: "+ product2.btwBedrag());
        System.out.println("De prijs is: "+ product2.getPrijs());
    }
}
