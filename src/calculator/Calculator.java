package calculator;

public class Calculator {
    public double firstNumber;
    public double secondNumber;

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double add() {
        return firstNumber + secondNumber;
    }

    public double minus() {
        return firstNumber - secondNumber;
    }

    public double multiply() {
        return firstNumber * secondNumber;
    }

    public double pow(){
        return Math.pow(firstNumber, secondNumber);
    }

    public double divide() {
        return firstNumber / secondNumber;
    }
}
