package com.niit.ex3;

public class ServerRuntimeException extends RuntimeException {

     public ServerRuntimeException (String s) {
         super (s);
     }

     public ServerRuntimeException (Throwable t) {
         super (t);
     }

}