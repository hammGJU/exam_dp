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
public class SingletonClass {

    private static SingletonClass instance;
    private int counter;

    private SingletonClass() {
        counter++;

    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    public void printCount() {
        System.err.println("The class has been instanciated " + counter + " times!");
    }

}
