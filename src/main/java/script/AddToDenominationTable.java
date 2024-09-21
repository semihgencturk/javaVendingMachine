package script;

import controller.denomination.DenominationCreator;

public class AddToDenominationTable {
    private static AddToDenominationTable self = null;
    public static AddToDenominationTable getInstance() {
        if (self == null) {
            self = new AddToDenominationTable();
        }
        return self;
    }

    public void addToDenominationTable() {
        DenominationCreator denominationCreator = DenominationCreator.getInstance();

        denominationCreator.denominationCreator(1, "TRY", 0.1);
        denominationCreator.denominationCreator(2, "TRY", 0.5);
        denominationCreator.denominationCreator(3, "TRY", 1);
        denominationCreator.denominationCreator(4, "TRY", 5);
        denominationCreator.denominationCreator(5, "TRY", 10);
        denominationCreator.denominationCreator(6, "TRY", 20);
        denominationCreator.denominationCreator(7, "TRY", 50);
        denominationCreator.denominationCreator(8, "TRY", 100);
        denominationCreator.denominationCreator(9, "TRY", 200);
    }
}
