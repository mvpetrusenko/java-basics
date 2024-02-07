package javaSyntax;

/*
Just basic class
 */

public class BasicClass {

    //variable - box, value of the variable - what box contains
    //variable for saving and reusing value
    //main - method (function) which will be called first with JVM (Java Virtual Machine)
    //class (class name = file name) contains methods, method contains variables and commands



    //int a = 4;
    int b;

    static int c = 3 * 5;

    static String phrase = "Hi!";

    public static void main(String[] args) {

        int a = 4;

        System.out.println(phrase);

        System.out.println(a);

        System.out.println("The number is " + a);


        System.out.println(c);

        //increasing on 1, the same is a = a + 1

       int d =  6;
       d++;

        System.out.println(d);



        String changePhrase = "AAAAAAAA";

        String newPhrase = changePhrase.toLowerCase();

        System.out.println(newPhrase);

    }

}
