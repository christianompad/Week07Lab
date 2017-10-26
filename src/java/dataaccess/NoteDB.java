/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;
import domainmodel.Note;
import domainmodel.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author 718205
 */
public class NoteDB {
   
    public int insert(Note note)throws NotesDBException{
       int rVal = 0; 
       return rVal;
   }
    public int update(Note note)throws NotesDBException{
        int rVal=0;
        
        return rVal;
    }
    public List<Note>getAll() throws NotesDBException{
        List<Note> noteList = null;
        return noteList;
    }
    public Note getNote(int noteId) throws NotesDBException{
        Note note=null;
        return note;
    }
    public int delete(Note note)throws NotesDBException{
        int rVal=0;
        return rVal;
    }


}
