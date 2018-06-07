package com.niit.ex3;

import java.io.DataInputStream;
import java.io.FileInputStream;

import java.util.StringTokenizer;

public class FDaemon {

   // counter
   private static int request_id = 1;

   public static void main (String[] args) {

       try {
          while (true) {
        	  System.out.println("Print");
             synchronized (FServer.log) {
                 FServer.log.wait();
                 System.out.println("Print");
                 FileInputStream fis = new FileInputStream (FServer.log);
                 int len = fis.available();

                 byte[] byt = new byte[len];
                 String reqs = new String (byt);

                 StringTokenizer tokenizer = new StringTokenizer (reqs, "\n");
                 String req_n = null;

                 // get the last request logged 
                 while (tokenizer.hasMoreTokens())
                     req_n = tokenizer.nextToken();

                 String message = "FDaemon:" + request_id + req_n;

                 System.out.println (message);
             }
          }
       } catch (Exception e) {
          throw new ServerRuntimeException (e);
       }
   }         
}