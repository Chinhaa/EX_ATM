/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author dinhv
 */
public class Manager{
     public static Scanner scanner=new Scanner(System.in);
     public static ArrayList<Employee> listEmployee = new ArrayList<>(20);
     public static void data(){
     listEmployee.add(new Employee(1,"Nguyen Van A",20,20000.0));
     listEmployee.add(new Employee(2,"Nguyen Thi B",30,40000.0));
     listEmployee.add(new Employee(3,"Dinh Van C",18,10000.0));
     listEmployee.add(new Employee(4,"Dinh Thi D",25,25000.0));
     listEmployee.add(new Employee(5,"Tran Binh A",29,20000.0));
     
}
     public static void inputInfor(){
        
         int id;
         String name;
         int age;
         double salary;        
         while(true){
             boolean check=true;
             System.out.println("Input id to 1-20");
             id=scanner.nextInt();scanner.nextLine();
        if(id>0 && id <=20){                                          
            for (Employee employee : listEmployee){
                     if(employee.getId()==id){
                         check=false;
                         break;                         
                     }                         
         }
            if(!check){
                System.out.println("id already exist");   
            }else{
                break;
            }
        }else{
                 System.out.println("id not correct");
             }
         }
         while(true){
             System.out.println("Input Name");
             name=scanner.nextLine().trim();
             if(name.length()>0){
                 break;
             }else{
                 System.out.println("cannot be left blank");}
            
             }
         while(true){
             System.out.println("Input age");
             age=scanner.nextInt();
             if(age>18&&age<65){break;}else{System.out.println("Age not correct");}
         }
            while(true){
         System.out.println("Input salary");
             salary=scanner.nextDouble();
             if(salary>0){break;}else{System.out.println("Salary not correct");}
            }
         Employee employee=new Employee(id,name,age,salary);   
         listEmployee.add(employee);
         System.out.println("Add : "+name);
     }
     public static void displayInfor(){
         System.out.println("Employee list");
         for(Employee employee: listEmployee){
             System.out.println(employee.toString());
         }
     }
     public static void search(){
         System.out.println("Input search by id :");
         int search=scanner.nextInt();scanner.nextLine();
         boolean check=true;
         for(Employee employee: listEmployee){
         if(employee.getId()==search){
             System.out.println(employee.toString());
             check =false;
             break;
         }
         }
         if(check){
             System.out.println("Id does not exist");
         }
                 
     }
     public static void sortbyname(){
//         Collections.sort(listEmployee,new Comparator<Employee>(){
//             @Override
//             public int compare(Employee o1, Employee o2) {
//                return o1.getName().compareTo(o2.getName());
//             }
//         });
//         System.out.println("Employee sort list ");
//         for (Employee employee : listEmployee) {
//             System.out.println(employee.toString());
//             
//         }
           Collections.sort(listEmployee);
           for (Employee employee : listEmployee) {
             System.out.println(employee.toString());
               }
            } 
         
     
}
