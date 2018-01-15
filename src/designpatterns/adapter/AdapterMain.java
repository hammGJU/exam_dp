/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.adapter;

import java.util.Random;

/**
 *
 * @author hesham
 */
public class AdapterMain {

    public static void main(String[] args) {
        String f = "Dummy file";
        FileManager fm = new FileManagerAdapter(f);
        fm.open(f);
        byte[] data = new byte[5];
        for (int i = 0; i < data.length; i++) {
            Random r = new Random();
            data[i] = (byte) r.nextInt();
        }
        fm.write(1, 5, data);
        fm.read(1, 5, data);
        fm.close();

    }

}
