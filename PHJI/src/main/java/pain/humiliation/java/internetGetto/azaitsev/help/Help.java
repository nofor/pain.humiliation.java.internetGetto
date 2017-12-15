package pain.humiliation.java.internetGetto.azaitsev.help;

public class Help {

    /**
     * Method which reverse string.
     * @param a - incoming string
     * @return - reverse incoming string
     */
    public String reverseString(String a) {
        char[] mass = a.toCharArray();
        char[] reverse = new char[mass.length];

        for (int i = mass.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = mass[i];
        }

        return new String(reverse);
    }

}
