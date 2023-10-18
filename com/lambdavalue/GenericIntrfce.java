package com.lambdavalue;

// Define a functional interface
interface GenericInterface<T> {
    T func(T t);
}

public class GenericIntrfce {

    public static void main(String[] args) {

        // Create a Lambda expression to reverse a string
        GenericInterface<String> reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                result = result + str.charAt(i);
            return result;
        };
        System.out.println("Lambda Reverse: " + reverse.func("Pranav"));

        // Create a Lambda expression to calculate the factorial of a number
        GenericInterface<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println("Factorial of 5: " + factorial.func(5));
    }
}
