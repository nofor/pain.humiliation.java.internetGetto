package pain.humiliation.java.internetGetto.Pbahher.task1;

/**
 * Created by pbahher on 12/13/17.
 */
public class Task3 {

    public String threeLines(String a, String b, String c) {

        StringBuffer sb = new StringBuffer();

        sb.append(a).append(b).append(c);
        System.out.println("Specified text: " + sb);
        sb.reverse();

        return "Inverted text: " + sb;
    }

    public String deletingLetters(String a) {

        StringBuffer sb = new StringBuffer("superman");

        sb.delete(0, 8);
        return a;
    }
}

