package view;

import java.util.Scanner;

public class GreetingView {
    public void getGreetingView() {
        AdminView adminView = new AdminView();

        System.out.println("Welcome to Vending Machine! How can I help you?");
        System.out.println("1-Admin");
        System.out.println("2-Customer");

        Scanner myScanner = new Scanner(System.in);
        int selectedOption = myScanner.nextInt();

        switch (selectedOption) {
            case 1:
                adminView.getAdminView();
                break;
            case 2:
                CustomerView.getInstance().customerView();
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}