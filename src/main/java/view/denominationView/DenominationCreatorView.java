package view.denominationView;

import controller.denomination.DenominationCreator;
import java.util.Scanner;

public class DenominationCreatorView {
    private static DenominationCreatorView self = null;
    public static DenominationCreatorView getInstance() {
        if (self == null) {
            self = new DenominationCreatorView();
        }
        return self;
    }

    Scanner myScanner = new Scanner(System.in);

    public void denominationCreatorView() {
        System.out.println("Enter the Denomination Id");
        int denominationId = myScanner.nextInt();

        System.out.println("Enter the Denomination Currency");
        String denominationCurrency = myScanner.nextLine();

        System.out.println("Enter the Denomination Amount");
        int denominationAmount = myScanner.nextInt();

        DenominationCreator.getInstance().denominationCreator(denominationId, denominationCurrency, denominationAmount);
    }
}
