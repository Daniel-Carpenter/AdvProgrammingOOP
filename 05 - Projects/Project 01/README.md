# Project 1: String and Date/Time

## Understanding of the Problem 

* Within this Java Project, the program allows the user to calculate the 
`Hamming Distance` of two given stations. According to the project description,
the Hamming Distance is the "distance between two strings of equal length;
it calculates the "number of positions at which the corresponding symbols 
are different." For example, if the two Strings are contain the same characters
in the same sequence, then the Hamming Distance will be 0. Alternatively, if 
the characters do not match at in sequence, the hamming distance will equal the
number of characters in the string, i.e. 4. See example below for more:


| char 1 | char 2 | char 3 | char 4 |  Hamming Distance |
|:------:|:------:|:------:|:------:|:-----------------:|
|    R   |    O   |    C   |    K   |                   |
|    R   |    O   |    F   |    L   |                   |
|    0   |    0   |    1   |    1   | 0 + 0 + 1 + 1 = 2 |


* Additionally, the user will understand how Java date and time formats work.


## Problem-Solving approach

* In order to compile the tasked program, I used a systematic approach to 
tackle the issue.
	+ First, I used the UML diagram provided to understand the methods within both `.java` files.
	+ Next, I incrementally tested the program in another `.java` file to ensure that the output
	 of each method matched the project decription's example output.
	+ As I tested these methods in the "scratch" file, I began putting them into the `DateTimeOne.java`
	 and the `HammingDist.java` files. This workflow allowed for minimal errors, and if there were errors, 
	 then I was able to quickly recover.
	+ After completing all methods, I then tested the `Driver.java` class to ensure that the file output 
	the correct information.


## Description of Methods and Variables

* Below gives a description of the variables that were ***NOT*** included in the template files provided by the instructor.

### DateTimeOne.java

1. `getValueOfSecond()` - Formats the (local) current date-time as second in an `int` variable.

2. `sleepForThreeSec()` - "Interupts" the program for 3-seconds. No iterations take place during this pause.


***

### HammingDist.java




















