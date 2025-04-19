/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author levysousa
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Cat c = new Cat();
        c.setName("Mimi");
        c.setFurColor("black");
        c.makeSound();
        
        Dog d = new Dog();
        d.setName("Beethoven");
        d.setRace("stiff foot");
        d.makeSound();
        
    }
}
