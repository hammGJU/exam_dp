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
public class ConcreteThemeFactory2 implements ParentThemeFactory {

    @Override
    public DarkTheme getDarkTheme() {
        DarkTheme th2 = new ConcreteDarkTheme2();
        return th2;
    }

    @Override
    public LightTheme getLightTheme() {
        LightTheme th2 = new ConcreteLightTheme2();
        return th2;
    }

}
