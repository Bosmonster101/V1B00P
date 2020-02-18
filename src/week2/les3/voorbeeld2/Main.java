package week2.les3.voorbeeld2;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Kees", "Kees@student.hu.nl");
        System.out.println(student1);
        Student student2 = new Student("Jan", "jan@gmail.com");
        System.out.println(student2);
        Student student3 = new Student("Piet",null);
        System.out.println(student3);
    }
}
