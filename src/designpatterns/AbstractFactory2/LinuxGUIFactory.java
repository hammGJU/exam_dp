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
public class LinuxGUIFactory implements GUIFactory {

    @Override
    public Window makeWindow() {
        return new LinuxWindow();
    }

    @Override
    public Button makeButton() {
        return new LinuxButton();
    }

}
