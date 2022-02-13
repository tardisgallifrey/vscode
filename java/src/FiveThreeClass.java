package com.tardisgallifrey;


public class FiveThreeClass{
    public static void main(String[] args){
        FiveThree aNewObj = new FiveThree();

        //Initialize an attribute
        aNewObj.y = 3;

        //change an already initialized variable
        aNewObj.x = 10;

        //Use the attributes
        System.out.println(aNewObj.x + aNewObj.y);
    }
}