package pain.humiliation.java.internetGetto.Yurii.task1;

public class Task1 {
    //todo extra line
    public void outputDigitsByLoop(int j){  //todo zdelay 2 parametra. 1-y otkyda nachinaetsa cucl, 2-y gde zakanchivaetsya
        System.out.println("for loop:");

        for(int i = j; i < 10; i++){
            System.out.print(i + " ");
        }

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public void outputDigitsByWhileDo(){  //todo zdelay 2 parametra. 1-y otkyda nachinaetsa cucl, 2-y gde zakanchivaetsya
        int i = 0;

        System.out.println("while do:");

        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public void outputDigitsByDoWhile(){  //todo zdelay 2 parametra. 1-y otkyda nachinaetsa cucl, 2-y gde zakanchivaetsya
        int i = 0;
        System.out.println("do while:");

        do {
            System.out.print(i + " ");
            i++;
        } while(i < 10);

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
