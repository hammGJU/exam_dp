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
public class UFOEnemyShip extends EnemyShip {

    public UFOEnemyShip() {
        setName(UFOEnemyShip.class.getName());
        setAmtDamage(20.0);
    }

}
