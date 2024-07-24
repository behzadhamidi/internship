package encapsulation;

public class Main {
    public static void main(String[] args) {

        Encapsulation person = new Encapsulation("John", 25);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        person.setName("Jane");
        person.setAge(30);

        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());

        person.setAge(-5);
    }
}