package com.tardisgallifrey;

public class CharClass{

    public static void main(){
        //Character objects follow the same rules as 
        //Number objects

        //char primitive
        char value = 'a';

        //Char object
        Character newValue = 'b';


        System.out.println(isLetter(newValue));
            //Determines whether the specified char value is a letter.

        System.out.println(isDigit(newValue));
            //Determines whether the specified char value is a digit.

        System.out.println(isWhitespace(newValue));
            //Determines whether the specified char value is white space.

        //newValue.isUpperCase()
            //Determines whether the specified char value is uppercase.

        //newValue.isLowerCase()
            //Determines whether the specified char value is lowercase.

        //newValue.toUpperCase()
            //Returns the uppercase form of the specified char value.

        //newValue.toLowerCase()
            //Returns the lowercase form of the specified char value.

        //newValue.toString()

    }
}