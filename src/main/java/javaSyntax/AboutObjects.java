package javaSyntax;

public class AboutObjects {

    public static void main(String[] args) {

        // in Java everything is objects (exept primitive types)

        // Objects - data (variables)  and methods, which are grouped together for processing this data

        // variables of the object often change only with the help of methods of the same object

        // each object has its type
        // type of the object - its class
        // each object has its own copy of class variables (fields of the class)
        // to create object of a certain class - use operator new:
        // Class variable = new Class(parameters);
        // Class - the name for variable and also the name of the class of created object
        // variable - variable, which save reference to the created object
        // parameters - parameters of the method of object creation:

        // Scanner console = new Scanner(System.in);
        // int a = console.nextInt();

        // created object is called object of the class or eksemplar of the class
        // class is called class of the object



        // constant objects = immutable objects = object which can NOT be changed
        // for example: class String (method toUpperCase()). Object of the class String can not be changed after its creation

        //OOP: combine variables and their methods in separate objects
        // 4 principles of OOP:
        // 1. Abstraction (only main necessary features and without optional features , with the help of abstract classes and interfaces)
        // 2. Encapsulation  - hiding of realization (examples: access modificators (private, public) and getters - setters, inside the plane capitan cabin)
        // 3. Inheritance (create the new thing on the basis of the old thing, inheritance of class from the existed class)
        // 4. Polymorphism (under one interface several realizations are hidden, a man can drive different
        // types of cars because they have the same interface: wheel, ...)
        // Polymorphism helps to unify applyint to objects of different classes (which usually have common parent)

        // in Java all program classes are saved in src (source) folder (package)

        /*

            file contains:

            package packageName; // packageName = folder name

            public class className // file name
            {

            }


         */


        // import of classes: java.lang.String (java.lang - package name; String - class name)

        // pauses of the program: Thread.sleep(2000); - 2 seconds; Thread.sleep(60 * 60 * 1000) - 1 hour

        // or class TimeUnit from the package java.util.concurrent: TimeUnit.HOURS.sleep(3); - 3 hours



        // creation of object:
        // Class name = new Class(parameters)



        // Constructor - method, which is responsible for processing of parameters during creation of the object
        // name of method-constructor (with a Capital letter) = name of its class
        // method-constructor does not have type of returning value

        /*

            constructor:

            modificators Class(parameters)
            {
                code
            }


         */



        /*


            public class Point   // Class Point
            {
                public int x;
                public int y;
            }

                Point(int x, int y)   // constructor of class Point
                    {
                        this.x = x;
                        this.y = y;
                    }
             }




             public class SomeClass     // Creation of an object of the class Point
             {
                public static void main(String[] args)   // constructor of the class will be called
                {
                    Point point = new Point(5, 10)
                }
              }


              variables-parameters of the constructor have the same names
              as class fields - x, y.
              Conflict of names is solved with the help of
              keyword this

         */





        /*


         Properties: getter and setter
         all variables of the class usually make private
         only methods of their class can change class variables
         if you want the other classes could get or change data inside object of your class
         you need to add to your class 2 methods: get-method and set-method:


         class Man
         {
            private String name; // private field name

            public Man (String name)  // initialization of the field with the help of constructor
            {
                this.name = name;
            }

            public String getName()   // getName() - method returns the value of the field name
            {
                return name;
            }

            public void setName (String name)
            {
                this.name = name;
            }
       }


         */


        // getName() for getting value of the field name
        // call method setName() to change value of the field name for the object of type Man
        // there no public class variables
        // Instead they will be set by private or protected and
        // every variable will have public getters and setters



        // class Object
        // in Java all classes are inherited from class Object
        // it means all these classes have the same methods of class Object
        // methods of class Object:
        // equals() - for comparing objects (comparing their references)
        // hashCode() - quick, but not accurate comparison (returns numbers, like comparing first letter in words)



















    }

}
