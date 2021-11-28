import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */

        Osoba osoba1 = new Osoba("Marcin", "Kowalski", 123456789);
        Student student1 = new Student(osoba1, WydzialEnum.MATEMATYKA);

        Osoba osoba2 = new Osoba("Joanna", "Wrona", 5224554);
        Student student2 = new Student(osoba2, WydzialEnum.ELEKTRONIKA);

        Osoba osoba3 = new Osoba("Anna", "Spawacz", 43143536);
        Student student3 = new Student(osoba3, WydzialEnum.INFORMATYKA);

        Osoba osoba4 = new Osoba("Marek", "Kordyl", 524243123);
        Student student4 = new Student(osoba4, WydzialEnum.MATEMATYKA);

        Osoba osoba5 = new Osoba("Wojciech", "Tracz", 123238973);
        Student student5 = new Student(osoba5, WydzialEnum.INFORMATYKA);

        List<Student> listaStudentow = new ArrayList();
        listaStudentow.add(student1);
        listaStudentow.add(student2);
        listaStudentow.add(student3);
        listaStudentow.add(student4);
        listaStudentow.add(student5);

        for (Student i : listaStudentow) {
            System.out.println(i.toString());
        }
    }
}
