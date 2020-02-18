package week2.les3.voorbeeld2;

public class Student {
    private String naam;
    private String email;

    public Student(String nm, String em) {
        naam=nm;
        if (em!=null && em.endsWith("@student.hu.nl")) {
            email=em;
        } else {
            email= "";
        }
    }

    public String  toString() {
        String s ="De student heet "+naam+" en zijn/haar e-mail is "+email;
        return s;
    }
}
