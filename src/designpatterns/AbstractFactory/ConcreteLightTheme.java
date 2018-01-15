/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.AbstractFactory;

/**
 *
 * @author hesham
 */
public class ConcreteLightTheme implements LightTheme {

    @Override
    public void colorLight() {
        System.out.println("Theme color is light 1");
    }

    @Override
    public String writeDark() {
        return "Dark Text 2";
    }

}
