import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

        List<Student> studentList = new ArrayList<>();

        Student student_1 = new Student();
        student_1.name = "Jan";
        student_1.surname = "Kowalski";
        student_1.age = 24;
        student_1.status = true;
        studentList.add(student_1);

        Student student_2 = new Student();
        student_2.name = "Marcin";
        student_2.surname = "Nowak";
        student_2.age = 22;
        student_2.status = false;
        studentList.add(student_2);

        Student student_3 = new Student();
        student_3.name = "Marek";
        student_3.surname = "Dobry";
        student_3.age = 21;
        student_3.status = true;
        studentList.add(student_3);

        for (Student i : studentList) {
            System.out.println(i.toString());
        }
    }
}


