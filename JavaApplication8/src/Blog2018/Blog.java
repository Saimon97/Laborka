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
}
