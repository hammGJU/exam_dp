/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.adapter;

import java.io.RandomAccessFile;

/**
 *
 * @author hesham
 */
public class FileManagerUtils {

    private RandomAccessFile f;

    public boolean openFile(String fileName) {
        System.out.println("Opening file: " + fileName);
        boolean success = true;
        return success;
    }

    public boolean closeFile(String fileName) {
        System.out.println("Closnig file: " + fileName);
        boolean success = true;
        return success;
    }

    public boolean writeToFile(String string, long pos, long amnt) {
        System.out.print("Writing " + amnt + " chars from string: " + string);
        System.out.println(" to pos: " + pos + " in file");
        boolean success = true;
        return success;
    }

    public String readFromFile(long pos, long amnt) {
        System.out.print("Reading " + amnt + " chars from pos: " + pos + " in file");
        return new String("dynamite");
    }

}
