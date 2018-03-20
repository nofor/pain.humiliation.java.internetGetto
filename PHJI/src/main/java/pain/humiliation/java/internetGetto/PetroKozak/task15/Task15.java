package pain.humiliation.java.internetGetto.PetroKozak.task15;

import pain.humiliation.java.internetGetto.PetroKozak.task14.model.Model;

public class Task15 extends Converter{


    public void insertToDB(){

        for (Model model:convertToObjeect()) {
            insert(model);
        }
    }
}
