public class FitnessSubscriber implements Observer {
    private String name;

    public FitnessSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + ", new update: " + message);
    }
}
