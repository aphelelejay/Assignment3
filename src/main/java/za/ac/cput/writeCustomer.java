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
public class writeCustomer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Customer A;
        Vector<Customer> az = new Vector<>();
         az.add(new Customer("C150   ", "     Luke", "    Atmyass ", "    Bellville", "27 Jan 1981", 1520.50, false));
         az.add(new Customer("C130   ", "     Stu", "     Padassol    ", "    Sea Point   ", "18 May 1987", 645.25, true));
         az.add(new Customer("C100 ", "     Mike", "    Rohsopht    ", "`Bellville  ", "24 Jan1993", 975.10, true));
         az.add(new Customer("C300  ", "     Ivana.B", " Withew  ", "    Langa   ", "16 Ju 1998", 1190.50, false));
         az.add(new Customer("C250   ", "     Eileen", "  Sideways    ", "    Nyanga", "27 Nov1999", 190.85, true));
         az.add(new Customer("C260      ", "     Ima", "      Stewpidas  ", "    Atlantis    ", "27 Jan 2001", 1890.70, true));
       
        
       
         
         //Create file And write object to file
         File s = new File("customerOutFile.txt");
        try {
            FileOutputStream fos = new FileOutputStream(s);
            ObjectOutputStream obj = new ObjectOutputStream(fos);
            obj.writeObject(az);
            obj.close();
            System.out.println("The data is written succesfully");
            
        } catch (FileNotFoundException fe) {
        fe.printStackTrace();
        } catch (IOException fe) {
          fe.printStackTrace();
        }
        
        

        
    }
     

    }
    

