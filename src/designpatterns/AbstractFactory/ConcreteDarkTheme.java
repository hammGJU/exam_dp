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
public class ConcreteDarkTheme implements DarkTheme{

    @Override
    public void colorDark() {
        System.out.println("Theme color is Dark 1");
    }

    @Override
    public String writeLight() {
        return "light Text 1";
    }
    
}
