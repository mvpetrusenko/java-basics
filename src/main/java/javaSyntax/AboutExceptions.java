package javaSyntax;

public class AboutExceptions {

    public static void main(String[] args) {

        // if no error will be this message will be printed:

        System.out.println("Beginning of method main");

        // objects-exceptions are inhereted from class Throwable

        /* catching exceptions: block try - catch

            try
            {
                code, where an error can be
            }
            catch(TypeOfException name)
            {
                code of processing the exception
            }

            name - variable of TypeOfExceoption

         */

        // in try you can call the other method

        // object-exception of type ArithmeticException can be set to variable of
        // type ArithmeticException and also to variables of its
        // classes-parents: RuntimeException, Exception and
        // Throwable - see scheme


        /*

            ArithmeticException ae = new ArithmeticException();
            RuntimeException runtime = new ArithmeticException();
            Exception exception = new ArithmeticException();
            Throwable trwbl = new ArithmeticException();

            catch an exception of type ArithmeticException can blocks of
            catch of any of 4 given above types

         */


        try {
            calculate(0);
        } catch (ArithmeticException e) {
            System.out.println("There will be dividing by 0");
        } catch (Exception e) {
            System.out.println("Some exception has been caught");
        }
        System.out.println("The end of method main");
    }

    public static void calculate (int k)
    {
        System.out.println("calculate the beggining of: " + k);
        System.out.println(2/k);
        System.out.println("calculate the end of: " + k);



    }


    /*

    it will print:

    Beginning of method main
    calculate the beginning of: 0
    There will be dividing by 0
    The end of method main



    In this example, the exception ArithmeticException can be caught by
    block catch(Exception e) and also by block catch(ArithmeticException e)
    It will be caught of block, which is first next to block try -
    by the first catch-block

    It is better those catch-blocks, which can catch almost all exception
    write closer to the end of the catch-blocks list

    Type Throwable can catch all existed Java exceptions
    If it will be put in the first catch-block
    code will not be compiled: because the compiler understands
    that in the code there are blocks which can NOT be reached


     */


    // Throwing of exceptions

    /*

        try
            {
                code, where an error can be
            }
            catch(TypeOfException name)
            {
                code of processing the exception
            }
            finally
            {
                code which has to be executed anyway
            }


     */


    // Types of exceptions:
    // 1. Throwable:
    // 1.1. Error (it is created by JVM if something serious happens:
    // not enough memory, shutdown of the program
    // with errors developer can NOT do anything (only write to the log)
    // 1. 2. Exception
    // 1.2.1. RuntimeException


    // NullPointerException - variables = 0
    // InvalidArgumentException - if to the method were passed invalid arguments
    // ArithmeticException - if in the method divided by 0



    // Types of exceptions in Java:
    // 1. checked - exceptions which are checked (inherited from the rest of classes)
    // 2. unchecked (all exceptions inherited from classes RuntimeException and Error

    // checked exceptions have additional requirements:
    // 1. should have type of exception in the header (signature of the method):
    // type method (parameters) throws checkedException
    // 2. add block catch for each exception or add them to throws of its method


    /*

        checked exception:

        public void calculate(int m) throws Exception
        {
            if (m == 0)
                throw new Exception("m equals 0!")
        }

     */


    /*

        unchecked exception:

        public void calculate(m)
        {
            if(m == 0)
                throw new RuntimeException("m equals 0!")
        }


     */


}