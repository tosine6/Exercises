// program basic calculations

public class Calculator {

    public int multiply(int number1, int number2){
        int times = number1 * number2;
            return times;
    }

    public int compare(int input1, int input2){
        if (input1 > input2){
            return input1;
        }
        else {
            return input2;
        }
    }

    public int check(int numb1, int numb2, int numb3){

        if (numb1 > numb2  &&  numb1> numb3){
            return numb1;
        }
        else if (numb3 > numb1 && numb2 > numb3){
            return numb2;
        }
        else {
            return numb3;
        } 
    }
    public double check1(double number1){
        if (number1 % 2 == 0){
            double squareRoot = Math.sqrt(number1);
                return squareRoot;
        }
        else {
                    return number1;
                }
        }
    }
