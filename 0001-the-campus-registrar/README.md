Problem 0001: The Campus Registrar
Description

The administration at a technical institute needs a system to process student registration data. You are tasked with creating a Student class that captures basic information and processes it using Java’s core String and Date utilities.

To complete this challenge, you must:

    Class Design: Define a class Student with private fields for name and rollNumber.

    Namespace Resolution: Use a constructor that utilizes the this keyword to resolve namespace collisions between parameters and instance variables.

    Data Parsing: Process a "Raw Data String" provided in the format: Name|RollNumber|DD-MM-YYYY.

    String Manipulation:

        Use the String.split() method to separate these components.

        Use String.toUpperCase() for the name.

        Use String.indexOf() to find the position of the first space in the student's name. If no space exists, output -1.

    Date Formatting: Use SimpleDateFormat from java.text to parse the input date and then reformat it into the readable version: Month Day, Year (e.g., March 14, 2026).

Input

A single line containing a string in the format: Name|RollNumber|Date

    Name: A string (may contain spaces).

    RollNumber: An integer.

    Date: A string in DD-MM-YYYY format.

Output

Four lines of output:

    The student's name in all uppercase.

    The roll number.

    The reformatted date.

    The index of the first space in the name.

Example

Input
Plaintext

Suman Biswas|101|14-03-2026

Output
Plaintext

SUMAN BISWAS
101
March 14, 2026
5

Concepts Triggered

    java.lang.String (split, toUpperCase, indexOf)

    java.util.Date & java.text.SimpleDateFormat

    this keyword usage

    Encapsulation (Private fields)