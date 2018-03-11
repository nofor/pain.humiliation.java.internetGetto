package pain.humiliation.java.internetGetto.Calllka.task12;

import pain.humiliation.java.internetGetto.Calllka.task12.exception.FileNameException;

//todo do not create custom message in _catch_ block, use exception message or cause
public class Task12 {
    //todo add extra line
    String filename;

    Task12(String inputFileName) {
        this.filename = inputFileName;
    }

    public void methodToCheckHowToWorksTryCatchFinally() {
        String tempString = filename;
        //todo add extra line
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
            } catch (FileNameException e) {
                e.outputExceptionsMessage();
            } finally {
                System.out.println("Block 'finally' work every time");
            }
        }
    }

    public void evokeStackOverFlow(int num) {    //todo revork, you no need incoming variable here
        try {
            System.out.println("Number: " + num);

            evokeStackOverFlow(++num);
        } catch (StackOverflowError ex) {
            System.out.println("\nPlz be careful then u use recursive");
        }
    }

    public void evokeOutOfMemoryError() {
        try {
            long[] l = new long[Integer.MAX_VALUE];    //todo do not create unusable variable
        } catch (OutOfMemoryError ex) {
            System.out.println("WTF Karl????????");
        }
    }

    public void evokeArithmeticException() {
        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException ex) {
            System.out.println("plz, don't divide by zero");
        }
    }

    public void evokeArrayIndexOutOfBoundsException() {
        try {
            int[] j = new int[10];
            //todo add extra line
            for (int i = 0; i < j.length + 1; i++) {
                j[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Watch the arrays length");
        }
    }

    public void evokeClassCastException() {
        int i = 10;

        try {
            System.out.println((char) i);
        } catch (ClassCastException ex) {
            System.out.println("Plz don't cast digit to char or conversely");
        }
    }

    public void evokeArrayStoreException() {
        try{
            Object[] o = "a;b;c".split(";");
            o[0] = 42;
        } catch (ArrayStoreException ex){
            System.out.println("Added element must be have similar type");
        }
    }

    public void evokeIllegalArgumentException() {
        try{
            int a = Integer.parseInt(null);
            System.out.println(a);  //todo this code never run
        } catch (NumberFormatException ex){
            System.out.println("incorrect parse string to digit");
        }
    }

    public void evokeIndexOutOfBoundsException() {
        try {
            int[] j = new int[3];

            for (int i = 0; i < j.length; i++){    //todo no need to do it
                j[i] = i;
            }

            System.out.println(j[4]);
        } catch (IndexOutOfBoundsException ex){
            System.out.println("Handle IndexOutOfBoundsException");
        }
    }

    public void evokeNegativeArraySizeException() {
        try {
            int[] i = new int[-8];    //todo unusable variable
        } catch (NegativeArraySizeException ex){
            System.out.println("Array can't have minus value");
        }
    }

    public void evokeNullPointerException() {
        try {
            String string = null;

            if (string.equals("sadsa"));  //todo do not use _if_ block
        } catch (NullPointerException ex){
            System.out.println("can't equals null value");
        }
    }
}
