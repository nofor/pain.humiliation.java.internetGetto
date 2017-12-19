package pain.humiliation.java.internetGetto.Calllka.task4;

/*1. What is massive ?
2. Task 4. Create String array with 11 elements.
3. Create method that takes an array and displays the first to last element of the array in ONE STRING.
4. Create method that takes an array and displays the last to first element of the array in ONE STRING.
5. Create method that takes an array of the first parameter, and any integer of the second. Delete specified element from an array.
6. DONE all "to do" that were discussed.
7. Do all methods in your own branches.
8. Don't merge (bad word). At next lessons will merge together.**/

public class Task4 {
    private String[] mainMassive = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"};


    public void runMethod(int x){
        outputMassive(mainMassive);
        outputReverseMassive(mainMassive);
        deleteIndex(mainMassive, x);
    }

    private void outputMassive (String[] mass){
        String temp = "";

        for (String str : mass){
            temp = temp + str;
        }

        System.out.println(temp);

    }

    private void outputReverseMassive (String[] mass){
        String temp = "";

        for (int i = mass.length - 1; i >= 0; i--){
            temp = temp + mass[i];
        }

        System.out.println(temp);

    }

    private void deleteIndex(String[] mass, int x){
        String temp = "";

        for (int i = 0; i < mass.length; i++){
            if(i == x) mass[i] = "_";

            temp = temp + mass[i];
        }

        System.out.println(temp);

    }
}