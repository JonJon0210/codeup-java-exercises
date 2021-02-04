import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);

        Person[] people = new Person[3];
        Person jon = new Person("Jon");
        Person michael = new Person("Michael");
        Person stu = new Person("Stu");

        Person[] people = {jon, michael, stu};
        System.out.println(people);

        Person billy

    }

    public Person[] addPerson(Person[] people, Person newPerson) {
        Person[] morePeople = Arrays.copyOf(people, people.length + 1)
        morePeople[morePeople.length - 1] = newPerson;
        return morePeople;
    }
}


