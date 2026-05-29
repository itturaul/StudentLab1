import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(prenume, student.prenume) &&
                Objects.equals(nume, student.nume) &&
                Objects.equals(formatieStudiu, student.formatieStudiu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prenume, nume, formatieStudiu);
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", prenume='" + prenume + '\'' +
                ", nume='" + nume + '\'' + ", formatieStudiu='" + formatieStudiu + '\'' + '}';
    }
}

public class Main {

    public static boolean contineStudentOptimizat(Set<Student> setStudenti, Student studentCautat) {
        return setStudenti.contains(studentCautat);
    }

    public static void main(String[] args) {
        Set<Student> studenti = new HashSet<>();

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

        boolean gasitB = contineStudentOptimizat(studenti, studentB);
        System.out.println("b) Este prezent studentul Alis Popa? (O(1)): " + gasitB);

        boolean gasitC = contineStudentOptimizat(studenti, studentC);
        System.out.println("c) Este prezent studentul Maria Popa? (O(1)): " + gasitC);
    }
}