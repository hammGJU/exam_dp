/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.factory;

/**
 *
 * @author hesham
 */
public class ShipFactory implements ParentShipFactory {

    public ShipFactory() {
        System.out.println(ShipFactory.class.getCanonicalName());
    }

    @Override
    public EnemyShip getShip(String shipType) {
        if (shipType == null) {
            return null;
        } else if (shipType.equalsIgnoreCase("ufoenemyship")) {
            return new UFOEnemyShip();
        } else if (shipType.equalsIgnoreCase("rocketenemyship")) {
            return new RocketEnemyShip();
        }
        return null;
    }

}
