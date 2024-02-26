public interface FitnessProgram {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String message);
}
