/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import domainmodel.Note;
import java.util.List;

/**
 *
 * @author 718205
 */
public class NoteService {
    
    public Note get(int noteId){
        Note note=null;
        return note;
    }
    
    public List<Note>getAll(){
        List<Note> noteList=null;
        return noteList;
    }
    
    public int update(int noteId,String contents){
        int rVal = 0;
        return rVal;
    }
    
    public int delete(int noteId){
        int rVal=0;
        return rVal;
    }
    
    public int insert(String contents){
        int rVal=0;
        return rVal;
    }
}
