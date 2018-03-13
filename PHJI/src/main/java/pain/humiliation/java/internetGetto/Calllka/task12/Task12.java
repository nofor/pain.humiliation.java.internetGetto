package pain.humiliation.java.internetGetto.Calllka.task12;

import pain.humiliation.java.internetGetto.Calllka.task12.exception.FileNameException;

//todo do not create custom message in _catch_ block, use exception message or cause DONE
public class Task12 {

    static int  num;
    String filename;

    Task12(String inputFileName) {
        this.filename = inputFileName;
    }

    public void methodToCheckHowToWorksTryCatchFinally() {
        String tempString = filename;

        for (int i = 0; i < 2; i++) {
            if (i == 1) {
                filename = filename.replaceAll(".txt", "");
            }

            try {
                if (tempString.equals(filename)) {
                    System.out.println("It work block 'try'");
                } else {
                    throw new FileNameException("It work block 'catch'");
                }
            } catch (FileNameException ex) {
                System.out.println(ex.getMessage());
            } finally {
                System.out.println("Block 'finally' work every time");
            }
        }
    }

    public void evokeStackOverFlow() {    //todo revork, you no need incoming variable here DONE
        try {
            evokeStackOverFlow();
        } catch (StackOverflowError ex) {
            System.out.println("Plz be careful then u use recursive");
        }
    }

    public void evokeOutOfMemoryError() {
        try {
            System.out.println(new long[Integer.MAX_VALUE]);   //todo do not create unusable variable DONE
        } catch (OutOfMemoryError ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void evokeArithmeticException() {
        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void evokeArrayIndexOutOfBoundsException() {
        try {
            int[] j = new int[10];

            for (int i = 0; i < j.length + 1; i++) {
                j[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void evokeClassCastException() {
        int i = 10;

        try {
            System.out.println((char) i);
        } catch (ClassCastException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void evokeArrayStoreException() {
        try{
            Object[] o = "a;b;c".split(";");
            o[0] = 42;
        } catch (ArrayStoreException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void evokeIllegalArgumentException() {
        try{
            Integer.parseInt(null);//todo this code never run DONE
        } catch (NumberFormatException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void evokeIndexOutOfBoundsException() {
        try {
            int[] j = new int[3];  //todo no need to do it DONE

            System.out.println(j[4]);
        } catch (IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void evokeNegativeArraySizeException() {
        try {
            System.out.println(new int[-8]);    //todo unusable variable DONE
        } catch (NegativeArraySizeException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void evokeNullPointerException() {
        try {
            String string = null;

            string.equals("sadsa"); //todo do not use _if_ block DONE
        } catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }
    }
}
