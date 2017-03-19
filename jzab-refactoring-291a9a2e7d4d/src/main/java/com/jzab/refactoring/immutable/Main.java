package com.jzab.refactoring.immutable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author zjaramil
 */
public class Main {

  public static void main(String[] args){
    List<String> chapters = new ArrayList<>();
    chapters.add("Prefacio");
    chapters.add("1");
    chapters.add("2");
    chapters.add("3");
    Date date = new Date(1864, 10, 25);
    Book book = new Book("La vuelta al mundo en 80 dias", "Julio Verne", chapters, date);

    BookExtender a = new BookExtender(book, "A");
    BookExtender b = new BookExtender(book, "B");
    BookExtender c = new BookExtender(book, "C");

    a.start();
    //b.start();
    //c.start();

    //Change book information to register as my book
    book.setAuthor("Zabdiel Jaramillo");
    book.setPublishDate(new Date());
  }

  private static class BookExtender extends Thread {

    private Book book;
    private String prefix;

    private BookExtender(Book book, String prefix){
      this.book = book;
      this.prefix = prefix;
    }

    @Override
    public void run(){
      book.getChapters().remove(0);
      for (int i = 1; i <= 5; i++){
        book.getChapters().add(prefix + i);
      }
      System.out.printf("My Book(%s):%n%s%n", prefix, book.toString());
      book.setPublishDate(new Date());
    }

  }

}
