package pain.humiliation.java.internetGetto.Calllka.task15;

import pain.humiliation.java.internetGetto.Calllka.task14.model.UserModel;
import pain.humiliation.java.internetGetto.Calllka.task15.convertation.ConvertTo;

public class Task15 extends ConvertTo{
    private String pathToSavingFile;

    Task15(String pathToSavingFile) {
        this.pathToSavingFile = pathToSavingFile;
    }

    public void convertToJSON() {
        convertToJSON(pathToSavingFile);
    }

    public void viewDataFromJSON() {
        for(UserModel userModel : convertToObject(pathToSavingFile)){
            System.out.println(userModel);
        }
    }

    public void insertJSONToDB(){
        for(UserModel userModel : convertToObject(pathToSavingFile)){
            insertInToTheTable(userModel);
        }
    }
}
