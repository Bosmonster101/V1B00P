package week3.les5.voorbeeld2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //arraylist declaren met willekeurig type
        ArrayList cijferlijst = new ArrayList();
        cijferlijst.add(6.9);
        cijferlijst.add(8.1);
        cijferlijst.add(6.2);

        //uitprinten eerste poging
        System.out.println(cijferlijst);

        for (int i=0; i<cijferlijst.size();i++){
            System.out.println(cijferlijst.get(i));
        }
        System.out.println();

        //items uitgeprint met een for-each lus
        for (Object item: cijferlijst){
            System.out.println(item);
        }
        System.out.println();

        cijferlijst.add("student");
        for (Object item: cijferlijst){
            System.out.println(item);
        }
        System.out.println();


        ArrayList<Double> cijferlijst1 = new ArrayList<Double>();
        cijferlijst1.add(6.9);
        cijferlijst1.add(8.1);
        cijferlijst1.add(6.2);
        //cijferlijst1.add("student");

        System.out.println("Getallen uitprinten met for-lus");
        for (int i=0; i<cijferlijst1.size();i++){
            System.out.println(cijferlijst1.get(i));
        }
        System.out.println();

        System.out.println("Getallen uitprinten met een for-each-lus");
        for (Double item: cijferlijst1){
            System.out.println(item);
        }
        System.out.println();

    }
}
