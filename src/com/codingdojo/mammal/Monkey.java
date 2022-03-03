package com.codingdojo.mammal;
import java.util.Random;

public class Monkey extends Mammal {
    public Monkey() {
        super();
    }
    public void throwSomething() {
        Random rand = new Random();
        double randomNumber = rand.nextDouble();
        double energyLevel = getLevelEnergy();
        energyLevel -= 5;
        if (randomNumber > .5) {
            System.out.println("Threw a banana");
        } else {
            System.out.println("Threw a rock");
        }
        System.out.println("Energy level is now " + energyLevel);
        setLevelEnergy(energyLevel);
    }

    //eats bananas energy level increases by 10
    public void eatBananas() {
        double energyLevel = getLevelEnergy();
        energyLevel += 10;
        System.out.println("Monkey ate a banana, YUMMY!");
        System.out.println("Energy level is now " + energyLevel);
        setLevelEnergy(energyLevel);
    }
    //trekking a tree energy level decreases by 10
    public void climbTree() {
        double energyLevel = getLevelEnergy();
        energyLevel -= 10;
        System.out.println("Monkey climbed a tree");
        System.out.println("Energy level is now " + energyLevel);
        setLevelEnergy(energyLevel);
    }
}
