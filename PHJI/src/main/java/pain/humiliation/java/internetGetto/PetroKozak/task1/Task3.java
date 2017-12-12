package pain.humiliation.java.internetGetto.PetroKozak.task1;

public class Task3 {

    public String putTogetherAndReverse(String... args) {

        StringBuilder sb = new StringBuilder();
        String str;
        String str1;
        for (String abc : args) {
            sb.append(abc);

        }
        str = sb.toString();
        System.out.println("Incoming phrase was " + str);
        str1 = sb.reverse().toString();
        return "Inverted phrase is " + str1;
    }

    public String symbolDelete(String incoming, String... args) {


        System.out.println("It was the phrase:\n" + incoming);
        for (String temp : args) {
            incoming = incoming.replace(temp, "_");
        }

        return "Now it is:\n" + incoming;
    }

}
