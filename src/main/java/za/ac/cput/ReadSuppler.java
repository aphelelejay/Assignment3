/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author aphelele zimkhita Joka(218130260)
 */
public class ReadSuppler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         File zimmy= new File("supplierOutFile.txt");
    try{
        FileInputStream fis = new FileInputStream(zimmy);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Vector<Supply> deserializedSupplier = (Vector<Supply>) ois.readObject();
        System.out.println("=======================SUPPLIERS==================================");
        System.out.println("ID "+"     Name      "+"              Prod Type   "+   "    Discription      ");
        System.out.println("===================================================================");
            
      
        //System.out.println();
       // ois.close();
       
       
        Iterator<Supply> iter = deserializedSupplier.iterator();
        while (iter.hasNext()){
            Supply s = iter.next();
            System.out.println(s.toString());
        }
       
    }catch (FileNotFoundException ex){
        ex.printStackTrace();
    }      catch (IOException ioe) {
               ioe.printStackTrace();
           } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
           }
}
    }
    

