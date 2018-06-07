package com.bank.transaction;

public class Container {

    int length;
    int height;
    int breadth;

    public Container () {
        this.length = 0;
        this.height = 0;
        this.breadth = 0;
    }

    public Container (int l, int b, int h) {
        this.length = l;
        this.height = h;
        this.breadth = b;
    }

    public int getVolume () {
        return (this.length*this.height*this.breadth);
    }

    public void setLength (int length) {
        this.length = length;
    }

    public void setHeight (int height) {
        this.height = height;
    }

    public void setBreadth (int breadth) {
        this.breadth = breadth;
    }

    public int getLength () {
        return this.length;
    }

    public int getHeight () {
        return this.height;
    }

    public int getBreadth() {
        return this.breadth;
    }

    public boolean ifContainerFits (Container container) throws OneOfTheDimesionsTooBigException {

        boolean value = false;

        if (getVolume() > container.getVolume())
            if (length < container.getLength() ||
                breadth < container.getBreadth() ||
                height < container.getHeight())
                throw new OneOfTheDimesionsTooBigException();
            else
                value = true;

        return value;
    }
}

class OneOfTheDimesionsTooBigException extends Exception {}
