import java.util.Random;

public class ServerNameGenerator {

    public static String[] adjectives = {"anxious", "bloody", "curious", "defiant", "exuberant", "filthy", "glorious",
            "hungry",
            "itchy", "jittery"};
    public static String[] nouns = {"apple", "balloon", "crayon", "diamond", "engine", "flower", "guitar", "hamburger",
            "island",
            "juice"};

    public static void main(String[] args) {
        Random randomizer = new Random();
        int adjectiveInt = randomizer.nextInt(10);
        int nounInt = randomizer.nextInt(10);

        System.out.println("Here is your server name: ");
        System.out.println(adjectives[adjectiveInt] + "-" + nouns[nounInt]);


    }

}