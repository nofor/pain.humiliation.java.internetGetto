package pain.humiliation.java.internetGetto.Calllka.task3;

//todo WTF Only english motherfacker!!! DONE
/*Create a method that takes 3 input string.
In this method, you need to do 3 operations with incoming string.
Operation 1: combine them in one line.
Operation 2: Reverse string .
Operation 3: create a method in which will take a string from which it will delete the specified characters.
Input Character come in an arbitrary number as incoming parameters.
Each of the operations must be in a separate method.**/

public class Task3 {

    public void mainMethod(String a, String b, String c) {
        String temp = concatenationStringWithStringBuilder(a, b, c);
        temp = reverseStringWithStringBuilder(temp);

        System.out.println(deleteSymbol(temp, "a"));
    }

    private String concatenationStringWithStringBuilder(String a, String b, String c) {
        return new StringBuilder().append(a).append(b).append(c).toString();
    }

    private String reverseStringWithStringBuilder(String a) {
        return new StringBuilder().append(a).reverse().toString();
    }

    private String deleteSymbol(String sentence, String... args) {
        String abc = sentence;

        for (String temp : args) {
            abc = abc.replace(temp, "");
        }

        return abc;
    }

}
