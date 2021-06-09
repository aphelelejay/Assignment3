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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author aphel
 */
public class ReadCusstomer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         File zimmy = new File("customerOutFile.txt");
    try{
        FileInputStream fis = new FileInputStream(zimmy);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Customer> Customer = (ArrayList<Customer>) ois.readObject();
        System.out.println("====================================CUSTOMERS=============================================================");
        System.out.println("ID      "+"        Name       "+"     Surname       "+ "  Address       " + "  Date of birth "+"  Credit     "+"     Rent");
        System.out.println("==========================================================================================================");
            
      
       // System.out.println(deserializedCustomer);
        //ois.close();
        
        Iterator<Customer> iter = Customer.iterator();
        while (iter.hasNext()){
            Customer c = iter.next();
            System.out.println(c.toString());
        }
           
        
    }catch (FileNotFoundException ex){
        ex.printStackTrace();
    }      catch (IOException ex) {
               ex.printStackTrace();
           } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
           }
    }
    public void sortCustomer()
    {
        Customer customer;
        int size = ArrayListcustumer.size();
        Customer[] customer = new Customer[size];

        //Copy all the elements of the arraylist to the customer array
        for (int i = 0; i < Customer.length; i++) 
        {
            Customer[i] = ArrayList.get(i);
        }

        for (int i = 0; i < customer.length - 1; i++)
        {
            for (int j = i + 1; j < customer.length; j++)
            {
                //Check if the customer ID is greater than the 2nd one on the arrayList
                if (customer[i].getStHolderId().
                    compareTo(customer[j].getStHolderId()) > 0)
                {
                    //Swap Customer Positions

                    //Store the big one in a temp variable
                    Customer = customer[i];
                    //Replace the big one with the small one
                    Customer[i] = customer[j];
                    //Replace the small one with the big
                    Customer[j] = customer;
                }
            }
        }
        //Clear the arrayList
        customerArrayList.clear();
        //Add the Sorted customers from the other array customer to the Cleared ArrayList
        customerArrayList.addAll(Arrays.asList(customerSortingArray));
    }
    }
    

