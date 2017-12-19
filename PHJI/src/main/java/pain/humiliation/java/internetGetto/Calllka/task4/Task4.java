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

    public void runMethod(String[] inputMassive, int index){
        outputMassive(inputMassive);
        outputReverseMassive(inputMassive);
        deleteIndex(inputMassive, index);
    }

    private void outputMassive (String[] inputMassive){
        String outputSentence = "";

        for (String str : inputMassive){
            outputSentence = outputSentence + str;
        }

        System.out.println(outputSentence);

    }

    private void outputReverseMassive (String[] inputMassive){
        String outputSentence = "";

        for (int i = inputMassive.length - 1; i >= 0; i--){
            outputSentence = outputSentence + inputMassive[i];
        }

        System.out.println(outputSentence);

    }

    private void deleteIndex(String[] inputMassive, int x){
        String outputSentence = "";

        for (int i = 0; i < inputMassive.length; i++){
            if(i == x) inputMassive[i] = "_";

            outputSentence = outputSentence + inputMassive[i];
        }

        System.out.println(outputSentence);

    }
}