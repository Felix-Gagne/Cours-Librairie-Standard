package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Veuillez entrer un nombre:");
        boolean done = false;
        while(!done){
            try {
                Scanner scan = new Scanner(System.in);
                int input = scan.nextInt();
                System.out.println("Merci votre nombre est " + input);
                done = true;
            }
            catch (Exception e) {
                System.out.println("Ceci n'est pas un nombre entier, veuillez entrer un nombre entier:");

            }
        }
    }
}
