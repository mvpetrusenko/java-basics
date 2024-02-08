package javaSyntax;

import java.util.Arrays;

public class AboutArray {

    // array (or a table) is a container of the elements
    // for saving not one but a lot of values (from the executed cycle)
    // if a variable is like a box, an array is like a box divided on some sections with their own number (index)
    // numeration starts with 0
    // array[index] = value;

    public static void main(String[] args) {

        // creation of the array to store 30 numbers
        // int[] - array of int type
        // new - creation of an object
        // the size of the array (its length and type of values) can NOT be changed after its creation

        // type[] arrayName = new type[quantity];
        // int[] array1 = new int[100];
        //array.length;


        int[] firstArray = new int[10];
        firstArray[2] = 4;
        firstArray[3] = 6;
        firstArray[5] = firstArray[2] + firstArray[3];


        // it will print: 10
        String save1 = Arrays.toString(firstArray);
        System.out.println(save1);


        // filling in an array with numbers from 0 to 9:

        int[] fillingArray = new int[10];

        for (int i = 0; i < 10; i++)
            fillingArray[i] = i;


        //method Arrays.toString() - the full name java.util.Arrays

        String save2 = Arrays.toString(fillingArray);
        System.out.println(save2);



        // filling in an array with numbers from 1 to 10:

        int[] increasingArray = new int[10];

        for (int i = 0; i < 10; i++)
            increasingArray[i] = i + 1;


        //method Arrays.toString() - the full name java.util.Arrays

        String save3 = Arrays.toString(increasingArray);
        System.out.println(save3);



        // filling in an array with numbers from 10 to 1:

        int[] decreasingArray = new int[10];

        for (int i = 0; i < 10; i++)
            decreasingArray[i] = 10 - i;

        String save4 = Arrays.toString(decreasingArray);
        System.out.println(save4);


        //quick filling in an array with values:

        //int[] months = new int[12]{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // or instead:

        int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        String save5 = Arrays.toString(months);
        System.out.println(save5);



        // int[][] name = new int[width][height]
        // 2 columns and 5 rows
        //Arrays.deepToString()

        // it will be: [[0, 0, 0, 0, 0], [0, 5, 0, 0, 0]]

        int[][] table = new int[2][5];
        table[1][1] = 5;

        String save6 = Arrays.deepToString(table);



        // it will be: [-10, -2, 0, 20, 55]

        int[] sortedArray = { 0, -2, -10, 20, 55};
        Arrays.sort(sortedArray);
        String viewSortedArray = Arrays.toString(sortedArray);
        System.out.println(viewSortedArray);










    }


}
