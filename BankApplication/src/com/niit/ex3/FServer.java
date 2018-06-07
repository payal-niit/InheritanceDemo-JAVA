package com.niit.ex3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import java.util.Date;
import java.util.StringTokenizer;

public class FServer {
    
    private static int thread_count = 1;

    // resource to log requests and from which FDaemon reads
    public static final File log = new File ("D:\\Payal\\Payal D\\Training TTT - 1st June\\doc\\logfile.txt");

    // no public const'r access 
    private FServer() {}

    private FServer getInstance() {
        return new FServer();
    }

    public static void initialize (PipedInputStream pis, PipedOutputStream pos) throws ServerInitializationException {
        
        FServerThread thread_i = new FServerThread ("ThreadID_" + thread_count);
        thread_i.initialize (pis, pos);
        
        thread_count++;            
    }        

    private static class FServerThread extends Thread {
 
        PipedInputStream pis = null;

        PipedOutputStream pos = null;

        public FServerThread (String id) {
            super (id);
        }

        public void initialize (PipedInputStream pis, PipedOutputStream pos) throws ServerInitializationException {
            try {
               setIOStreams (pis, pos);
               start();
            } catch (Exception e) {
               throw new ServerInitializationException (e);
            } 
        }

        public void run() {

            try {
               int len = 0;

               // block until the input is available
               while ((len = pis.available())==0);

               byte[] byt_1 = new byte[len];
               String req_1 = new String (byt_1);

               StringTokenizer tokenizer = new StringTokenizer (req_1, ":");                                                 
               String clientId = tokenizer.nextToken();

               Date time = new Date (System.currentTimeMillis());

               String res_1 = "Hello " + clientId + " ! " + time.toString();
               byte[] byt_2 = res_1.getBytes();

               pos.write (byt_2, 0, byt_2.length);

               //closeConnection();

               synchronized (log) {
                   FileOutputStream fos = new FileOutputStream(log);

                   String req = new String (byt_1) + "\n";
                   byte[] byt = req.getBytes();

                   fos.write (byt, 0, byt.length);
                   fos.close();

                   log.notify();
               }

            } catch (Exception e) {
               throw new ServerRuntimeException (e);
            }            
        }

        private void closeConnection () {
            try {
               pis.close();
               pos.close();
               // ignore IOException
            } catch (IOException ioe) {}
        }
  
        private void setIOStreams (PipedInputStream pis, PipedOutputStream pos) {
            this.pis = pis;
            this.pos = pos;
        }             
    }
}
