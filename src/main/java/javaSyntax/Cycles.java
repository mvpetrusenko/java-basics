package javaSyntax;

public class Cycles {

    public static void main(String[] args) {

        //if(condition) - if condition is true - execute command1
        //command1;
        //else - else execute command2
        //command2;


        int age = 17;

        if(age < 18)
            System.out.println("You are still a child");
        else
            System.out.println("You are an adult");



        //for a block of command

        int temperature = 4;

        if(temperature < 0)
        {
            System.out.println("It is cold outside");
            System.out.println("Put on a cap!");
        }
        else
        {
            System.out.println("It is warm");
            System.out.println("Ride a bike!");
        }


        //without else

        int peopleInRoom = 100;


        if (peopleInRoom > 5)
            System.out.println("It is crowded!");


        // a lot of different actions depending on the value
        // not to write if-else, if-else, if-else, instead:
        // in the console will be: put on a jacket

        int weatherTemperature = 9;

        if(weatherTemperature > 20) {
            System.out.println("Put on a T-shirt");
        } else if (weatherTemperature > 10) // there temperature not more than 20
        {
            System.out.println("Put on a sweater");
        } else if (weatherTemperature > 0) // there temperature not more than 10
        {
            System.out.println("Put on a something");
        } else // there temperature less than 0
            System.out.println("Come back home");



        // do not use: 18 < age < 65
        // use instead: (18 < age) && (age < 65)
        // or: ||
        //not: ! - (!a) && (!b)


        /*

        true && true = true
        true && false = false
        false && true = false
        false && false = false

         */


        /*

        true || true = true
        true || false = true
        false || true = true
        false || false = false

         */


        /*

        !true = false
        !false = true

         */



        // in Java there are 4 types of cycles: while, for, for-each and do-while

        //cycle While: while condition is true - execute a command

        // in the console will be: 5, 4, 3, 2, 1
        //operator break to stop a cycle


        int m = 5;

        while (m > 0) {
            System.out.println(m);
            m--;

        }


        // use cycle while: commands should be executed several times
        // use cycle while: you know how many times commands should be executed



    }

}
