package com.vyatsu.lab1.TP.animal;
import com.vyatsu.lab1.TP.animal.Animal;
import com.vyatsu.lab1.TP.animal.Cat;
import com.vyatsu.lab1.TP.animal.Dog;
import com.vyatsu.lab1.TP.animal.Tiger;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Cat cat[]=new Cat[1];
        Dog dog[]=new Dog[1];
        Tiger tiger[]=new Tiger[1];

        Cat cat1=new Cat("Кис-кис",100,0);
        Dog dog1=new Dog("Бебек",500,10);
        Tiger tiger1=new Tiger("Тигромет123",1000,100);

        cat1.Screen();
        dog1.Screen();
        tiger1.Screen();

        System.out.println(tiger1.run(150));
    }
}
