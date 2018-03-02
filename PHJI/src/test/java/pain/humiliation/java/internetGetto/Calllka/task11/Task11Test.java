package pain.humiliation.java.internetGetto.Calllka.task11;

import org.junit.Test;

public class Task11Test {

    private String NAME_OF_USED_FILE = "Songs";
    private String DIRECTORY_PATH_TO_FILE = "C:\\Media\\Dewelopment\\Configs";
    private Task11 task11 = new Task11(DIRECTORY_PATH_TO_FILE, NAME_OF_USED_FILE);

    // New File is created with the name "New" + oldFilename".txt
    @Test
    public void writeTextInNewFileTest(){
        //todo move it class variable
        String directoryPathForSavedNewFile = "C:\\Media\\Dewelopment\\Configs";
        //"directoryPathForSavedNewFile" Path to directory where will be created a new file.
        task11.writeInToHashMap(directoryPathForSavedNewFile);
    }
}
