package pain.humiliation.java.internetGetto.PetroKozak.task11;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11 {
    //todo add extra line
    public HashMap<String, ArrayList<String>> readFile(String path) throws IOException {    //todo add pattern incoming param and use it under getOnlyStrings() method
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line;    //todo grup primitive to primitive, other to other
        StringBuilder sb = new StringBuilder();
        HashMap<String, ArrayList<String>> result = new HashMap<>();

        while ((line = bufferedReader.readLine()) != null) {
            sb.append(line);
            sb.append(" ");
        }

        String[] words = getOnlyStrings(sb.toString().toLowerCase()).split("\\s+");  //todo do not create extra variable

        for (String str : words) {
            if (result.get(str) != null) {
                result.get(str).add("|");
            } else {
                result.put(str, new ArrayList<String>());    //todo <String> is not necessary here
                result.get(str).add("|");
            }
        }

        bufferedReader.close();
        //todo add extra line
        return result;
    }

    public void writeResultInANewFile(HashMap<String, ArrayList<String>> map, File file) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        Map<String, ArrayList<String>> sortedMap = sortByArraySizeDesc(map);

        for (String key : sortedMap.keySet()) {
            ArrayList<String> value = sortedMap.get(key);  //todo initialize it at the beginning

            bufferedWriter.write(key + myToString(value));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }

    public String myToString(ArrayList x) {    //todo rename it
        String result = "";

        for (Object aX : x) {
            result = result + aX;
        }

        return result;
    }

    public static String getOnlyStrings(String s) {
        Pattern pattern = Pattern.compile("[^a-z A-Z 0-9]");    //todo make patter as incoming param
        Matcher matcher = pattern.matcher(s);

        return matcher.replaceAll(" ");
    }

    private static Map<String, ArrayList<String>> sortByArraySizeDesc(Map<String, ArrayList<String>> map) {
        List<ArrayList<String>> list = new LinkedList(map.entrySet());

        Collections.sort(list, (Comparator) Task11::compare);

        Map res = new LinkedHashMap();  //todo move it to beginning

        for (Iterator it = list.iterator(); it.hasNext(); ) {    //todo rework it like _for (Map.Entry<String, String> entry : map.entrySet())_
            Map.Entry entry = (Map.Entry) it.next();
            res.put(entry.getKey(), entry.getValue());
        }

        return res;
    }

    private static int compare(Object o1, Object o2) {
        if (o1 == null && o2 == null) {
            return 0;
        } else if (o1 == null) {
            return 1;
        } else if (o2 == null) {
            return -1;
        }
        //todo add extra line
        int size1 = ((List) ((Map.Entry) (o1)).getValue()).size();
        int size2 = ((List) ((Map.Entry) (o2)).getValue()).size();
        //todo add extra line
        return size2 - size1;
    }
}
