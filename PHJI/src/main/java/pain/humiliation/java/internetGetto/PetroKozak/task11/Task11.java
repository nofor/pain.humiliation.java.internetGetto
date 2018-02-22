package pain.humiliation.java.internetGetto.PetroKozak.task11;

import java.io.*;
import java.util.*;

public class Task11 {

    public static void main(String[] args) throws InterruptedException, IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Acer\\Desktop\\task11.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Acer\\Desktop\\result.txt"));
        String line = bufferedReader.readLine();

        HashMap<String,ArrayList<String>> result = new HashMap<>();
        result.put("Java",new ArrayList<>());
        result.put("PHP",new ArrayList<>());
        result.put("C++",new ArrayList<>());
        result.put("Python",new ArrayList<>());

        while (line != null) {
            String[] words = line.split(" ");
            line = bufferedReader.readLine();

            for (int i = 0; i < words.length; i++) {

                if (words[i].equals("Java")) {
                    result.get("Java").add("|");
                } else if (words[i].equals("PHP")) {
                    result.get("PHP").add("|");
                } else if (words[i].equals("C++")) {
                    result.get("C++").add("|");
                } else if (words[i].equals("Python")) {
                    result.get("Python").add("|");
                }
            }
        }

        for (Iterator i = result.keySet().iterator(); i.hasNext(); ) {
            String key = (String) i.next();
            ArrayList<String> value =  result.get(key);

            bufferedWriter.write(key + myToString(value));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static String myToString(ArrayList x) {
        String result = "";

        for (int i = 0; i < x.size(); i++) {
            result = result + x.get(i);
        }

        return result;
    }
}
