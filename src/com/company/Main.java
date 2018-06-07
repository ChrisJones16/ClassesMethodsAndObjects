package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

     Cat myCat = new Cat("Chris","Scooby",1, 'm',"The Ville",true,20.30);

     System.out.println("The name of my cat is: " + myCat.getPetName());

     myCat.setWhiskers(true);
     System.out.println("Does this cat have whiskers? " + myCat.isWhiskers());

     System.out.println(myCat.makeSound());

     System.out.println(myCat.catYears());

     




    }

}
