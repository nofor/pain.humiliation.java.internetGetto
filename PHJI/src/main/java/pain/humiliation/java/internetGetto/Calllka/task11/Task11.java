package pain.humiliation.java.internetGetto.Calllka.task11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task11 {
    private String path, fileName;
    private File file;

    Task11(String path, String fileName) {
        this.path = path;
        this.fileName = fileName;
        this.file = new File(path, fileName);
    }

    public void writeInToHashMap(String pathToSaveNewFile, String nameForSavedFile, String textIfFileIsEmpty) {
        String[] arrayWordFromFile = new String[0];
        HashMap<String, StringBuilder> mainHashMap = new HashMap<>();

        checkDirectoryAndFileName(this.path, this.fileName);
        checkAndWriteInEmptyFile(this.file, textIfFileIsEmpty);

        try(BufferedReader bf = new BufferedReader(new FileReader(file))){
            String tempStringToBufferReader;
            StringBuilder sb = new StringBuilder();

            while ((tempStringToBufferReader = bf.readLine()) != null){
                sb.append(tempStringToBufferReader);
                sb.append(" ");
            }

            arrayWordFromFile = sb.toString().replaceAll("\\p{P}", "").toLowerCase().split(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String temp : arrayWordFromFile){
            mainHashMap.put(temp, null);
        }

        for(String tempMap : mainHashMap.keySet()){
            StringBuilder sbMap = new StringBuilder();

            for(String sbTemp : arrayWordFromFile){
                if(tempMap.equals(sbTemp)){
                    mainHashMap.put(tempMap, sbMap.append("|"));
                }
            }
        }

        writeMapInToTheFile(pathToSaveNewFile, nameForSavedFile, mainHashMap);
    }

    private void writeMapInToTheFile(String pathToSaveNewFile, String nameForSavedFile, HashMap<String, StringBuilder> mainHashMap){
        File newFile;

        checkDirectoryAndFileName(pathToSaveNewFile, nameForSavedFile);

        newFile = new File(pathToSaveNewFile, nameForSavedFile);

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))){
            for(Map.Entry<String, StringBuilder> entry: mainHashMap.entrySet()){
                bw.write(entry.getKey() + ": " + entry.getValue());
                bw.newLine();
            }

            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void checkAndWriteInEmptyFile(File file, String someText) {
        try {
            if (new BufferedReader(new FileReader(file)).readLine() == null) {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

                bufferedWriter.write(someText);
                bufferedWriter.flush();

                System.out.println("Write some text in to FILE");
            } else {
                System.out.println("FILE isn't empty");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void checkDirectoryAndFileName(String path, String fileName) {

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
