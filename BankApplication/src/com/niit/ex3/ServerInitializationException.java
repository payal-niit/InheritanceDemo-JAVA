package com.niit.ex3;

public class ServerInitializationException extends RuntimeException {

     public ServerInitializationException (String s) {
         super (s);
     }

     public ServerInitializationException (Throwable t) {
         super (t);
     }

}