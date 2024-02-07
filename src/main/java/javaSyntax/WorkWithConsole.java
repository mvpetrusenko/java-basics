package javaSyntax;

import java.util.Scanner;

public class WorkWithConsole {

//Object System.in read one symbol from the keyboard
//create a new object of the class Scanner, which reads from different sources
// pass System.in as a parameter
// .method(parameter) - calling a method
// what one enters in the console will be saved in a variable name/age

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String name = console.nextLine(); // read from the console text line
        int age = console.nextInt(); // read from the console number

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);


    }

}
