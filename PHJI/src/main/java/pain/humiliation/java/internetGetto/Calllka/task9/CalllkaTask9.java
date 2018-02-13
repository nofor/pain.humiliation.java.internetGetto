package pain.humiliation.java.internetGetto.Calllka.task9;

import java.util.ArrayList;

public class CalllkaTask9 {
    private ArrayList<Integer> list = new ArrayList<>();

    public void outputElement(ArrayList<Integer> someList){
        for (int i = 1; i < 26; i++){
            System.out.println("Cycle number: " + i);
            for(Integer temp : someList){
                System.out.println("Cycle number: " + i + " ; " + "Element: " + temp);
            }
        }
    }

    public synchronized void outputPoolThread(ArrayList<Integer> someList){
        for(Integer temp : someList){
            System.out.println("Element: " + temp);
        }
    }

    public ArrayList<Integer> addElement(){
        for (int i = 1; i < 101; i++){
            list.add(i);
        }

        return list;
    }

}
