package model;

public class Denomination {
    private static Denomination self = new Denomination();
    public static Denomination getInstance() { return self; }

    private int denominationId;
    private String denominationCurrency;
    private int denominationAmount;

    public int getDenominationId() {
        return denominationId;
    }

    public void setDenominationId(int denominationId) {
        this.denominationId = denominationId;
    }

    public int getDenominationAmount() {
        return denominationAmount;
    }

    public void setDenominationAmount(int denominationAmount) {
        this.denominationAmount = denominationAmount;
    }

    public String getDenominationCurrency() {
        return denominationCurrency;
    }

    public void setDenominationCurrency(String denominationCurrency) {
        /*
        if (validDenominationCurrencies.contains(denominationCurrency)) {
            this.denominationCurrency = denominationCurrency;
        } else {
            throw new IllegalArgumentException("Currency is invalid!");
        }
        */
        this.denominationCurrency = denominationCurrency;
    }
}
