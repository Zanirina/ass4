import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FitnessProgramManager programManager = new FitnessProgramManager("Stan' modelyu from zero to hero");
        FitnessSubscriber subscriber1 = new FitnessSubscriber("Zarina");
        FitnessSubscriber subscriber2 = new FitnessSubscriber("Alua");


        programManager.addObserver(subscriber1);
        programManager.addObserver(subscriber2);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Change Fitness Program");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            if(choice == 1) {
                System.out.print("Enter new fitness program: ");
                scanner.nextLine();
                String newProgram = scanner.nextLine();
                programManager.changeProgram(newProgram);
            }

            else if(choice == 2){
                System.out.println("Exiting program.");
                System.exit(0);
            }

            else {
                System.out.println("Invalid option. Try again.");

            }

        }
    }
}
