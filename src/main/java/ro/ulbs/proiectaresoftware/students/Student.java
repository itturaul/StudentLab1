package ro.ulbs.proiectaresoftware.students;

import java.util.ArrayList;
import java.util.List;

public class   Student {
    public static void main(String[] args) {

    }
    private int numarMatricol;
    private String prenume;
    private String nume;
    private String formatieDeStudiu;


    public Student(int numarMatricol, String prenume, String nume, String formatieDeStudiu) {
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
    }


    public int getNumarMatricol() { return numarMatricol; }
    public String getPrenume() { return prenume; }
    public String getNume() { return nume; }
    public String getFormatieDeStudiu() { return formatieDeStudiu; }


    @Override
    public String toString() {

        return String.format("%-15d %-15s %-15s %-15s",
                numarMatricol, prenume, nume, formatieDeStudiu);

    }



    List<Student> listaStudenti = new ArrayList<>();




    listaStudenti.add(new Studenti (112, "Ioan"));
    listaStudenti.add(new Studenti (122, "Eugen"));


}
