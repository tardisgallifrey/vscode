package com.tardisgallifrey;

import java.io.*;   //Required

//This is the same as CopyFile, but 
//FileReader and FileWriter copy 2 bytes per
//read/write to match with Unicode

//the methods in CopyFile copy 1 byte per read/write

public class CopyFileChar {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("input.txt");
         out = new FileWriter("output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}