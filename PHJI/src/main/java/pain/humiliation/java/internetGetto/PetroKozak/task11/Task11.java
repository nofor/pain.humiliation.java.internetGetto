package pain.humiliation.java.internetGetto.PetroKozak.task11;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11 {
    public HashMap<String, ArrayList<String>> readFile(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line;
        StringBuilder sb = new StringBuilder();
        HashMap<String, ArrayList<String>> result = new HashMap<>();

        while ((line = bufferedReader.readLine()) != null) {
            sb.append(line);
            sb.append(" ");
        }

        String[] words = getOnlyStrings(sb.toString().toLowerCase()).split("\\s+");

        for (String str : words) {
            if (result.get(str) != null) {
                result.get(str).add("|");
            } else {
                result.put(str, new ArrayList<String>());
                result.get(str).add("|");
            }
        }

        bufferedReader.close();
        return result;
    }

    public void writeResultInANewFile(HashMap<String, ArrayList<String>> map, File file) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        Map<String, ArrayList<String>> sortedMap = sortByArraySizeDesc(map);

        for (String key : sortedMap.keySet()) {
            ArrayList<String> value = sortedMap.get(key);

            bufferedWriter.write(key + myToString(value));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }

    public String myToString(ArrayList x) {
        String result = "";

        for (Object aX : x) {
            result = result + aX;
        }

        return result;
    }

    public static String getOnlyStrings(String s) {
        Pattern pattern = Pattern.compile("[^a-z A-Z 0-9]");
        Matcher matcher = pattern.matcher(s);

        return matcher.replaceAll(" ");
    }

    private static Map<String, ArrayList<String>> sortByArraySizeDesc(Map<String, ArrayList<String>> map) {
        List<ArrayList<String>> list = new LinkedList(map.entrySet());

        Collections.sort(list, (Comparator) Task11::compare);

        Map res = new LinkedHashMap();

        for (Iterator it = list.iterator(); it.hasNext(); ) {
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
        int size1 = ((List) ((Map.Entry) (o1)).getValue()).size();
        int size2 = ((List) ((Map.Entry) (o2)).getValue()).size();
        return size2 - size1;
    }
}
