package lesson_2.Ex_2;

import java.awt.*;
import java.security.SecureRandom;

public abstract class Rodent {
    private String id;
    private String color;
    private int weight;
    private String eyesColor;


    public Rodent(String id, String color, int weight, String eyesColor) {
        this.id = id;
        this.color = color;
        this.weight = weight;
        this.eyesColor = eyesColor;
    }

    public boolean isHungry(){
        return new SecureRandom().nextBoolean();
    }
    public boolean isTired(){
        return new SecureRandom().nextBoolean();
    }

    public abstract void eatSomething();
    public abstract void run();
    public abstract void stop();
    public abstract void playWithRodent();


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    @Override
    public String toString() {
        return "Rodent{" +
                "id='" + id + '\'' +
                ", color=" + color +
                ", weight=" + weight +
                ", eyesColor=" + eyesColor +
                '}';
    }
}
