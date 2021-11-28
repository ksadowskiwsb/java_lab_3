import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */

        Punkt punktA = new Punkt(7);
        System.out.println(punktA.toString());

        punktA = new Punkt(1, 2, 3);
        System.out.println(punktA.toString());

        punktA.setpX(10);
        punktA.setpY(20);
        punktA.setpZ(30);

        System.out.println(punktA.getpX());
        System.out.println(punktA.getpY());
        System.out.println(punktA.getpZ());

        System.out.println(punktA.sum());
        System.out.println(punktA.difference());
        System.out.println(punktA.difference(1, 2, 3));
    }
}
