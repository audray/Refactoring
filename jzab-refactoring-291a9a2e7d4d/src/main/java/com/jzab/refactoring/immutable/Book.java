package com.jzab.refactoring.immutable;

import java.util.Date;
import java.util.List;

/**
 *
 * @author zjaramil
 */
public class Book {

  private String title;
  private String author;
  private List<String> chapters;
  private Date publishDate;

  public Book(String title, String author, List<String> chapters, Date publishDate){
    this.title = title;
    this.author = author;
    this.chapters = chapters;
    this.publishDate = publishDate;
  }

  public String getTitle(){
    return title;
  }

  public void setTitle(String title){
    this.title = title;
  }

  public String getAuthor(){
    return author;
  }

  public void setAuthor(String author){
    this.author = author;
  }

  public List<String> getChapters(){
    return chapters;
  }

  public void setChapters(List<String> chapters){
    this.chapters = chapters;
  }

  public Date getPublishDate(){
    return publishDate;
  }

  public void setPublishDate(Date publishDate){
    this.publishDate = publishDate;
  }

  @Override
  public String toString(){
    String chaptersStr = "";
    for (String chapter : chapters){
      chaptersStr += chapter + ", ";
    }
    String dateStr = publishDate.toString();
    return String.format("Book[Title='%s', Author='%s', Chapters='%s', Published='%s']", title, author,
                         chaptersStr, dateStr);
  }

}
