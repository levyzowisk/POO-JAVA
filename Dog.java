/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author levysousa
 */
public final class Dog extends Animal{
    private String race;
    
    public String getRace() {
        return this.race;
    }
    
    public void setRace(String race) {
        this.race = race;
    }
    
    @Override
    public void makeSound() {
        System.out.println("The " + this.getName() + " of race " + this.race + " is barking");
    }
}
