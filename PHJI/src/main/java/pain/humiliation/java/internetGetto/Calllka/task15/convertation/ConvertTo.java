package pain.humiliation.java.internetGetto.Calllka.task15.convertation;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import pain.humiliation.java.internetGetto.Calllka.task14.dao.imp.Task14Impl;
import pain.humiliation.java.internetGetto.Calllka.task14.model.UserModel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertTo extends Task14Impl {
    private ObjectMapper obMapper = new ObjectMapper();
    ArrayList<UserModel> list;

    protected ArrayList<UserModel> convertToObject(String path) {
        try {
            HashMap<String, List<UserModel>> map = new HashMap<>(obMapper.readValue(new File(path), new TypeReference<HashMap<String,List<UserModel>>>(){}));
            list = (ArrayList) map.get("users");
        } catch (IOException e) {
            list = null;

            e.printStackTrace();
        }

        return list;
    }

    protected void convertToJSON(String pathToSaveFile) {
        Map<String, List<UserModel>> map = new HashMap<>();
        map.put("users", getSessionFactory().createQuery("FROM UserModel").list());

        try {
            checkDirectoryAndFileName(pathToSaveFile);

            obMapper.writeValue(new File(pathToSaveFile), map);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void checkDirectoryAndFileName(String path) throws FileNotFoundException {
        boolean flag = false;
        File file = new File(path);

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

        if (flag) {
            System.out.printf("Folder and File created\nFile location: %s\nFilename: %s", file.getParent(), file.getName());
        } else if (!file.getParentFile().isDirectory() && !file.exists()) {
            System.out.printf("Incorrect path to folder or filename\nFile location: %s\nFilename: %s", file.getParent(), file.getName());

            throw new FileNotFoundException();
        }

    }

}
