import java.util.ArrayList;
import java.util.List;

public class FitnessProgramManager implements FitnessProgram {
    private List<Observer> observers = new ArrayList<>();
    private String programName;

    public FitnessProgramManager(String programName) {
        this.programName = programName;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(programName + ": " + message);
        }
    }

    public void changeProgram(String newProgram) {
        System.out.println("Changing fitness program to: " + newProgram);
        notifyObservers("Program changed to " + newProgram);
    }
}
