package pain.humiliation.java.internetGetto.Calllka.task1;


/*Создать метод который на вход принимает 3 строки.
В этом методе надо сделать 3 операции над входящими строками.
Операция 1: обьединить их в одну строку.
Операция 2: перевернуть строку.
Операция 3: создать метод в который будет принимать в себя строку из которой он будет удалять заданные символы.
Заданные символы приходять в произвольном количестве как входящие параметры.
Каждая из операций должна быть в отдельном методе.**/

public class Task2 {

    public String workWithString(boolean choose, String ... args){

        StringBuilder sb = new StringBuilder();
        String outString;

        for(String temp : args){
            sb.append(temp);
        }

        if(choose){
            outString = sb.toString();
        } else {
            outString = sb.reverse().toString();
        }

        return outString;
    }

    public String deleteSymbol(String sentence, String ... args){

        String abc = sentence;

        for(String temp : args){
            abc = abc.replace(temp, "");
        }

        return abc;
    }

}
