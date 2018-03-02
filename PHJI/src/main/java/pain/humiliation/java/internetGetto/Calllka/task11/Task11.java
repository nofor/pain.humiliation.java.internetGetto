package pain.humiliation.java.internetGetto.Calllka.task11;

import java.io.*;
import java.util.*;

//TODO SORTED COLLECTION MAP
public class Task11 {
    private String directoryPath, nameOfUsedFile;  //todo use different String object DONE
    private File file;

    Task11(String path, String fileName) {
        this.directoryPath = path;
        this.nameOfUsedFile = fileName;
    }

    public void writeInToHashMap(String pathToSaveNewFile) {
        String[] arrayWordFromFile = new String[0];
        HashMap<String, Integer> mainHashMap = new HashMap<>();

        checkDirectoryAndFileName(this.directoryPath, this.nameOfUsedFile, false);

        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            String tempStringToBufferReader;
            StringBuilder sb = new StringBuilder();

            while ((tempStringToBufferReader = bf.readLine()) != null) {
                sb.append(tempStringToBufferReader);
                sb.append(" ");
            }

            arrayWordFromFile = sb.toString().toLowerCase().replaceAll("[^a-z0-9]", " ").split("\\s+");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String temp : arrayWordFromFile) {
            mainHashMap.put(temp, null);
        }

        for (String tempMap : mainHashMap.keySet()) {
            int i = 1;

            for (String sbTemp : arrayWordFromFile) {
                if (tempMap.equals(sbTemp)) {
                    mainHashMap.put(tempMap, i++);
                }
            }
        }

        writeMapInToTheFile(pathToSaveNewFile, new StringBuilder(nameOfUsedFile).insert(0, "New").toString(), sortedMap(mainHashMap));
    }

    private void writeMapInToTheFile(String pathToSaveNewFile, String nameForNewFile, List<Map.Entry<String, Integer>> elementFromFile) {
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

    private void checkDirectoryAndFileName(String path, String fileName, boolean isKeep) {//"isKeep" is variable of choose, do you need to create a file
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
            System.out.println("Folder and File created");
            System.out.println("File location: " + file.getParent());
            System.out.println("Filename: " + file.getName());
        } else if (!file.getParentFile().isDirectory() && !file.exists()) {
            try {
                System.out.println("Incorrect path to folder or filename");
                System.out.println("File location: " + file.getParent());
                System.out.println("Filename: " + file.getName());
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.exit(1);
            }
        }

    }

    private List<Map.Entry<String, Integer>> sortedMap(HashMap<String, Integer> mainHashMap) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(mainHashMap.entrySet());
        list.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

        return list;
    }
}
