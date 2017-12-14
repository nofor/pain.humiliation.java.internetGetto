package pain.humiliation.java.internetGetto.Pbahher.task1;

/**
 * Created by pbahher on 12/13/17.
 */
public class Task3 {

    public String threeLines(String a, String b, String c) {
        //todo remove extra space
        StringBuffer sb = new StringBuffer();  //todo remove StringBuffer

        sb.append(a).append(b).append(c);  //todo WTF ???
        System.out.println("Specified text: " + sb);
        sb.reverse();  //todo WTF ???

        return "Inverted text: " + sb;
    }

    public String deletingLetters(String a, String ... args) {  //todo Change !!!
        //todo remove extra space
        StringBuffer sb = new StringBuffer("superman");

        sb.delete(0, 8);
        return a;
    }
}

