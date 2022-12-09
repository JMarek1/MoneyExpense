import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class Note  {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Wallet> walletNote = new ArrayList<>();



    public void addMoneyToWallet() {
        System.out.println("Where do you want to add money? Wallet or Bank account?");
        System.out.println("1 - Wallet");
        System.out.println("2 - Bank account");
        System.out.println("3 - Both (wallet and bank account)");
        int choice = Integer.parseInt(sc.nextLine().trim());
        switch (choice) {
            case 1:
                LocalDate date = LocalDate.now();
                System.out.println("How much money do you want to add?");
                float addMoney = Float.parseFloat(sc.nextLine().trim());
                if (addMoney < 0) {
                    System.out.println("You cant add money with a minus sign!");
                } else {

                    Wallet wallet = new Wallet(addMoney,date);
                    wallet.setMoney(addMoney);
                    walletNote.add(wallet);
                    System.out.println(addMoney + " has been added to your wallet. " + date);
                }
                break;
            case 2:
                date = LocalDate.now();
                System.out.println("How much money do you want to add?");
                double addCreditMoney = Double.parseDouble(sc.nextLine().trim());
                if (addCreditMoney < 0) {
                    System.out.println("You cant add money with a minus sign!");
                } else {
                    Wallet wallet = new Wallet(addCreditMoney, date);
                    wallet.setCreditCard(addCreditMoney);
                    walletNote.add(wallet);
                    System.out.println(addCreditMoney + " has been added to your Bank account." + date);
                }
                break;
            case 3:
                date = LocalDate.now();
                System.out.println("How much credit money do you want to add?");
                addCreditMoney = Double.parseDouble(sc.nextLine().trim());
                System.out.println("How much money do you want to add?");
                addMoney = Float.parseFloat(sc.nextLine().trim());
                if ((addCreditMoney < 0)&&(addMoney<0)) {
                    System.out.println("You cant add money with a minus sign!");
                } else {
                    Wallet wallet = new Wallet(addMoney,addCreditMoney,date);
                    wallet.setCreditCard(addCreditMoney);
                    wallet.setMoney(addMoney);
                    walletNote.add(wallet);
                    System.out.println(addCreditMoney + addMoney + " has been added to your Bank account." + date);
                }
                break;
            default:
                System.out.println("You can't do that action");
        }
    }

    public void addExpense() {
        System.out.println("Where did you spend money in wallet or bank account?");
        System.out.println("1 - Wallet");
        System.out.println("2 - Bank account");
        int choice = Integer.parseInt(sc.nextLine().trim());
        switch (choice) {
            case 1:
                LocalDate date = LocalDate.now();

                System.out.println("How much money did you spend?");
                float addMoneyExpense = Float.parseFloat(sc.nextLine().trim());

                System.out.println("Where did you spend them?");
                String placeOfExpense = sc.nextLine().trim();

                if (addMoneyExpense < 0) {
                    System.out.println("You cant add expense with a minus sign!");
                } else {

                    Wallet wallet = new Wallet(addMoneyExpense,date,placeOfExpense);
                    walletNote.add(wallet);
                    wallet.setMoney(-addMoneyExpense);
                    System.out.println("Expense has been added: " + addMoneyExpense +" "+ placeOfExpense +" "+ date);
                }
                break;
            case 2:
                date = LocalDate.now();
                System.out.println("How much money did you spend?");
                double addCreditExpense = Double.parseDouble(sc.nextLine().trim());

                System.out.println("Where did you spend them? ");
                placeOfExpense = sc.nextLine().trim();

                if (addCreditExpense < 0) {
                    System.out.println("You cant add expense with a minus sign!");
                } else {
                    Wallet wallet = new Wallet(addCreditExpense,date,placeOfExpense);
                    walletNote.add(wallet);
                    wallet.setCreditCard(-addCreditExpense);
                    System.out.println("Expense has been added: "+addCreditExpense+" "+placeOfExpense+" "+date);
                }
                break;
            case 3:
                date = LocalDate.now();
                System.out.println("How much credit money did you spend?");
                addCreditExpense = Double.parseDouble(sc.nextLine().trim());

                System.out.println("How much money did you spend?");
                addMoneyExpense = Float.parseFloat(sc.nextLine().trim());

                System.out.println("Where did you spend them?");
                placeOfExpense = sc.nextLine().trim();
                if ((addCreditExpense < 0)&&(addMoneyExpense<0)) {
                    System.out.println("You cant add money with a minus sign!");
                } else {
                    Wallet wallet = new Wallet(addMoneyExpense, addCreditExpense, date, placeOfExpense);
                    wallet.setCreditCard(-addCreditExpense);
                    wallet.setMoney(-addMoneyExpense);
                    walletNote.add(wallet);
                    System.out.println("Expense has been added: "+addCreditExpense+" "+addMoneyExpense+" "+placeOfExpense+" "+date);
                }
                break;
            default:
                System.out.println("You can't do that action");
        }

    }

    public void statusOfWallet() {
        for (int i = 0; i < walletNote.size(); i++) {
            System.out.println(walletNote.get(i).toString());
        }
    }


}



