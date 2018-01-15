/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.singleton;

/**
 *
 * @author hesham
 */
public class SingletonMain {

    public static void main(String[] args) {
        SingletonClass s = SingletonClass.getInstance();
        SingletonClass s2 = SingletonClass.getInstance();
        s.printCount();
        s2.printCount();
    }

}
