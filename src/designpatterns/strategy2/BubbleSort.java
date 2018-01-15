/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.strategy2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author hesham
 */
public class BubbleSort implements SortInterface {

    @Override
    public List<Integer> sort(List<Integer> integers) {
        List<Integer> mArray = new ArrayList<>();
        Integer n = integers.size();
        Integer[] arr = new Integer[n];
        arr =integers.toArray(arr);
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        List<Integer> temp = Arrays.asList(arr);
        mArray.addAll(temp);
        return mArray;
    }

}
