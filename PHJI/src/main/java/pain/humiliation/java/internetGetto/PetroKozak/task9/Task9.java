package pain.humiliation.java.internetGetto.PetroKozak.task9;

import java.util.ArrayList;

public class Task9 {

    public void addingToCollection(ArrayList<Object> x) {
        int count = 1;

        for (int i = 0; i < 100; i++) {
            x.add(count);
            count++;
        }
    }

    public synchronized void printingOut25TimesWithCode(ArrayList<Object> x) {

        for (int i = 1; i < 25; i++) {
            for (Object temp : x) {
                System.out.print(temp);
            }
            System.out.println("");
        }
    }

    public  void printOutForThread(ArrayList <Object> x){

        for (Object temp : x) {
            System.out.print(temp+" ");
        }
        System.out.println("");
    }

}
