/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Iterators;

import java.util.BitSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author hesham
 */
public class BitSetIterator implements Iterator {

    private final BitSet bitSet;
    private int index;

    public BitSetIterator(BitSet bitSet) {
        this.bitSet = bitSet;
    }

    @Override
    public boolean hasNext() {
        boolean result = index < bitSet.length();
        return result;
    }

    @Override
    public Object next() {
        if (index >= bitSet.length()) {
            throw new NoSuchElementException();
        }
        Object o = bitSet.get(index++);
        return o;
    }

}
