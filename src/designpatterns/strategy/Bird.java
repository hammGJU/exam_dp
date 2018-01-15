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
public class Bird extends Animal {

    public Bird() {
        super();
        setSound("Tweet");
        setFlyType(new CanFly());
    }

}
