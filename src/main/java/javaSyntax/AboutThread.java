package javaSyntax;

public class AboutThread implements Runnable { // class which implements interface Runnable

    // the result will be in the console: I am a printer
    @Override
    public void run() {
        System.out.println("I am a printer");
    }



    public static void main(String[] args) {

        // multithreading like different cars in a race
        // like having several robot which execute in parallel different jobs

        AboutThread printer = new AboutThread();
        Thread childThread = new Thread(printer);
        childThread.start();


        // 1. creation object of the class AboutThread, which contains method run
        // 2. creation of a new object of the class Thread,
        // pass to him in the constructor object printer, whose
        // method run need to be executed
        // 3. start the new thread to work by calling method start

        // main thread executes method main and finishes
        // for childthreads instead of method main will be method run
        // of the interface Runnable
        // (like: a lot of threads - a lot of methods main





    }

}
