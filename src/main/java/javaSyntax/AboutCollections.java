package javaSyntax;

public class AboutCollections {

    // class ArrayList - class of the collections
    // it was created because we can not change the length of the ordinary array
    // ArrayList - array, but can CHANGE its length



    // creation of object of the class ArrayList:
    // ArrayList<Type> name = new ArrayList<Type>();
    // ArrayList<String> list1 = new ArrayList<String>();



    // operations with ArrayList:
    // void add(type value) - add to the list passed element
    // void add(int index, type value) - add element on the certain position in the list
    // type get(int index) - return element with the number index
    // void set(int index, type value) - change value of element with number index to value
    // type remove(int index) - remove element with number index. Returns removed element
    // boolean contains(type value) - check if there is in the list element value
    // boolean isEmpty() - check if the list is empty or not (if length of the array = 0)
    // int size() - return the length of the list - quentity of elements of the list


    // with ordinary array you can do just:
    // creation of the array
    // getting element by its number
    // finding out element by its number
    // getting the length of the array


    // generics - ability to add to types type-parameters: MainType<TypeParametr>

    // class HashMap - collection - key : value:
    // HashMap<TypeOfKeys, TypeOfValues> name = new HashMap<TypeOfKeys, TypeOfValues>();



    /*


        switch(expression)
        {
            case value1: code 1;
            case value2: code 2;
            case value3: code 3;

        }


            if not to add break to switch all 3 cases will be executed



     */

    public static void main(String[] args) {


        // it will be Low
        // default like else (if nothing is true execute this)

        int temperature = 36;

        switch(temperature) {
            case 36:
                System.out.println("Low");
                break;
            case 37:
                System.out.println("Normal");
                break;
            case 38:
                System.out.println("High");

        }



        // it will be Call an ambulance

        int temperature2 = 40;

        switch(temperature2) {
            case 36:
                System.out.println("Low");
                break;
            case 37:
                System.out.println("Normal");
                break;
            case 38:
                System.out.println("High");
                break;
            default:
                System.out.println("Call an ambulance!");


        }

    }


    // use if-else if inside of if conditions for each case there are different difficult expressions





}

