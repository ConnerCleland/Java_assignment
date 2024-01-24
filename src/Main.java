import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the passcode? ");
        String password = scanner.nextLine().toLowerCase();

        while (true) {
            System.out.print("[enter], [change], [quit]\n");
            String action = scanner.nextLine();

            if (action.equals("enter")) {
                System.out.print("What is the password? ");
                String enteredPassword = scanner.nextLine();
                if (enteredPassword.equals(password)) {
                    System.out.println("You can enter.");
                } else {
                    System.out.println("Wrong passcode.");
                }
            } else if (action.equals("change")) {
                System.out.print("What is the passcode? ");
                String enteredPassword = scanner.nextLine();
                if (enteredPassword.equals(password)) {
                    System.out.print("What is the new passcode? ");
                    password = scanner.nextLine();
                } else {
                    System.out.println("Wrong passcode.");
                }
            } else if (action.equals("quit")) {
                break;
            } else {
                System.out.println("Invalid action.");
            }
        }

        scanner.close();
    }
}
