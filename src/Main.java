import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Account user1 = new Account("Piotr", "Nykiel", 1000000, 1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Id");
        int Id = scanner.nextInt();
        if (Id == 1) {
            System.out.println("Witaj, " + user1 + " twój stan konta: " + user1.getBalance() + " złotych");
            System.out.println("Ile chcesz wyplacic?");
            int money = scanner.nextInt();
            user1.withdrawal(money);
            System.out.println("Twoj aktualny stan konta: " + user1.getBalance() + " złotych");

        } else {
            System.out.println("Bledne Id");

        }
    }
}