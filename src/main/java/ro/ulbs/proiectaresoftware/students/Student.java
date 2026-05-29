import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private String prenume;
    private String nume;
    private String formatieStudiu;

    public Student(int id, String prenume, String nume, String formatieStudiu) {
        this.id = id;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieStudiu = formatieStudiu;
    }

    public String getPrenume() { return prenume; }
    public String getNume() { return nume; }
    public String getFormatieStudiu() { return formatieStudiu; }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", prenume='" + prenume + '\'' +
                ", nume='" + nume + '\'' + ", formatieStudiu='" + formatieStudiu + '\'' + '}';
    }
}

public class Main {

    public static boolean contineStudent(List<Student> lista, Student studentCautat) {
        for (Student s : lista) {
            if (s.getPrenume().equalsIgnoreCase(studentCautat.getPrenume()) &&
                    s.getNume().equalsIgnoreCase(studentCautat.getNume()) &&
                    s.getFormatieStudiu().equalsIgnoreCase(studentCautat.getFormatieStudiu())) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student(101, "Ionut", "Ionescu", "TI21/1"));
        studenti.add(new Student(112, "Maria", "Popa", "TI21/1")); // studentul de la punctul c)
        studenti.add(new Student(103, "Andrei", "Vasile", "TI21/2"));

        System.out.println("--- Lista de studenți (for-each) ---");
        for (Student s : studenti) {
            System.out.println(s);
        }
        System.out.println("------------------------------------\n");

        Student studentB = new Student(120, "Alis", "Popa", "TI21/2");
        Student studentC = new Student(112, "Maria", "Popa", "TI21/1");

        boolean gasitB = contineStudent(studenti, studentB);
        System.out.println("b) Este prezent studentul Alis Popa? Răspuns: " + gasitB);

        boolean gasitC = contineStudent(studenti, studentC);
        System.out.println("c) Este prezent studentul Maria Popa? Răspuns: " + gasitC);
    }
}