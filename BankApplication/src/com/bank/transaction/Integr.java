package com.bank.transaction;

interface IntegrInterface {
	  
    public int getIntegerValue();

    public int check (IntegrInterface i) throws LesserThanException, GreaterThanException; 
}

class LesserThanException extends Exception {

    // similar implementation for other const'rs
    public LesserThanException (String s) {
         super (s);
    }

}

class GreaterThanException extends Exception {

    // similar implementation for other const'rs
    public GreaterThanException (String s) {
         super (s);
    }

}

public class Integr implements IntegrInterface {

    Integer i;

    public Integr (Integer i) {
       this.i = i;
    }

    public int check (IntegrInterface j) throws LesserThanException, GreaterThanException {

       if (this.i > j.getIntegerValue())
           throw new LesserThanException (
               "The value of passed object: " + j.toString() + ", is less than: " + i.toString() + ".");
       else
       if (this.i < j.getIntegerValue())
           throw new GreaterThanException (
               "The value of passed object: " + j.toString() + ", is greater than: " + i.toString()+".");

       return i;
    }

    public String toString() {
       return (getClass().getName() + 
               ":" +
               i +
               ":" +
               System.currentTimeMillis());
    }

    public int getIntegerValue () {
       return i;
    }

    public static void main (String[] args) {

        Integr i = new Integr(1);
        Integr j = new Integr(2);
        Integr k = new Integr(4);
        Integr l = new Integr(3);

        try {
           i.check(j);
           k.check(l);
        } catch (Exception e) {
           System.out.println (e.getMessage());
        } finally {
           System.out.println ("Finished_Problem_3 !");
        }        
    }

	public int check(Object i) throws LesserThanException, GreaterThanException {
		// TODO Auto-generated method stub
		return 0;
	}    
}

