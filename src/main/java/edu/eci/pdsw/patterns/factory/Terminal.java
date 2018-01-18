/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.patterns.factory;

import java.util.Scanner;

/**
 *
 * @author hcadavid
 */
public class Terminal {

    public static void main(String a[]) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        WelcomeTip wt=WelcomeTipFactory.getFactoryInstance().createWelcomeTip();
        
        System.out.println(wt.getWelcomeMessage());
        
        while (!exit) {
            System.out.print("$ ");
            System.out.flush();
            String command = scanner.next();

            switch (command) {
                case "exit":
                    exit=true;
                    break;
                case "help":
                    System.out.println("Commands: \nhelp: this command,\nexit: close terminal .\nwelcome: repeat welcome message.");
                    break;
                case "welcome":  
                    System.out.println(wt.getWelcomeMessage());
                    break;
                default:
                    System.out.println("Command not found: " + command);
            }

        }

    }

}