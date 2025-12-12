package com.profo.kennel;

public class Kennel {

    public static void main(String[] args) {
        //Complete the Dog class before finishing these tasks.
        
        //Create three dog objects.
        //You can give them and name, owner, and address that you would like.
        //For weight, start with one dog that weight 28, one that weights 35, and one that weights 49.
        
        Dog d1 = new Dog("Lucky", 28, "Jason", "78 Dulle Street");
        
        Dog d2 = new Dog("Chump", 35, "Bob", "182 Sixer Road");
        
        Dog d3 = new Dog("Billy", 49, "Steven", "19 Old Roade Road");
        
        //After creating the three dogs, have each dog speak and output the resulting strings here.
        
        d1.speak();
        d2.speak();
        d3.speak();
        System.out.println("");
        
        //Then, have the first dog poop an amount of 5,
        
        d1.poop(5);
        //and have the third dog eat an amount of 10.
        
        d3.eat(10);
        //Finally, have each dog speak again.
        
        d1.speak();
        d2.speak();
        d3.speak();
        
    }
}
