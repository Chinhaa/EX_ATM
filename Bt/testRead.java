/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bt;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author dinhv
 */
public class testRead {
    public static void main(String[] args) {
         try {
            FileInputStream fileInputStream=new FileInputStream("C:\\Users\\dinhv\\Desktop\\data.dat");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
             ArrayList<Employee> list = (ArrayList<Employee>) objectInputStream.readObject();
             fileInputStream.close();
             objectInputStream.close();
             for(Employee employee: list){{
                 System.out.println(employee);
                 
             }}
            
  
            
            
        } catch (Exception e) {
        }
    }
}
