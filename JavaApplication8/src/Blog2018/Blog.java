/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blog2018;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class Blog {
    private List<Note> notes= new ArrayList();
    private String title;

    public Blog(String title) {
        this.title = title;
    }
    
    public void add(Note note)
    {
    notes.add(note);
    }

    @Override
    public String toString() {
        return "Blog{" + "notes=" + notes + ", title=" + title + '}';
    }
    public Note mostpipular()
    {
            if(notes.isEmpty()) return null;
            Note result = notes.get(0);
        for(Note note: notes){
     
            int count = note.numberofcomments();
            
            if(count> result.numberofcomments()){
            result = note;
            
            }
        
        }
       
    return result;
    }
    public List<Note> mostPopulars()
            {
            return null;
     
            }
    public Comment lastComemt()
    {
        List<Comment> allComments = new ArrayList();
        for(Note note: notes){
            allComments.addAll(note.getComments());
        }
        Comment result = allComments.get(0);
        for(Comment comment: allComments){
        LocalDate d1 = comment.getDate();
        LocalDate d2 = result.getDate();
        if(d1.isAfter(d2)){
        result=comment;
        }
        
        }
    return result;
    }
    public List<Comment> lastComments()
    {
        return null;
    }
}
