/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numguessinggame;

/**
 *
 * @author allenhorton
 */
import java.util.Scanner;

public class NumGuessingGame {

    public static void theNumGame () {
        //Scanner class
        Scanner sc = new Scanner(System.in);
        
        //Generate the numbers
        int number = 1 + (int)(100 * Math.random());
        
        //Given K trials 
        int K = 5;
        
        int i, guess;
        
        System.out.println(
        "I'm going to cherry pick a number" 
          + " between 1 to 100."
          + " I'll give you 5 tries"
          + " to guess that number."
        );
        
        // Iterate over K Trials
        for (i = 0; i < K; i++) {
           
            System.out.println(
            "What's the number:");
            
            // Take input for guessing
            guess = sc.nextInt();
            
            // If the number is guessed
            if (number == guess) {
            System.out.println("Bingo! That's the number!");
            break;
            }
            else if (number > guess && i != K - 1) {
                System.out.println(
                "The number is greater than " + guess + "."
                );
             
            } 
            else if (number < guess && i != K - 1) {
                System.out.println(
                "The number is less than " + guess + "."
                );
            }
        }
        
        if (i == K){
            System.out.println(
            "You've used all  " + K + " of your tries."
            );
            
            System.out.println(
            "The number was " + number + "."
            );
        }
    }

    
    public static void main(String[] args) {
        theNumGame();
    }
}
