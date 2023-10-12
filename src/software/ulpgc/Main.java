package software.ulpgc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alejandro", LocalDate.of(2003, 03, 27));
        System.out.println(person);
    }
}
