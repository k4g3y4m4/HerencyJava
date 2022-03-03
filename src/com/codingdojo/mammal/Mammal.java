package com.codingdojo.mammal;

public class Mammal {
    private double levelEnergy;
    //constructor
    public Mammal() {
        this.levelEnergy = 100.0;
    }
    //getter and setter
    public double getLevelEnergy() {
        return levelEnergy;
    }
    public void setLevelEnergy(double levelEnergy) {
        this.levelEnergy = levelEnergy;
    }

    //methods
    public double showEnergy() {
        System.out.println("Energy level is: " + levelEnergy);
        return levelEnergy;
    }
}
