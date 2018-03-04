package pain.humiliation.java.internetGetto.Calllka.task11;

import java.io.*;
import java.util.*;

//TODO SORTED COLLECTION MAP DONE
//todo add extra line DONE
//todo rework it with https://dzone.com/articles/java-string-format-examples DONE
public class Task11 {
    private String directoryPath, nameOfUsedFile;  //todo use different String object DONE
    private File file;

    Task11(String path, String fileName) {
        this.directoryPath = path;
        this.nameOfUsedFile = fileName;
    }

    public void writeInToHashMap(String pathToSaveNewFile, String regExp) throws FileNotFoundException {    //todo make additional param for pattern DONE
        String[] arrayWordFromFile = null;    //todo initialize it as null DONE
        TreeMap<String, Integer> mainHashMap = new TreeMap<>();

        checkDirectoryAndFileName(this.directoryPath, this.nameOfUsedFile, false);

        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            String tempStringToBufferReader;
            StringBuilder sb = new StringBuilder();

            while ((tempStringToBufferReader = bf.readLine()) != null) {
                sb.append(tempStringToBufferReader);
                sb.append(" ");
            }

            arrayWordFromFile = sb.toString().toLowerCase().replaceAll(regExp, " ").split("\\s+");  //todo to make it more practical, move pattern inti incoming param DONE
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert arrayWordFromFile != null;
        for (String temp : arrayWordFromFile) {  //todo try to make it in single for_each DONE
            int i = 1;

            mainHashMap.merge(temp, i, (a, b) -> a + b);
        }

        writeMapInToTheFile(pathToSaveNewFile, new StringBuilder(nameOfUsedFile).insert(0, "New").toString(), sortedMap(mainHashMap));
    }

    private void writeMapInToTheFile(String pathToSaveNewFile, String nameForNewFile, List<Map.Entry<String, Integer>> elementFromFile) throws FileNotFoundException {
        checkDirectoryAndFileName(pathToSaveNewFile, nameForNewFile, true);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Map.Entry<String, Integer> entry : elementFromFile) {
                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < entry.getValue(); i++) {
                    sb.append("|");
                }

                bw.write(entry.getKey() + ": " + sb);
                bw.newLine();
            }

            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void checkDirectoryAndFileName(String path, String fileName, boolean isKeep) throws FileNotFoundException {//"isKeep" is variable of choose, do you need to create a file
        boolean flag = false;
        file = new File(path, fileName);

        if (isKeep) {
            if (!file.getParentFile().isDirectory()) {
                flag = file.getParentFile().mkdirs();
            } else if (!file.exists()) {
                try {
                    flag = file.createNewFile();
                } catch (IOException e) {
                    System.out.println("Incorrect path or filename");
                    e.printStackTrace();
                }
            }
        }

        if (flag) {
            System.out.printf("Folder and File created\nFile location: %s\nFilename: %s", file.getParent(), file.getName());
        } else if (!file.getParentFile().isDirectory() && !file.exists()) {
            System.out.printf("Incorrect path to folder or filename\nFile location: %s\nFilename: %s", file.getParent(), file.getName());

            throw new FileNotFoundException();
        }

    }

    private List<Map.Entry<String, Integer>> sortedMap(TreeMap<String, Integer> mainHashMap) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(mainHashMap.entrySet());
        list.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

        return list;
    }
}
