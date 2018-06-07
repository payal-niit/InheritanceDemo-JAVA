package com.niit.piperdemo;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Pipe {
	
	 public static void main(String args[])
			  { 
			   try
			   { 
	
			     PipedOutputStream pout1 = new PipedOutputStream();
			     PipedInputStream pin1 = new PipedInputStream();
			
			     PipedOutputStream pout2 = new PipedOutputStream();
		     PipedInputStream pin2 = new PipedInputStream();
			
		    pout1.connect(pin1);
		     pin2.connect(pout2);
			     
			
		     Client client = new Client(pout1);
			     Server server = new Server(pin1, pout2);
			     
			
			     /* start threads */
			
			     client.start();
			     server.start();
			     
			   }
			   catch (IOException e){}
			  }
			}

