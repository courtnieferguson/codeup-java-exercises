import java.util.Random;

public class ServerNameGenerator {

    public static String[] adjectives = {"grumpy", "kind", "caring", "diligent", "happy", "sleepy", "driven", "motivated", "nice", "creative"};

    public static String[] nouns = {"laptop", "house", "dog", "seashell", "frisbee", "bike", "assessment", "printer", "moon", "sun"};


    public static String randomStringFromArray(String[] choices) {
        Random r = new Random();
        int myRandomNumber = r.nextInt(choices.length);
        return choices[myRandomNumber];

    }

    public static void main(String[] args) {

        System.out.println("Here is your server name:");
        System.out.println("Adjective: " + randomStringFromArray(adjectives) + " - " + "Noun: " + randomStringFromArray(nouns));

    }


}
