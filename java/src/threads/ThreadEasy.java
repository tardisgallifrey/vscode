package com.tardisgallifrey;


//Runnable is an Interface.
//We will implement the methods in Runnable

class ThreadEasy implements Runnable {
   private Thread t;
   private String threadName;
   
   //Create a thread and give it a name
   ThreadEasy( String name) {
      threadName = name;
      System.out.println("Creating " +  threadName );
   }
   
   //Create a run method (we implement this method from Runnable)
   public void run() {
      System.out.println("Running " +  threadName );
      try {
         for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            // Let the thread sleep for a while.
            Thread.sleep(50);
         }
      } catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println("Thread " +  threadName + " exiting.");
   }
   
   //Create a start method to call run()
   //We implement this Runnable method
   public void start () {
      System.out.println("Starting " +  threadName );
      if (t == null) {
          //Instantiate a new thread
         t = new Thread (this, threadName);
         //start new thread, which calls run()
         t.start ();
      }
   }
}

public class TestThread {

   public static void main(String args[]) {

       //Instantiate and start a thread
      ThreadEasy R1 = new ThreadEasy( "Thread-1");
      R1.start();
      
      //Instantiate and start a thread
      ThreadEasy R2 = new ThreadEasy( "Thread-2");
      R2.start();
   }   
}