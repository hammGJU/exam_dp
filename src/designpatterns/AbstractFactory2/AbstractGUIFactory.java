/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.AbstractFactory2;

/**
 *
 * @author hesham
 */
public class AbstractGUIFactory {

    public GUIFactory getGUIFactory(String os) {
        if (os == null) {
            return null;
        } else if (os.equalsIgnoreCase("linux")) {
            return new LinuxGUIFactory();
        } else if (os.equalsIgnoreCase("mac")) {
            return new MacGUIFactory();
        }
        return null;

    }

}
