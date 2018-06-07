package com.niit.piperdemo;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class Client extends Thread {
	
	private DataOutputStream out;
		
	public Client(PipedOutputStream pos) {
		out= new DataOutputStream(pos);
	}
	
	public void run() {
		System.out.println("message sent");		
	}
	

}
