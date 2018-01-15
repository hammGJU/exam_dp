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
public class BookProxy implements Parser {

    private String book;
    private BookParser p;

    public BookProxy(String book) {
        this.book = book;
    }

    @Override
    public void readBigFile() {
        if (p == null) {
            p = new BookParser(book);
        }
        p.readBigFile();
    }

}
