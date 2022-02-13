package com.tardisgallifrey;

public class ArrayStuff{
    public static void main(String[] args){

        //Single element array with length mehtod
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
        System.out.println(cars[i]);
        }

        //Loop through with forEach
        for (String i : cars) {
        System.out.println(i);
        }

        //MultiDimensional Arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7

        //Nested for loops to pring out MD array
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}