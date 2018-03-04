package pain.humiliation.java.internetGetto.PetroKozak.task11;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11 {

    public TreeMap<String, ArrayList<String>> readFile(String path,String regex) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        StringBuilder sb = new StringBuilder();
        TreeMap<String, ArrayList<String>> result = new TreeMap<>();
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            sb.append(line);
            sb.append(" ");
        }

        for (String str : getOnlyStrings(sb.toString().toLowerCase(),regex).split("\\s+")) {
            if (result.get(str) != null) {
                result.get(str).add("|");
            } else {
                result.put(str, new ArrayList<>());
                result.get(str).add("|");
            }
        }

        bufferedReader.close();

        return result;
    }

    public void writeResultInANewFile(TreeMap<String, ArrayList<String>> map, File file) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        Map<String, ArrayList<String>> sortedMap = sortByArraySizeDesc(map);
        ArrayList<String> value;

        for (String key : sortedMap.keySet()) {
            value = sortedMap.get(key);

            bufferedWriter.write(key + formatListForWritingIntoTheFile(value));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }

    public String formatListForWritingIntoTheFile(ArrayList x) {
        String result = "";

        for (Object aX : x) {
            result = result + aX;
        }

        return result;
    }

    public static String getOnlyStrings(String s, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        return matcher.replaceAll(" ");
    }

    private static Map<String, ArrayList<String>> sortByArraySizeDesc(Map<String, ArrayList<String>> map) {
        List<Map.Entry<String,ArrayList<String>>> list = new LinkedList(map.entrySet());
        Map res = new LinkedHashMap();

        Collections.sort(list, (Comparator) Task11::compare);

        for (Map.Entry<String, ArrayList<String>> entry:list ) {
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

        int size1 = ((List) ((Map.Entry) (o1)).getValue()).size();
        int size2 = ((List) ((Map.Entry) (o2)).getValue()).size();

        return size2 - size1;
    }
}
