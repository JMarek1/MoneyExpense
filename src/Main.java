import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Note note = new Note();
        String input =""; // input for while loop

        System.out.println("_______________________________");
        System.out.println("Welcome to your E-money Expense");
        System.out.println("_______________________________");
        System.out.println();

        while (!input.equals("4")) {
            System.out.println("Do you want add money or expense or write out status of you wallet");
            System.out.println("1 - Add money");
            System.out.println("2 - Add expense");
            System.out.println("3 - Statement of E-money expense");
            System.out.println("4 - End E-money Expense");

            input = sc.nextLine().trim();

            switch (input) {
                case "1":
                    note.addMoneyToWallet();
                    break;
                case "2":
                    note.addExpense();
                    break;
                case "3":
                    note.statusOfWallet();
                    break;
                case "4":
                    System.out.println("Program will be closed");
                    break;
                default:
                    System.out.println("You can't do that action");
            }
        }

    }
}