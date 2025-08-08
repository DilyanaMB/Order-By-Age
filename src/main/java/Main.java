import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Person> people = new ArrayList<>();
        while (!input.equals("End")) {
            List<String> personData = Arrays.stream(input.split("\\s+")).toList();
            Person person = new Person(personData.get(0), personData.get(1), Integer.parseInt(personData.get(2)));
            people.add(person);
            input = sc.nextLine();
        }

        printInOrderOfAge(people);
    }

    public static void printInOrderOfAge(List<Person> people) {
        people.sort(Comparator.comparing(Person::getAge));
        for (Person p:people){
            System.out.println(p);
        }
    }
}
