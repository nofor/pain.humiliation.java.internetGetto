package pain.humiliation.java.internetGetto.Calllka.task1;

//todo WTF Only english motherfacker!!!
/*Создать метод который на вход принимает 3 строки.
В этом методе надо сделать 3 операции над входящими строками.
Операция 1: обьединить их в одну строку.
Операция 2: перевернуть строку.
Операция 3: создать метод в который будет принимать в себя строку из которой он будет удалять заданные символы.
Заданные символы приходять в произвольном количестве как входящие параметры.
Каждая из операций должна быть в отдельном методе.**/

public class Task2 {

    public String concatenationStringWithStringBuilder(String a, String b, String c){
        StringBuilder sb = new StringBuilder();

        sb.append(a);
        sb.append(b);
        sb.append(c);

        return sb.toString();
    }

    public String reverseStringWithStringBuilder(String a, String b, String c){
        StringBuilder sb = new StringBuilder();

        sb.append(concatenationStringWithStringBuilder(a, b, c));
        sb.reverse();

        return sb.toString();
    }

    public String deleteSymbol(String sentence, String... args) {
        String abc = sentence;

        for (String temp : args) {
            abc = abc.replace(temp, "");
        }

        return abc;
    }

    public String reverseString(String a, String b, String c) {

        char[] mass = concatenationStringWithStringBuilder(a,b,c).toCharArray();

        for (int i = mass.length - 1, j = 0; i > j; i--, j++) {
            char temp;

            temp = mass[j];
            mass[j] = mass[i];
            mass[i] = temp;
        }

        return mass.toString();
    }

    public String myDeleteSymbol(String sentence, String... deleteSymbol) {
        char[] massDeleteSymbol = concatenationTemp(deleteSymbol).toCharArray();
        String result = "";
        boolean flag = true;

        for (char massSentence : sentence.toCharArray()) {
            for (int j = 0; j < deleteSymbol.length; j++) {

                flag = massSentence != massDeleteSymbol[j];
                if (!flag) break;
            }

            if (flag)
                result += massSentence;
        }

        return result;
    }

    private String concatenationTemp(String... word) {

        String sentence = word[0];

        for (int i = 1; i < word.length; i++) {

            sentence += word[i];

        }

        return sentence;
    }

}
