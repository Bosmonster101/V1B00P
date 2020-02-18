package week1.les1.opdracht3;

public class Student {
    private String naam;
    private Integer studentNummer;

    public Student(String nm) {
        naam = nm;
        studentNummer = 0;
    }

    public Student(String nm, Integer stNr) {
        naam = nm;
        studentNummer = stNr;
    }
// getter/setter
    public String getNaam() {
        return naam;
    }

    public Integer getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(Integer studentNummer) {
        this.studentNummer = studentNummer;
    }
// toString
    public String toString() {
        return "Deze student heet "+ naam +" en heeft nummer:"+ studentNummer;
    }
}
