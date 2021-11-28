import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */

        Samochod samochod1 = new Samochod("Zielony", 12, 5);
        Samochod samochod2 = new Samochod("Miedziany", 2, 5);

        Wyscigowka wyscigowka1 = new Wyscigowka("Czerwony", 5, 3, 250, 1200);
        Wyscigowka wyscigowka2 = new Wyscigowka("Zolty", 39, 3, 220, 900);

        Ciezarowka ciezarowka1 = new Ciezarowka("Zardzewialy", 25, 3, 10000, 6);
        Ciezarowka ciezarowka2 = new Ciezarowka("Bialy", 5, 3, 5000, 4);

        List<Samochod> listaSamochodow = new ArrayList<>();
        listaSamochodow.add(samochod1);
        listaSamochodow.add(samochod2);
        listaSamochodow.add(wyscigowka1);
        listaSamochodow.add(wyscigowka2);
        listaSamochodow.add(ciezarowka1);
        listaSamochodow.add(ciezarowka2);

        for (Samochod i : listaSamochodow) {
            System.out.println(i.toString());
        }
    }
}
