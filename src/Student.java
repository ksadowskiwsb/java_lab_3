public class Student {
    String name;
    String surname;
    int age;
    boolean status;

    @Override
    public String toString() {
        return "Name: " + name + " Surname: " + surname + " Age: " + age + " Status: " + status;
    }
}
