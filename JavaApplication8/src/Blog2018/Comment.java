/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blog2018;

import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class Comment {
    private String content;
    private String author;
    private LocalDate date;

    public Comment(String content, String author) {
        this.content = content;
        this.author = author;
        this.date=LocalDate.now();
    }
    public String getAuthor(){
    return author;
    }

    public String getContent() {
        return content;
    }
    public String toString()
    {
    return author+": "+content+" ("+date+")";
    }

    public LocalDate getDate() {
      return date; 
}
}
