package pain.humiliation.java.internetGetto.Yurii.task2;

public class Task2 {
    public void divideIntVariableWithRemain(int firstNumber, int secondNumber) {
        if(secondNumber == 0) {
            System.out.println("Division by zero is forbidden");
        } else {
            int divideResult = firstNumber / secondNumber;
            int remainderOfTheDivision = firstNumber % secondNumber;
            //todo extra line
            System.out.println(firstNumber + "/" + secondNumber + " = " + divideResult + " & " + remainderOfTheDivision + " in remain");
        }
    }

    public void divideDoubleVariableWithRemain(double firstNumber, double secondNumber) {
        if(secondNumber == 0) {
            System.out.println("Division by zero is forbidden");
        } else {
            double divideResult = firstNumber / secondNumber;
            double remainderOfTheDivision = firstNumber % secondNumber;
            //todo extra line
            System.out.println(firstNumber + "/" + secondNumber + " = " + divideResult + " & " + remainderOfTheDivision + " in remain");
        }
    }

    public void sumDigitsOfNumber(int num) {
        if(num < 10) {
            System.out.println("Input number < 10");
        } else if(num >= 100){
            System.out.println("Input number >= 100");
        } else {
            int sumResult = 0;
            int temp  = num;

            while (temp > 0) {
                sumResult = sumResult + temp % 10;
                temp = temp / 10;
            }

            System.out.println("sum digits of number " + num + " = " + sumResult);
        }
    }

    public void sumDigitsOfNumberWithConvertToString(int num) {
        String str = Integer.toString(num);
        if(str.length() < 3) {
            System.out.println("Input number < 100");
        } else if(str.length() > 3){
            System.out.println("Input number >= 1000");
        } else {
            int sumResult = 0;

            for (int i = 0; i < str.length(); i++) {
                sumResult += Character.getNumericValue(str.charAt(i));
            }

            System.out.println("sum digits of number " + num + " = " + sumResult);
        }
    }

    public void roundNumberWithDecimal (double num) {
        int result = (int)(num + 0.5);  //todo remove it
        System.out.println("Round of " + num + " = " + result);
    }
}
