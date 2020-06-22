package lesson_2.Ex_2;

import java.security.SecureRandom;

public class Mouse extends Rodent{
    private String name;

    public Mouse(String id, String color, int weight, String eyesColor, String name) {
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
        String[] havka = {"cheese","bread crumbs"};
        System.out.println(getName()+" Starting eat "+havka[new SecureRandom().nextInt(havka.length)]);
    }

    @Override
    public void run() {
        System.out.println(getName()+" Start to searching food  in labyrinth...");
    }

    @Override
    public void stop() {
        System.out.println(getName()+" is found food. "+getName()+" is very happy!!!");
    }

    @Override
    public void playWithRodent() {
        boolean isHungry = isHungry();
        boolean isTried = isTired();

        if(isHungry){
            run();
            do{
                System.out.println(getName()+" Still searching the food...");
                isHungry = isHungry();
            }while (isHungry);
            stop();
        }else if(isTried){
            System.out.println(getName()+" did not want run in labyrinth because he is very tired =( ");
        }else{
            System.out.println(getName()+" did not want run in labyrinth because he is not hungry =( ");
        }

    }

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                "id='" + getId() + '\'' +
                ", color=" + getColor() +
                ", weight=" + getWeight() +
                ", eyesColor=" + getEyesColor() +
                '}';
    }

}
