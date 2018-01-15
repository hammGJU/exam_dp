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
public interface FileManager {

    public String open(String fileName);

    public String close();

    public String write(int pos, int amount, byte[] data);

    public String read(int pos, int amount, byte[] data);

}
