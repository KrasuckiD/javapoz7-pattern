package com.sda.factory.dog;

public class DogFactory {
    public Dog create (String size){
        if ("small".equals(size)){
            return new Beagle();
        } else if ("big".equals(size)){
            return new Mastif();
        } else {
            return null;
        }
    }
}
