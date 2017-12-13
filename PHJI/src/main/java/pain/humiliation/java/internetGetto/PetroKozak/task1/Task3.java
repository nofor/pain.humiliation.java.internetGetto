package pain.humiliation.java.internetGetto.PetroKozak.task1;

public class Task3 {

    public String putTogether(String a, String b, String c) {
        StringBuilder sb = new StringBuilder();

        String newStr;
        newStr = sb.append(a).append(b).append(c).toString();

        return newStr;
    }

    public String reverse(String x) {
        StringBuilder sb = new StringBuilder();

        String str1;
        String str2 = sb.append(x).toString();
        str1 = sb.reverse().toString();

        System.out.println("Incoming phrase was " + str2);

        return "Inverted phrase is " + str1;
    }


    public String symbolDelete(String incoming, String... args) {
        System.out.println("It was the phrase:\n" + incoming);

        for (String temp : args) {
            incoming = incoming.replace(temp, "");
        }

        return "Now it is:\n" + incoming;
    }


}
