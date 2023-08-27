import java.util.Scanner;

class LoginSystem {
    Scanner sc = new Scanner(System.in);

    String[] userName = new String[5];
    String[] password = new String[5];
    int i = 0, choice;

    // ***MAKE CHOICE***
    void makeChoice() {
        do {
            System.out.println("1 - Login");
            System.out.println("2 - Signup");
            System.out.println("Enter the choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    signup();
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice == 1 || choice == 2);
    }

    // ***LOGIN****
    void login() {
        System.out.println("Enter the username : ");
        sc.nextLine(); // Consume newline left by previous nextInt()
        String username = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < 5; i++) {
            if (this.userName[i] != null && this.userName[i].equals(username)) {
                System.out.println("Enter the password : ");
                String enteredPassword = sc.nextLine();

                if (this.password[i].equals(enteredPassword)) {
                    System.out.println("Your account is successfully logged in.\n");
                    found = true;
                    break;
                } else {
                    System.out.println("Incorrect password!\n");
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Username not found!\n");
        }
    }

    // ***SIGNUP***
    void signup() {
        System.out.println("Enter the username : ");
        sc.nextLine(); // Consume newline left by previous nextInt()
        userName[i] = sc.nextLine();

        System.out.println("Enter the password : ");
        password[i] = sc.nextLine();

        System.out.println("Your account is successfully created.\n");

        this.i++;
    }

    public static void main(String[] args) {
        LoginSystem lsSystem = new LoginSystem();

        lsSystem.makeChoice();

		// ***USERNAME AND PASSWORDS***
        for (int i = 0; i < lsSystem.i; i++) {
            System.out.println("Username: " + lsSystem.userName[i]);
            System.out.println("Password: " + lsSystem.password[i]);
            System.out.println("--------");
        }
    }
}
