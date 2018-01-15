/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns;

import designpatterns.AbstractFactory.ConcreteThemeFactory1;
import designpatterns.AbstractFactory.ConcreteThemeFactory2;
import designpatterns.AbstractFactory.DarkTheme;
import designpatterns.AbstractFactory.LightTheme;
import designpatterns.AbstractFactory.ParentThemeFactory;

/**
 *
 * @author hesham
 */
public class DesignPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        ParentShipFactory factory = new ShipFactory();
//        EnemyShip ship1 = factory.getShip("UFOenemyship");
//        EnemyShip ship2 = factory.getShip("rocketenemyship");
//
//        ship1.displayEnemyShip();
//        ship2.displayEnemyShip();
//        ship1.followHero();
//        ship1.shootHero();
//        ship2.followHero();
//        ship2.shootHero();
//        Animal dog = new Dog();
//        dog.setName("Doggy");
//        dog.setHeight(2.2);
//        Animal bird = new Bird();
//        bird.setName("tweety");
//        bird.setHeight(1.5);
//        dog.tryToFly();
//        bird.tryToFly();
//
//        List<Integer> mList = new ArrayList<>();
//        mList.add(5);
//        mList.add(22);
//        mList.add(10);
//        mList.add(1);
//        mList.add(0);
//        mList.add(2);
//        System.out.println("List before sorting: " + mList);
//        SortContext ctx = new SortContext();
//        ctx.setSortI(new QuickSort());
//        List<Integer> sorted1 = ctx.sortIntegers(mList);
//        System.out.println("List after sorting 1: " + sorted1);
//        ctx.setSortI(new BubbleSort());
//        List<Integer> sorted2= ctx.sortIntegers(mList);
//        System.out.println("List after sorting 2: " + sorted2);
        ParentThemeFactory themeFactory1 = new ConcreteThemeFactory1();
        DarkTheme darkTheme1 = themeFactory1.getDarkTheme();
        LightTheme lightTheme1 = themeFactory1.getLightTheme();
        String text = darkTheme1.writeLight();
        System.out.println(text);
        darkTheme1.colorDark();
        text= lightTheme1.writeDark();
        System.out.println(text);
        ParentThemeFactory themeFactory2= new ConcreteThemeFactory2();
        LightTheme lightTheme2= themeFactory2.getLightTheme();
        System.err.println(lightTheme2.writeDark());
        lightTheme2.colorLight();
    }

}
