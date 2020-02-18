package practicum1.opdracht4;

public class Main {

    public static void main(String[] args) {
        int j =1;
        int som = 0;
        int getal = 0;
        while (j<=39){
            getal = som;
            som = getal + j;
            System.out.println(j);
            System.out.println(getal + " + " +j+ " = " +som );
            j++;
        }
    }
}
