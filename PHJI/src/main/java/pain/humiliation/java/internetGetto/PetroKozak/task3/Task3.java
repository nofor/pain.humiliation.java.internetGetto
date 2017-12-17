package pain.humiliation.java.internetGetto.PetroKozak.task3;

public class Task3 {

    public void mainString(String a, String b, String c){
        String abc = putTogether(a,b,c);
        abc = reverse(abc);

        System.out.println(symbolDelete(abc,"a","b","c"));
    }

    public String putTogether(String a, String b, String c) {
        return new StringBuilder().append(a).append(b).append(c).toString();
    }

    public String reverse(String x) {
        return new StringBuilder().append(x).reverse().toString();
    }


    public String symbolDelete(String incoming, String... args) {
        for (String temp : args) {
            incoming = incoming.replace(temp, "_");
        }

        return incoming;
    }


}
