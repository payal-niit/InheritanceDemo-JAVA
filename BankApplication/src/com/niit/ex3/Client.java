package com.niit.ex3;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import java.util.Date;

public class Client {

    String name = null;

    PipedInputStream pis  = null;
    PipedOutputStream pos = null;

    public Client() {}

    public Client (String name) {
        this.name = name;
    }

    public void initialize () throws IOException {
        initialize (null, new PipedInputStream(), new PipedOutputStream());
    }

    public void initialize (String name) throws IOException {
        initialize (name, new PipedInputStream(), new PipedOutputStream());
    }

    public void initialize (String name, PipedInputStream pis, PipedOutputStream pos) throws IOException {
        setName (name);
        setIOStreams (pis, pos); 
        PPiper.establishConnection (this.pis, this.pos);
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public PipedInputStream getInputStream() {
        return this.pis;
    }

    public PipedOutputStream getOutputStream() {
        return this.pos;
    }

    public void terminate () {
        try {
           pos.close();
           pis.close();
           // ignore IOException
        } catch (IOException ioe) {} 
    }
  
    public void setIOStreams (PipedInputStream pis, PipedOutputStream pos) {
        this.pis = pis;
        this.pos = pos;
    }

    public static void main (String[] args) {

        Client client = new Client();

        try {
           client.initialize("MyClient");            
        } catch (IOException ioe_1) {
           System.out.println (ioe_1.getMessage() + ", terminating");
           System.exit (1);
        }

        try {
           Date date = new Date (System.currentTimeMillis());
  
           String msg_1 = client.getName()+":"+date.toString();
           byte[] byt_1 = msg_1.getBytes();

           client.getOutputStream().write (byt_1, 0, byt_1.length); 

           // wait till data is available, note that read() blocks 
           // until data is available in the stream
           int len = 0;
           while ((len = client.getInputStream().available()) == 0);

           byte[] byt_2 = new byte[len];
           client.getInputStream().read (byt_2, 0, len);

           String msg_2 = new String (byt_2);
           System.out.println("Client request: "+msg_1);
           System.out.println ("Server's response: " + msg_2);
 
        } catch (IOException ioe_2) {
           System.out.println ("Problem reading/writing to the IO stream");
           System.exit (1);
        } finally {
           //client.terminate();
        }
        
    }

}