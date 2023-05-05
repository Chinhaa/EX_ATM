/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bt;

import java.util.Scanner;
import static Bt.Manager.*;
/**
 *
 * @author dinhv
 */
public class Main {
        static Scanner scanner=new Scanner(System.in);
   
        public static void main(String[] args) {
        data();
        int choice=0;
        do {
            System.out.println("1.Input info");
            System.out.println("2.Display Employee infor");
            System.out.println("3.ID Search");
            System.out.println("4.Sort by name");
            System.out.println("5.Exit");
            System.out.println("Input choice");
            choice=scanner.nextInt();
            switch(choice){
                case 1:
                    inputInfor();
                    break;
                case 2:
                    displayInfor();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    sortbyname();
                    break;
                case 5:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Try again");
            }
        }while(choice!=5);
    }
}
        
    

