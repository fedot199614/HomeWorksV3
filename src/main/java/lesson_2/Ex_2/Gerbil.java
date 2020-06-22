package lesson_2.Ex_2;

import java.security.SecureRandom;

public class Gerbil extends Rodent{
    private String name;

    public Gerbil(String id, String color, int weight, String eyesColor, String name) {
        super(id, color, weight, eyesColor);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public void eatSomething() {
        String[] havka = {"grass","corn","fruits"};
        System.out.println(getName()+" Starting eat "+havka[new SecureRandom().nextInt(havka.length)]);
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void playWithRodent() {

    }

    @Override
    public String toString() {
        return "Gerbil{" +
                "name='" + name + '\'' +
                "id='" + getId() + '\'' +
                ", color=" + getColor() +
                ", weight=" + getWeight() +
                ", eyesColor=" + getEyesColor() +
                '}';
    }
}
