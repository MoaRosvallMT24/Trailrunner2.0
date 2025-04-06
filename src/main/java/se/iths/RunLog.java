package se.iths;

import java.util.ArrayList;
import java.util.List;


public class RunLog {
    private List<Run> log;

    public RunLog() {
        this.log = new ArrayList<>();
    }

    public void addRun(Run run) {
        log.add(run);
    }

    public void deleteRunById(String id) {
        log.removeIf(run -> run.getId().equals(id));
    }

    public List<Run> getLog() {
        return log;
    }

    public double calculateTotalDistance() {
        double totalDistance = 0.0;
        for (Run run : log) {
            totalDistance += run.getDistance();
        }
        return totalDistance;
    }

    public double calculateAverageDistance() {
        if (log.isEmpty()) { 
            return 0.0; //prevented division by zero, which would break the program. 
        }
        return calculateTotalDistance() / log.size();
    }

    public void printRunById(String id) {
        for (Run run : log) {
            if (run.getId().equals(id)) {
                System.out.println("Run ID: " + run.getId() + ", Distance: " + run.getDistance() + " km, Time: " + run.getMinutes() + " minutes, Date: " + run.getDate());
                return;
            }
        }
    }


}
