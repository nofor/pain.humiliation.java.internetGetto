package pain.humiliation.java.internetGetto.PetroKozak.task3;

public class Task3 {

    //todo add mainString method which use all others methods

    public String putTogether(String a, String b, String c) {
        StringBuilder sb = new StringBuilder();
        //todo remove extra space
        String newStr; //todo add space
        newStr = sb.append(a).append(b).append(c).toString();

        return newStr;
    }

    public String reverse(String x) {
        StringBuilder sb = new StringBuilder();
        //todo remove extra constants
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
