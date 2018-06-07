package com.niit.piperdemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class Server extends Thread{
	private DataInputStream in;
	private DataOutputStream out;
	
	public Server (InputStream is, OutputStream os) {
		in= new DataInputStream(is);
		out=new DataOutputStream(os);
	}
	
	public void run() {
		int a=1;
		System.out.println("message received");
		try {
			out.writeInt(a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
