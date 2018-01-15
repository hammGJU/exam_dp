/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.prototype;

import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hesham
 */
public class ShapeCache {

    private static Hashtable<String, Shape> cacheMap = new Hashtable<>();

    public static void loadCache() {
        Circle c = new Circle();
        c.setId("1");
        Rectangle r = new Rectangle();
        r.setId("2");
        Square s = new Square();
        s.setId("3");
        cacheMap.put(c.getId(), c);
        cacheMap.put(r.getId(), r);
        cacheMap.put(s.getId(), s);
    }

    public static Shape getShape(String id) {
        Shape cachedShape = cacheMap.get(id);
        Shape retunredShape = null;
        try {
            retunredShape = (Shape) cachedShape.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(ShapeCache.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retunredShape;

    }

}
