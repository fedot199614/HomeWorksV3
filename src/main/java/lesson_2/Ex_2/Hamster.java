package lesson_2.Ex_2;

import java.awt.*;
import java.security.SecureRandom;

public class Hamster extends Rodent{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Hamster(String id,String name, String color, int weight, String eyesColor) {
        super(id, color, weight, eyesColor);
        this.name = name;
    }

    @Override
    public void playWithRodent(){
        boolean hungry;
        boolean isTired;
        int loopCounter = 1;
        run();
        do{
            System.out.println("Loop "+loopCounter+" I am still running...");
            hungry = isHungry();
            isTired = isTired();
            loopCounter++;
        }while (!hungry || !isTired);
        stop();

        if(hungry || isTired){
            System.out.println(getName()+" is very hungry and very tired");
            eatSomething();
        }
    }

    @Override
    public void eatSomething() {
         String[] havka = {"peas","sunflower seeds","oats"};
         System.out.println(getName()+" Starting eat "+havka[new SecureRandom().nextInt(havka.length)]);
    }

    @Override
    public void run() {
        System.out.println(getName()+" Starting to run in the wheel...");
    }

    @Override
    public void stop() {
        System.out.println(getName()+" Hamster Finish running in the wheel...");
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "name='" + name + '\'' +
                "id='" + getId() + '\'' +
                ", color=" + getColor() +
                ", weight=" + getWeight() +
                ", eyesColor=" + getEyesColor() +
                '}';
    }
}
