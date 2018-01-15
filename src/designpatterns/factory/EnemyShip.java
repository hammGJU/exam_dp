/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.factory;

/**
 *
 * @author hesham
 */
public abstract class EnemyShip {

    private String name;
    private double amtDamage;

    public void displayEnemyShip() {
        System.out.println(getName() + " is on the screen");
    }

    public void followHero() {
        System.out.println(getName() + " is following Hero Ship");
    }

    public void shootHero() {
        System.out.println(getName() + " is attacking Hero with " + getAmtDamage() + " severity");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmtDamage() {
        return amtDamage;
    }

    public void setAmtDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }

}
