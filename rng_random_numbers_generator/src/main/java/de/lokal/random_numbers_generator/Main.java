package de.lokal.random_numbers_generator;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Enter = new Scanner(System.in);
        Random random_numb = new Random();
        boolean laeuft = true; 
                                
        // Begrueßung         
        System.out.println("--RNG_Random_Numbers_Generator--");

        // Eingabe zum generieren von Zufallszahlen
        System.out.println("Drücke Enter, um eine Zufallszahl zu erzeugen, e zum beenden.");

        while (laeuft) {
            String enter = Enter.nextLine();

            if (enter.equalsIgnoreCase("e")) {
                laeuft = false;
                System.out.println("Generator beendet.");
            } else {
                int Zufallszahl = random_numb.nextInt(100) + 1;
                System.out.println("Deine Zufallszahl ist: " + Zufallszahl);
            }
        }
                        
        Enter.close();
    }
}