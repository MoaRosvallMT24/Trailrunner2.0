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

    public List<Run> getLog() {
        return log;
    }


}
