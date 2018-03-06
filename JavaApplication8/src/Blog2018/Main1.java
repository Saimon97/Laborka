/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blog2018;

/**
 *
 * @author Student
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Blog b= new Blog("Programowanie");
        Note n1 =new Note ("Programowanie w javie","Bez Czyżoka i sokoła");
        Note n2 =new Note ("Super","Zabawa");
        Note n3 =new Note ("java","jest poprostu dobrze");
        b.add(n1);
        b.add(n2);
        b.add(n3);
        Comment c1= new Comment("Pioter"," Jestem wzruszony");
        n2.add(c1);
        Comment c2= new Comment("Szymon","Siedze obok Piotera");
        n2.add(c2);
    }
    
}
