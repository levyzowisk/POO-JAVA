/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author levysousa
 */
public final class Cat extends Animal{
    private String furColor;
    
    public String getFurColor() {
        return this.furColor;
    }
    
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println("The " + this.getName() + " of furcolor " + this.furColor + " is meowing");
    }
    
    
}