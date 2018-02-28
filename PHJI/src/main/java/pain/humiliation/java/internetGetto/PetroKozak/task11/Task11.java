package pain.humiliation.java.internetGetto.PetroKozak.task11;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11 {

    public HashMap<String, ArrayList<String>> readFile(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line = bufferedReader.readLine();

        HashMap<String, ArrayList<String>> result = new HashMap<>();

        while(line!=null){
            String[] words = getOnlyStrings(line).split(" ");
            line = bufferedReader.readLine();

            for (String str: words) {
                if(result.get(str)!=null){
                    result.get(str).add("|");
                }else{
                    result.put(str, new ArrayList<String>());
                    result.get(str).add("|");
                }
            }
        }

        return result;
    }
    public void writeResultInANewFile(HashMap<String, ArrayList<String>> map, File file) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new
                FileWriter(file));

        for (Iterator i = map.keySet().iterator(); i.hasNext
                (); ) {
            String key = (String) i.next();
            ArrayList<String> value = map.get(key);

            if(map.get(key).size()>1){
            bufferedWriter.write(key + myToString(value));
            bufferedWriter.newLine();
            }
        }

        bufferedWriter.close();
    }

    public String myToString(ArrayList x) {
        String result = "";

        for (int i = 0; i < x.size(); i++) {
            result = result + x.get(i);
        }

        return result;
    }

    public static String getOnlyStrings(String s) {
        Pattern pattern = Pattern.compile("[^a-z A-Z]");
        Matcher matcher = pattern.matcher(s);
        String result = matcher.replaceAll(" ");
        return result;
    }
}
