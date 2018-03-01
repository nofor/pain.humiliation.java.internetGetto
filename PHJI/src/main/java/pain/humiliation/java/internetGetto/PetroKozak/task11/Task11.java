package pain.humiliation.java.internetGetto.PetroKozak.task11;

import java.io.*;
import java.util.*;

public class Task11 {
    private String path, fileName;
    private File file;

    public Task11(String path, String fileName) {
        this.path = path;
        this.fileName = fileName;
        this.file = new File(path, fileName);
    }

    public File writeRandomValues(ArrayList<String> valuesToAdd, String path, String fileName) throws IOException {

        createNewFileOrCheckIfExists(path, fileName);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for (int i = 0; i < valuesToAdd.size(); i++) {
            for (int j = 0; j < 5 + (int) (Math.random() * 15); j++) {
                bufferedWriter.write(valuesToAdd.get(i) + " ");
            }
        }

        bufferedWriter.close();
        return file;
    }

    public HashMap<String, ArrayList<String>> countValues(File file) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = bufferedReader.readLine();

        HashMap<String, ArrayList<String>> result = new
                HashMap<>();
        result.put("Java", new ArrayList<String>());
        result.put("PHP", new ArrayList<String>());
        result.put("C++", new ArrayList<String>());
        result.put("Python", new ArrayList<String>());

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

        return result;
    }

    public void writeResultInANewFile(HashMap<String, ArrayList<String>> map, File file) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new
                FileWriter(file));

        for (Iterator i = map.keySet().iterator(); i.hasNext
                (); ) {
            String key = (String) i.next();
            ArrayList<String> value = map.get(key);

            bufferedWriter.write(key + myToString(value));
            bufferedWriter.newLine();
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

    private void createNewFileOrCheckIfExists(String path, String fileName) {
        if (!new File(path).isDirectory()) {
            new File(path).mkdir();
        }

        if (!file.exists()) {
            try {
                new File(path + "/" + fileName).createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
