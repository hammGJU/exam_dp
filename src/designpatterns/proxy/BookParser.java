/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.proxy;

/**
 *
 * @author hesham
 */
public class BookParser implements Parser {

    private String bookName;

    public BookParser(String bookName) {
        this.bookName = bookName;
        readBigFile();
    }

    @Override
    public void readBigFile() {
        System.err.println("Reading Huge file: " + this.bookName);
    }

}
