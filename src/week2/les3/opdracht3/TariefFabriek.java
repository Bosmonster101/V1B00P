package week2.les3.opdracht3;

public class TariefFabriek {
    public static void main(String[] args) {
        BelastingTarieven tarief = new BelastingTarieven();
        try {
            tarief.produceerBelastingTarieven();
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
