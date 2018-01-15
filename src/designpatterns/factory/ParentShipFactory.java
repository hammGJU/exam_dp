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
public interface ParentShipFactory {

    public EnemyShip getShip(String shipType);

}
