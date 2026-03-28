Problem 0002: The Statistics Calculator
Description

You are building a mathematical utility library. The goal is to create a tool that can calculate the sum of numbers regardless of how they are passed—whether as two integers, two doubles, or a dynamic list of integers. Additionally, the system must keep a global count of how many successful operations have been performed across the entire application.

Requirements:

    Static Member: Define a static variable totalOperations in the StatisticsCalculator class. This should increment every time any add method is called.

    Method Overloading:

        Implement add(int a, int b): Returns the sum of two integers.

        Implement add(double a, double b): Returns the sum of two doubles.

    Varargs:

        Implement add(int... numbers): Returns the sum of a variable number of integers.

    Static Method: Create a static method getOperationCount() to return the current value of totalOperations.

    Main Class: In your Main class, demonstrate calling each version of the overloaded method and finally print the total operations performed.

Input

The input consists of three parts:

    Two integers for the first operation.

    Two doubles for the second operation.

    A sequence of integers for the third operation (the first number indicates how many integers follow).

Output

    The result of the integer addition.

    The result of the double addition (formatted to 1 decimal place).

    The result of the varargs addition.

    The total number of operations performed by the calculator.

Example

Input
Plaintext

10 20
15.5 4.5
5 1 2 3 4 5

Output
Plaintext

Sum of integers: 30
Sum of doubles: 20.0
Sum of varargs: 15
Total Operations: 3

Concepts Triggered

    Method Overloading: Providing multiple versions of the add method.

    Varargs (...): Handling an unknown number of arguments in a single method.

    Static Variables: Using a class-level variable to track state across instances.

    Static Methods: Accessing class-level data without instantiating the class.