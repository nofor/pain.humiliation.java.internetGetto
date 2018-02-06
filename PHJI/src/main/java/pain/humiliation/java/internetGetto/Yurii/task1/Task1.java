package pain.humiliation.java.internetGetto.Yurii.task1;

public class Task1 {
    public void outputDigitsByLoop(int j){
        System.out.println("for loop:");

        for(int i = j; i < 10; i++){
            System.out.print(i + " ");
        }

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public void outputDigitsByWhileDo(){
        int i = 0;

        System.out.println("while do:");

        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public void outputDigitsByDoWhile(){
        int i = 0;
        System.out.println("do while:");

        do {
            System.out.print(i + " ");
            i++;
        } while(i < 10);

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
