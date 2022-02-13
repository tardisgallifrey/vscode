package com.tardisgallifrey;

// importing necessary libraries  
import java.awt.*;    
import java.awt.event.*;    

public class ButtonExample3 {  

    public static void main(String[] args) {    
        // create instance of frame with the label   
        Frame f = new Frame("Button Example"); 

        //If I remember right, final is used to end an Interface string
        final TextField tf=new TextField();    

        //Remeber, setBounds sets position and size
        tf.setBounds(50,50, 150,20);  

        // create instance of button with label  
        Button b=new Button("Click Here");    

        // set the position for the button in frame   
        b.setBounds(50,100,80,30);   

        //all of the call back function is in the parentheses
        b.addActionListener(new ActionListener() {   
            //this is the listener definition.
            //It is an action to be Performed when an 
            //Event occurs. 
            public void actionPerformed (ActionEvent e) {    
                //action is to set the text in the text box
                    tf.setText("Welcome to Javatpoint.");    
            }    
        });  

// adding button the frame  
    f.add(b);  
// adding textfield the frame  
    f.add(tf);    
// setting window size, layout and visibility   
    f.setSize(400,400);    
    f.setLayout(null);    
    f.setVisible(true);     
    }    
}  