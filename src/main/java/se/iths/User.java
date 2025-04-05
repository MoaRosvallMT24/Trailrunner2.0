package se.iths;

import java.util.Locale;
import java.util.Scanner;

public class User {
    private String username;
    private double weight;
    private double height;

    
    
    public User(String username, double weight, double height) {
        this.username = username;
        this.weight = weight;
        this.height = height;
    }

    public User() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Set locale to US for decimal parsing
        
        System.out.println("Enter your username: ");
        this.username = scanner.nextLine();
        
        System.out.println("Enter your weight in kilograms: ");
        this.weight = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        
        System.out.println("Enter your height in meters: ");
        this.height = scanner.nextDouble();

        scanner.nextLine();
        scanner.close();
    }
    
    public String getUsername() {
        return username;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public double getHeight() {
        return height;
    }

    public double calculateBMI() {
        return weight / (height * height);
    }
    
}
