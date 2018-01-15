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
public class PrototypeMain {

    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("cloned shape 1: " + clonedShape1.getType());
        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("cloned shape 2: " + clonedShape2.getType());
        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("cloned shape 3: " + clonedShape3.getType());
    }

}
