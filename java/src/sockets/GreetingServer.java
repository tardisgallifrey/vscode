package com.tardisgallifrey;

// File Name GreetingServer.java
import java.net.*;
import java.io.*;

//Our main class is a thread
//We build a socket inside of it
public class GreetingServer extends Thread {
   private ServerSocket serverSocket;
   
   public GreetingServer(int port) throws IOException {

      //Here, we instantiate a new socket and assign a port
      serverSocket = new ServerSocket(port);

      //Used to ensure server shuts down
      serverSocket.setSoTimeout(100000);
   }

   //This is a built in method for thread, not socket
   public void run() {
      //Create endless loop
      while(true) {
         try {
            System.out.println("Waiting for client on port " + 
               serverSocket.getLocalPort() + "...");
            Socket server = serverSocket.accept();
            
            System.out.println("Just connected to " + server.getRemoteSocketAddress());

            //Instantiate a new Data Input Stream, not from socket
            DataInputStream in = new DataInputStream(server.getInputStream());
            
            //Readt the input stream with the readUTF method and print it
            System.out.println(in.readUTF());

            //Instantiate a new Data Ouptut Stream to write back to the client
            DataOutputStream out = new DataOutputStream(server.getOutputStream());

            //Send out the message
            out.writeUTF("Thank you for connecting to " + server.getLocalSocketAddress()
               + "\nGoodbye!");

            //Close socket   
            server.close();
            
         } catch (SocketTimeoutException s) {

            //Catch time out error when done
            System.out.println("Socket timed out!");
            break;
         } catch (IOException e) {

            //Catch I/O error and print usual error trace
            e.printStackTrace();
            break;
         }
      }
   }
   
   public static void main(String [] args) {

      //Get the port from command line, parse into int
      int port = Integer.parseInt(args[0]);

      //Try to start() the thread after instantiation of a 
      //new GreetingServer thread
      try {
         Thread t = new GreetingServer(port);
         t.start();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}