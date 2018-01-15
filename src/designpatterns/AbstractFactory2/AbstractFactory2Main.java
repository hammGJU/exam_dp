/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.AbstractFactory2;

import java.util.Scanner;

/**
 *
 * @author hesham
 */
public class AbstractFactory2Main {

    public static void main(String[] args) {
        AbstractGUIFactory guiFactory = new AbstractGUIFactory();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter OS type: ");
        String os = s.nextLine();
        GUIFactory factory1 = guiFactory.getGUIFactory(os);
        Button b = factory1.makeButton();
        b.makeButton();
        Window w = factory1.makeWindow();
        w.makeWindow();

    }

}
