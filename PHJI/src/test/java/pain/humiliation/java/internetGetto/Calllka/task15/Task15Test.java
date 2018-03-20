package pain.humiliation.java.internetGetto.Calllka.task15;

import org.junit.Test;

import java.io.File;

public class Task15Test {
    private String PATH_TO_JSON = new File("src/main/java/pain/humiliation/java/internetGetto/Calllka/task15/sourcePackage/users.json").getAbsolutePath();
    private Task15 task15 = new Task15(PATH_TO_JSON);


    @Test
    public void testConvertToJSON() {
        task15.convertToJSON();
    }

    @Test
    public void testViewAllJSON() {
        task15.viewDataFromJSON();
    }

    @Test
    public void testInsertJSONToDB() {
        task15.insertJSONToDB();
    }
}
