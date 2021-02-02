public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);

        Person[] person = new Person[3];
        person[0] = new Person("Jon");
        person[1] = new Person("Michael");
        person[2] = new Person("Stu");

        for (Person eachPerson : person) {
            System.out.println(eachPerson.getName());
        }
        Person billy = new Person("Billy");
        Person [] person2 = addPerson(person, billy);
        for(Person eachPerson: person2){
            System.out.println(eachPerson.getName());
        }

    }

    public static Person[] addPerson(Person[] extraOne, Person extra) {
        Person[] morePeople = new Person[extraOne.length + 1];
        for (int i = 0; i < extraOne.length; i++) {
            morePeople[i] = extraOne[i];
        }
        morePeople[morePeople.length - 1] = extra;
        return morePeople;
    }
}


