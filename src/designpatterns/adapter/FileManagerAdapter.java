/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.adapter;

/**
 *
 * @author hesham
 */
public class FileManagerAdapter extends FileManagerUtils implements FileManager {

    private String f;

    public FileManagerAdapter(String f) {
        this.f = f;
    }
    

    @Override
    public String open(String fileName) {
        boolean s = openFile(fileName);
        if (s) {
            return "File: " + fileName + " opened successfully";
        } else {
            return "File: " + fileName + " couldn't be opened";
        }
    }

    @Override
    public String close() {
        boolean s = closeFile(f);
        if (s) {
            return "File: " + f + " closed successfully";
        } else {
            return "File: " + f + "coldn't be closed";
        }
    }

    @Override
    public String write(int pos, int amount, byte[] data) {
        boolean s = writeToFile(new String(data), pos, amount);
        return String.valueOf(s);
    }

    @Override
    public String read(int pos, int amount, byte[] data) {
        String s = readFromFile(pos, amount);
        return s;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

}
