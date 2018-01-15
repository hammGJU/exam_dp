/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.strategy;

/**
 *
 * @author hesham
 */
public class Animal {

    private String name;
    private double height;
    private String sound;
    private Fly flyType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Fly getFlyType() {
        return flyType;
    }

    public void setFlyType(Fly flyType) {
        this.flyType = flyType;
    }

    public void tryToFly() {
        flyType.fly();
    }
}
