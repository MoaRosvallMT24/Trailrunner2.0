package se.iths;

import java.util.Scanner;
import java.util.Locale;

public class Run {
    private String id;
    private double distance;
    private int minutes;
    private String date;
        
    public Run(String id, double distance, int minutes, String date){
        this.id=id;
        this.distance=distance;
        this.minutes=minutes;
        this.date=date;
    } 

    public Run(){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        
        System.out.println("Enter run ID in format RunX: ");
        this.id = scanner.nextLine();
        
        System.out.println("Enter distance in kilometers: ");
        this.distance = scanner.nextDouble();
        scanner.nextLine(); 
        
        System.out.println("Enter time in minutes: ");
        this.minutes = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter date in format YYYY-MM-DD: ");
        this.date = scanner.nextLine();
        
        scanner.close();
    }

    public String getId(){
        return id;
    }

    public double getDistance(){
        return distance;
    }

    public int getMinutes(){
        return minutes;
    }

    public String getDate(){
        return date;
    }
    
    public double calculateAverageSpeed(){
        return distance / (minutes / 60.0);
    }

    public double calculateTimePerKm(){
        return minutes / distance;
    }
}
