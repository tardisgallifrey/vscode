package com.tardisgallifrey;

import java.io.*;   //required for file access

public class CopyFile {

//The throws is added to identify what our try/finally will throw
   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;

      try {

          //Establish two file stream handles
          //Their constructors ask for a file name/path
         in = new FileInputStream("input.txt");
         out = new FileOutputStream("output.txt");
         
         int c;

         //Read a character from file "in" and 
         //write character to file "out"
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {

          //If either file can't be opened,
          //throw an exception
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}