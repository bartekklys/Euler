package java8;
import java.util.List;
import java.util.ArrayList;

public class Java8Tester {

    // Method Reference Example

    public static void main(String args[]) {
        List<String> names = new ArrayList<>();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        names.forEach(System.out::println);
    }
}