package com.tardisgallifrey;

public class CharClass{

    public static void main(String[] args){
        //Character objects follow the same rules as 
        //Number objects

        //char primitive
        char value = 'a';

        System.out.println(Character.isLetter(value));
            //Determines whether the specified char value is a letter.

        System.out.println(Character.isDigit(value));
            //Determines whether the specified char value is a digit.

        System.out.println(Character.isWhitespace(value));
            //Determines whether the specified char value is white space.

        System.out.println(Character.isUpperCase(value));
            //Determines whether the specified char value is uppercase.

        System.out.println(Character.isLowerCase(value));
            //Determines whether the specified char value is lowercase.

        System.out.println(Character.toUpperCase(value));
            //Returns the uppercase form of the specified char value.

        System.out.println(Character.toLowerCase(value));
            //Returns the lowercase form of the specified char value.

        System.out.println(Character.toString(value));
	   //converts to String

    }
}
