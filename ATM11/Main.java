/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATM;

import static ATM.User.*;
import java.util.Scanner;

/**
 *
 * @author dinhv
 */
public class Main {  
    public static void main(String[] args) {
        User user=login();
        if(user == null){
            System.out.println("Incorrect account or password");
        }else{
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("===================================================");
            System.out.println("1.Withdraw");
            System.out.println("2.Balance check");
            System.out.println("3.Exit");
            System.out.println("Select function: ");
            int choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    withdraw(user);
                    break;
                case 2:
                    checkBalance(user);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid function");
            }
        }
        }
        
       
    }
           
}
