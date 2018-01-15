/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Iterators;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author hesham
 */
public class IteratorMain {

    public static void main(String[] args) {
        BitSet mBitSet = new BitSet();
        mBitSet.set(1);
        mBitSet.set(3);
        mBitSet.set(19);
        mBitSet.set(20);
        mBitSet.set(21);

        Iterator iterator = new BitSetIterator(mBitSet);
        while (iterator.hasNext()) {
            boolean b = (boolean) iterator.next();
            String s = (Boolean.valueOf(b) ? "T" : "F");
            System.err.print(s);
        }
        System.out.println();
        List arr= new ArrayList();
        arr.add("test");
        arr.add(5.4);
        arr.add(-22.5);
        arr.add(220);
        arr.add(true);
        Iterator itr= arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
