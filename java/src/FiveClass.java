package com.tardisgallifrey;

public class FiveClass{
    public static void main(String[] args){
        Five myObj = new Five();

        //x is not a method, but is still a MEMBER of the Five class
        //so, the dot notation is still legal to retrieve the value.
        System.out.println(myObj.x);
    }
}