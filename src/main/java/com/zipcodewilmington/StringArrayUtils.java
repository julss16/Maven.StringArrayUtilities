package com.zipcodewilmington;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;



/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }
    //complete!

    /**
     * @param array array of String objects
     * @return seco nd element in specified array
     */
    public static String getSecondElement(String[] array) {


        return array[1];
    }

    //complete!

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array){

        int i= array.length;

        return array[i -1];
    }

    //Complete!

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        int i= array.length;

        return array[i -2];

    }

    //complete!
    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO

    public static boolean contains(String[] array, String value) {



        return Arrays.asList(array).contains(value);
    }

    //complete!

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        //ArrayList<String> rev = new ArrayList<String>();
        String[] rev= new String[array.length];
        int x= 0;
        for (int i = array.length - 1; i >= 0; i--) {

                rev[x]= array[i] ;
                x++;

        }
        return rev;

    }

    //complete!

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {


       //if (array.length % 2 ==0) {
           for (int i=0; i < array.length/2 -1; i++){
               if (array[i] != array[array.length -i-1]){

                   return false;

           }
       }

       return true;


    }

    //complete!

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     *
     * char[] alpha = new char[26]
     * for(int i = 0; i < 26; i++){
     *     alpha[i] = (char)(97 + i)
     *
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String a = String.join(",", array).toUpperCase();

        for (Character x = 'A'; x <= 'Z'; x++){
            if (!a.contains(x.toString())){
                return false;
            }

        }

        return true;
    }






    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i=0; i < array.length; i++){

                if (value.equals(array[i])){
                    count++;
            }
        }

        return count;
    }

    //complete!

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
       //String [] newArr = new String[array.length];
        List<String> list= new ArrayList<String>(Arrays.asList(array));
        list.remove(valueToRemove);
        array= list.toArray(new String[0]);
        return array;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {


        String [] temp = new String[array.length];
        temp[0]= array[0];
        int index = 1;

        for (int i=0; i < array.length; i++){
            for (int j =0; j < array.length; j++){

                if (array[i])== (temp[j]))
            }
        }


        }





        /**String[] temp = new String[array.length];    //= new String[array.length];
        int j = 0;
        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] != array[i++]) {
                temp[j++] = array[i];
                //temp[j++] = array[array.length - 1];
            }
            for (j = 0; i < j; j++) {

                array[i] = temp[j];

            }


        } return array;

    }







    // delete repeating strings in array



    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
