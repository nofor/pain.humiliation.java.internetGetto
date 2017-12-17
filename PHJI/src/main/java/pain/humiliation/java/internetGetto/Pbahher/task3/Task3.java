package pain.humiliation.java.internetGetto.Pbahher.task3;

/**
 * Created by pbahher on 12/13/17.
 */
public class Task3 {

    public void mainMethod(String a, String b, String c) {
        String stepbystep = threeLines(a, b, c);
        stepbystep = reverseThreeLines(stepbystep);

        System.out.println(deletingLetters(stepbystep, "o", "n", "l"));
    }

    public String threeLines(String a, String b, String c) {
        return new StringBuilder().append(a).append(b).append(c).toString();
    }

    public String reverseThreeLines(String reversing) {
        return new StringBuilder().append(reversing).reverse().toString();
    }

    public String deletingLetters(String deletion, String... args) {
        String decayingLetters = deletion;

        for (String element : args) {
            decayingLetters = decayingLetters.replace(element, "");
        }
        return decayingLetters;
    }
}

