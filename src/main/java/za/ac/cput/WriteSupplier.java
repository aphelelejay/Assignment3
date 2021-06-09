/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Vector;

/**
 *
 * @author aphel
 */
public class WriteSupplier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Supplier s;
        Vector<Supplier> az1 = new Vector<>();
        az1.add(new Supplier("S270", "Grand Theft Auto", "Toyota", "Mid-size sedan"));
         az1.add(new Supplier("S400", "Prime Motors", "Lexus", "Luxury sedan"));
         az1.add(new Supplier("S300", "We got Cars", "Toyota", "10-seater minibus"));
         az1.add(new Supplier("S350", "Auto Delight", "BMW", "Luxury SUV"));
         az1.add(new Supplier("S290", "MotorMania", "Hyundai", "compact budget"));
         
         
                    File s = new File("customerOutFile.txt");
        try {
            FileOutputStream fos = new FileOutputStream(s);
            ObjectOutputStream obj = new ObjectOutputStream(fos);
            obj.writeObject(az1);
            obj.close();
            System.out.println("Data write successfully");
            
        } catch (FileNotFoundException fe) {
        fe.printStackTrace();
        } catch (IOException fe) {
          fe.printStackTrace();
        }
    
    }
    
}
