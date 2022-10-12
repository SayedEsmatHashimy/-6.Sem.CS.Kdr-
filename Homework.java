/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;
 /* Exmple of immutable Data */
import java.util.Date;

/**
 *
 * @author himmat
 */
public class Homework 
{
   private final int id;
   private final String name;
   private final java.util.Date dataCreated;
    private Date dateCreated;
   public Homework(int SEH, String newName)
   {
       id=SEH;
       name = newName;
       dataCreated = new java.util.Date();
   }
    public int getId() 
    {  return id;    }
    public String getName()
    {  return name;     } 
    public java.util.Date getDateCreated()
    { 
        return dateCreated; 
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
