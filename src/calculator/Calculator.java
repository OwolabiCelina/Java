package calculator;

public class Calculator{

    public int addTwoNumbers(int one, int two){
        int additionVariable = one + two;
        System.out.println("The addition is: " + additionVariable);
        return additionVariable;
    }

    public int subtractTwoNumbers(int one, int two) {
        int subtractionVariable = one - two ;
        System.out.println("The difference is: " + subtractionVariable);
        return subtractionVariable;
    }
//
    public int divideTwoNumbers(int one, int two) {
        int divisionVariable = one / two;
        System.out.println("The division is: " + divisionVariable);
        return divisionVariable;
    }
    public int multiplyTwoNumbers(int one, int two){
        int multiply = one * two;
        System.out.println("The multiplication is: " + multiply);
        return multiply;
    }
}
