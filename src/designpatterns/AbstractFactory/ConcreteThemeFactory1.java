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
public class ConcreteThemeFactory1 implements ParentThemeFactory {

    @Override
    public DarkTheme getDarkTheme() {
        DarkTheme th1 = new ConcreteDarkTheme();
        return th1;
    }

    @Override
    public LightTheme getLightTheme() {
        LightTheme th1 = new ConcreteLightTheme();
        return th1;
    }

}
