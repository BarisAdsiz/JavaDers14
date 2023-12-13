/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ders_14;

import java.util.Scanner;

/**
 *
 * @author Barış Adsız
 */
public class Ders_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the username: ");
        String username = input.nextLine();
        
        System.out.print("Enter the password: ");
        String password = input.nextLine();
        
        if(username.equals("Admin") && password.equals("1234"))
            System.out.println("Entry Successfull");
        else
            System.out.println("Wrong!");
    }
    
}
