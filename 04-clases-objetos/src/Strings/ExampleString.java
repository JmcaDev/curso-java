package Strings;

public class ExampleString {
    public static void main(String[] args) {
        String name = "Jose";
        String name2 = "Jose";

        System.out.println(name == name2);

        String name3 = new String("Jose");

        System.out.println(name3 == name2);

        System.out.println(name3);

        System.out.println(name.toUpperCase());

        System.out.println(name);

        Person person = new Person("Jose", "Castillo");

        System.out.println(person.toString());
    }
}
