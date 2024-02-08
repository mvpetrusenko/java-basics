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


        // use cycle WHILE: commands should be executed several times
        // use cycle FOR: you know how many times commands should be executed


        //comment/uncomment Ctrl + /

        // there will be: 0, 1 ... 13, 14

        for (int i = 0; i < 15; i++)
            System.out.println(i);


        /* for (command1; comdition; command2)

            {
                block of the commands
            {

         */




        /*  command1;
            while (i < 15)
            {

                command2
            {

         */


        /*  int i = 0;
            while (comdition)
            {
                System.out.println(i);
                i++;
            {

         */


        //cycle do-while: cycle body will be executed again and again
        //till condition = true

        /*

            do
                command;
            while (condition)

         */


        // in while cycle execution is like: condition, cycle body, condition, cycle body
        // in do-while cycle: cycle body, condition, cycle body, condition
        // in do-while cycle the body of the cycle will be executed at least once
        // use cycle do-while when you do not need check the condition, till cycle body was not executed


        // debugger: to run code line by line use F8 after you put a breakpoint (console tab to see output (text))
        // for entering your methods use F7 instead, for all method to be executed step by step

        // in main method you can call your functions from other methods: main2();
        // to see the value of variables during debugging (debugger tab)
        // if we press F8 while executing a cycle it will execute a cycle several times



    }

}
