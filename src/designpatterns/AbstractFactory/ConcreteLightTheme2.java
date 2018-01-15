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
public class ConcreteLightTheme2 implements LightTheme {

    @Override
    public void colorLight() {
        System.out.println(" Theme color light 2");
    }

    @Override
    public String writeDark() {
        return "Dark text 2";
    }

}
