package se.iths;

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

    public String getId(){
        return id;
    }
    
    public double calculateAverageSpeed(){
        return distance / (minutes / 60.0);
    }

    public double calculateTimePerKm(){
        return minutes / distance;
    }
}
