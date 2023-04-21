/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATM;

import java.util.Scanner;

/**
 *
 * @author dinhv
 */

public class User {
    private String username;
    private String password;
    int balance;

    public User(String username, String password, int balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    
    }
 static User[] users = {
            new User("admin", "123", 100000),
            new User("admin1", "1234", 200000),
            new User("admin2", "12345", 500000)
    };
    public static User login(){
            
        Scanner scanner=new Scanner(System.in);
        System.out.println("=====LOGIN=====");
        System.out.println("Enter your id:");
        String username=scanner.nextLine();
        System.out.println("Enter your password:");
        String password=scanner.nextLine();
        for(User user: users){
            if(user.username.equals(username)&&user.password.equals(password)){
                System.out.println("Well come "+user.username);
            return user;
            }  
        }
        return null;       
    }
    public static void checkBalance(User user){
        System.out.println("Account Blance:"+user.balance);
    }
    public static void withdraw(User user){
    Scanner scanner=new Scanner(System.in);
        System.out.println("WITHDRAW");
        System.out.println("Amount to withdraw:");
        int amount=scanner.nextInt();
        if(amount>user.balance){
            System.out.println("Not enough money");
        }else{
        user.balance-=amount;
            System.out.println("Successful ");
        }
        
        
    
    }
}
