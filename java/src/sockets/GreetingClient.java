package com.tardisgallifrey;

// File Name GreetingClient.java
import java.net.*; //required
import java.io.*;  //required

//A java socket client
//Server is on R-PI


//The Client isn't a thread, just a regular class
public class GreetingClient {

   public static void main(String [] args) {

      //get serverName from command line
      //It can be localhost or an IP address
      String serverName = args[0];
      int port = Integer.parseInt(args[1]);

      //Run a try catch loop
      try {
         System.out.println("Connecting to " + serverName + " on port " + port);

         //Instantiate a new socket variable with our data
         Socket client = new Socket(serverName, port);
         

         //write a CONNECT message that we get from the remote socket
         System.out.println("Just connected to " + client.getRemoteSocketAddress());

         //Open an OutputStream variable and stuff our output to the remote server in it
         OutputStream outToServer = client.getOutputStream();

         //Instantiate a new DataOutputStream and construct with our
         //output data
         DataOutputStream out = new DataOutputStream(outToServer);
         
         //Write our output message to remote server
         out.writeUTF("Hello from " + client.getLocalSocketAddress());

         //create new input stream and get what the client sends back
         InputStream inFromServer = client.getInputStream();

         //Open a new DataInputStream and construct with Input Stream
         DataInputStream in = new DataInputStream(inFromServer);
         
         //Print out what the server says
         System.out.println("Server says " + in.readUTF());

         //Close connection
         client.close();

      } catch (IOException e) {
         //handle error
         e.printStackTrace();
      }
   }
}