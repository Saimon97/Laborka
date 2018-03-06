/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blog2018;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class Note {
    private String title, content;
    private List<Comment> comments= new ArrayList();
    
    public Note(String title, String content){
    this.title=title;
    this.content=content;
    }
    public void add(Comment comment)
    {
    comments.add(comment);
    
    }
    public String toString()
    {
    StringBuilder sb= new StringBuilder();
    sb.append("Wpis");
    sb.append("Tytuł: "+title);
    sb.append("Tresc: "+content );
    sb.append("komentarze: "+comments);
    sb.append("\n");
    return sb.toString();
    
    }
    
    
}
