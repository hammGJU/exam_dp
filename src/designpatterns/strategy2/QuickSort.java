/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.strategy2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author hesham
 */
public class QuickSort implements SortInterface {

    @Override
    public List<Integer> sort(List<Integer> integers) {
        List<Integer> mArray = new ArrayList<>();
        mArray.addAll(integers);
        Collections.sort(mArray);
        return mArray;
    }

}
