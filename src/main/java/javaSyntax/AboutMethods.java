package javaSyntax;

public class AboutMethods {

    public static void main(String[] args) {


        // it will print Good morning 2 times
        // values which are passed to the method during calling of the method are called Arguments of the method

        printDifferentLines("Good morning", 2);
        printDifferentLines("See you later", 3);


        returningString();


        // function / method - a group of commands with the unique name

        /*

               basic method:

               public static void methodName()
               {
                    code of the method

                }

               after creation of the method we can call it in our other methods:

               methodName();

               we also can call our methods inside main method

         */

        //variables inside one method stay in this method
        // you can create 2 the same variables in different methods


        //parameters of the function (as System.out.println("ddd"); :

         /*

               public static void methodName(parameters)
               {
                    code of the method

                }


         */


    }


    // parameters - special variables of the method
    // using them you can pass to the method different values during the calling of the method

    public static void printDifferentLines(String text, int count) {
        for (int i = 0; i < count; i++)
            System.out.println(text);
    }
    //and call it in main method (see up)


    // the result of the function:
    // operator return
    // in Java methods can have values
    // methods not only can do something depending on parameters
    // but also calculate something and return the result of this calculation
    // method to UpperCase returns value of type String
    // every method can return only 1 value of putted type
    // for the method which do not return anything use void type
    // return value;


    // it will be: AAAAAA

    public static String returningString() {
        String str = "aaaaaa";
        String str2 = str.toUpperCase();

        System.out.println(str2);

        return str2;


    }

    // access modificators (can limit access to the method from the other classes
    // or without any modificator
    // public - apply to it from any method of any class (from any place of the program)
    // protected - access from its own package, its own class, from inherited class, NOT from any class
    // private - access only from this class


    // keyword static turns a method on static
    // it belongs to the class, where it was set
    // to call static method:
    // className.methodName();
    // examples: Thread.sleap(), Arrays.sort()

    // you can not write className if you call static method from its own class:
    // like NOT AboutMethods.printDifferentLines()

    // static method can NOT apply to non-static methods of its class

    // all methods we want to call from the method main should be static

    // public static void main(String[] args): receives parameters - an array of strings
    // args gives a hint of: arguments of the program
    // while running a program to it we can pass parameters (an array of strings)
    // they will be in the array args of the method main()





    // visibility of variables
    // local variables - variables initialized inside of the methods
    // it exists only in the block of code { }  where it was initialized


    // variables of the class
    // you can call them from any method of the class
    // class variables are common variables for all methods of the class




    // static variables
    // static methods can call only to static variables
    // to call them from the other classes: ClassName.variableName

    // to public static variables you can call from any method of the program (and not only from the method)





    // constant (final)  - a variable where its value can NOT be change:
    // final type name = value;

    // method (can NOT be override) and class (can NOT be basic for inheritance)  also can be final

    // modifier final can be before different types of variables: local, parameters, class fields and static variables
    // if a variable saves a reference on the object (array values) , this object can be changed

    // global constants: public final static variables of the class:
    //class A: { public static final int DISPLAY_WIDTH = 1024;


    // variable in the for cycle can be visible only in the cycle body and in the for(int i = 0)
    // so, you can write several for cycles with i variable



















}
