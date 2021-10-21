/**
 * Fibonacci Sequence Analysis
 * Fibonacci sequence - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 *
 * @author Juan Gomez Blandon
 * @email jgomezblandon@mail.valenciacollege.edu
 *
 */

package Fibonacci_Assignment;

public class Main {


    /**
     * Recursive method that return a fibonacci number based on sequence inputNumber
     *
     * @param inputNumber
     * @return
     */
    public static int fibonacciRecursion(int inputNumber) {
        // return specific fibonacci number for input numbers 0 and 1
        if (inputNumber == 0) {
            return 0;
        } else if (inputNumber == 1) {
            return 1;
        }
        // makes 2 recursive calls for every input number
        return fibonacciRecursion(inputNumber - 1) + fibonacciRecursion(inputNumber - 2);
    }


    /**
     * Iterative method that return a fibonacci number based on sequence inputNumber
     *
     * @param inputNumber
     * @return
     */
    public static int fibonacciIterative(int inputNumber) {
        // return specific fibonacci number for input numbers 0
        if (inputNumber == 0) return 0;
        //use loop storing values to prevent us from constantly using memory space
        int previouspreviousNumber, previousNumber = 0, currentNumber = 1;

        for (int i = 1; i < inputNumber ; i++) {
            previouspreviousNumber = previousNumber;
            previousNumber = currentNumber;
            currentNumber = previouspreviousNumber + previousNumber;
        }
        return currentNumber;
    }


    public static void main(String[] args) {

        int i, recursiveValue;
        int counter = 45;

        System.out.print("Recursive method - Fibonacci Sequence\n");
        System.out.print("Input\tFibonacci Number\tTime Elapsed Nanosecond\n");

        for (i=0; i <= counter; i++){
            long startTime = System.nanoTime();
            recursiveValue = fibonacciRecursion(i);
            long endTime = System.nanoTime();
            long timeElapsed = endTime - startTime;

            System.out.print(i+"\t\t" + recursiveValue + "\t\t\t\t\t\t" + timeElapsed + "\t\n");
        }

        System.out.print("-------------------------------------------------------------------\n");
        System.out.print("Iterative method - Fibonacci Sequence\n");
        System.out.print("Input\tFibonacci Number\tTime Elapsed Nanosecond\n");

        for (i=0; i <= counter; i++){
            long startTime = System.nanoTime();
            recursiveValue = fibonacciIterative(i);
            long endTime = System.nanoTime();
            long timeElapsed = endTime - startTime;

            System.out.print(i+"\t\t" + recursiveValue + "\t\t\t\t\t\t" + timeElapsed + "\n");
        }
    }
}
