/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.prototype;

/**
 *
 * @author hesham
 */
public class Circle extends Shape {

    public Circle() {
        setType("Cirlce");
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }

}
