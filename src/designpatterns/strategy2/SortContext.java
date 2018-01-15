/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.strategy2;

import java.util.List;

/**
 *
 * @author hesham
 */
public class SortContext {

    SortInterface sortI;

    public List<Integer> sortIntegers(List<Integer> mList) {
        return sortI.sort(mList);

    }

    public SortInterface getSortI() {
        return sortI;
    }

    public void setSortI(SortInterface sortI) {
        this.sortI = sortI;
    }
    

}
