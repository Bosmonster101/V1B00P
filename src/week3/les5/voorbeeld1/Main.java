package week3.les1.voorbeeld1;

public class Main {
    public static void main(String[] args) {
        int i = 7;
        double d = i;
        System.out.println(d);
        System.out.println();


        double e = 3.7;
        int j = (int) e;
        System.out.println(j);
        System.out.println();

        double f = -3.7;
        int k = (int) f;
        System.out.println(k);
        System.out.println();

        float g = (float) 4.3;
        g = 4.3f;

        System.out.println(10 * 3);
        System.out.println(10 / 3);
        // let op beide integers dus gehele deling
        System.out.println((double) 10 / 3);
        System.out.println(10 / 3.0);
        System.out.println((int) 10 / 3.0);
        System.out.println(10 / (int) 3.0);
        System.out.println((int) (10 / 3.0));

        //rest bij gehele deling
        System.out.println(10 % 3);
    }
}