package com.vyatsu.lab1.TP.animal;

public class Animal{
    String name;
    int runDist;
    int swimDist;

    public Animal(){

    }
    public Animal(String name,int runDist, int swimDist){
        this.name=name;
        this.runDist=runDist;
        this.swimDist=swimDist;
    }

    public String swim(int a){
        if (a<= swimDist) return name + " проплыл " + a + " метров ";
        else return name + " не смог проплыть дистанцию " + a + " метров ";
    }
    public String run(int a){
        if (a<=runDist) return name + " пробежал " + a +" метров";
        else return name + " не смог пробежать дистанцию " + a + " метров ";
    }

    public  void Screen(){
        System.out.println("Имя: " + name  + " | Бег: " +   checkRun(runDist) + " | Плавает : "+ checkSwim(swimDist));

    }
    public String checkRun(int a ){
        if (a !=0) return "на "+a;
        else return "НЕТ";
    }
    public String checkSwim(int a ){
        if(a!=0)return " на "+a;
        else return "НЕТ";
    }
}
