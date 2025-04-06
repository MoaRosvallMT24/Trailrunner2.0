package se.iths;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Locale;

public class Run {
    private String id;
    private double distance;
    private int minutes;
    private LocalDate date;


    // Constructors 
    public Run(String id, double distance, int minutes, LocalDate date) {
        this.id=id;
        this.distance=distance;
        this.minutes=minutes;
        this.date=date;
    } 

    public Run() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        
        System.out.println("Enter the run ID: ");
        this.id = scanner.nextLine();
        
        System.out.println("Enter the distance in kilometers: ");
        this.distance = scanner.nextDouble();
        scanner.nextLine(); 
        
        System.out.println("Enter the time in minutes: ");
        this.minutes = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter the date (YYYY-MM-DD): ");
        String datestring = scanner.nextLine();
        this.date = LocalDate.parse(datestring);//converts string input to LocalDate
        
        scanner.close();
    }

    // Getters 
    public String getId(){
        return id;
    }

    public double getDistance(){
        return distance;
    }

    public int getMinutes(){
        return minutes;
    }

    public LocalDate getDate(){
        return date;
    }
    
    // Calculation methods
    public double calculateAverageSpeed(){
        return distance / (minutes / 60.0);
    }

    public double calculateTimePerKm(){
        return minutes / distance;
    }
}
