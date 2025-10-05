package com.AI_Based_Recommendation_System;

//Simple Recommendation System in Java
//This program recommends products based on user's favorite category
//Program runs in a loop until user types END
import java.util.Scanner;
public class Recommendation {
// Method to show recommendations based on category
public static void showRecommendations(String category) {
   if (category.equalsIgnoreCase("books")) {
       System.out.println("Recommended Books:");
       System.out.println("1. Java Programming Basics");
       System.out.println("2. Learn Data Structures");
       System.out.println("3. Artificial Intelligence Guide");
   } 
   else if (category.equalsIgnoreCase("movies")) {
       System.out.println("Recommended Movies:");
       System.out.println("1. The Quite Place");
       System.out.println("2. Total Recall");
       System.out.println("3. Avengers");
   } 
   else if (category.equalsIgnoreCase("games")) {
       System.out.println("Recommended Games:");
       System.out.println("1. Chess");
       System.out.println("2. Free Fire");
       System.out.println("3. Minecraft");
   } 
   else if (category.equalsIgnoreCase("laptops")) {
       System.out.println("Recommended Games:");
       System.out.println("1. Lenovo");
       System.out.println("2. Asus");
       System.out.println("3. Dell");
   } 
   else if (category.equalsIgnoreCase("cars")) {
       System.out.println("Recommended Games:");
       System.out.println("1. Defender");
       System.out.println("2. Hyundai");
       System.out.println("3. Rolls Royce");
   } 
   else if (category.equalsIgnoreCase("mobiles")) {
       System.out.println("Recommended Games:");
       System.out.println("1. Redmi");
       System.out.println("2. Vivo");
       System.out.println("3. Samsung");
   } 
   else {
       System.out.println("Sorry! No recommendations available for this category.");
   }
}
// Main method (program execution starts here)
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Welcome to Simple Recommendation System !");
   System.out.println("Type END to exit the program.\n");
   while (true) {  // loop runs until user types END
       // Ask user for their interest
       System.out.println("Please enter your favorite category (books/movies/games/laptops/mobiles/cars) : ");
       String userChoice = sc.nextLine();
       // Check if user wants to end the program
       if (userChoice.equalsIgnoreCase("END")) {
           System.out.println("Thank you! Exiting Recommendation System.....");
           break; // break the loop
       }
       // Show recommendations based on user's choice
       showRecommendations(userChoice);
       System.out.println(); // print empty line for readability
   }
   sc.close(); // close scanner
}
}