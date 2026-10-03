class PiggyBank {
    private int savings;
    private final String id;

    PiggyBank(String id) {
        this.id = id;
        savings = 0;
    }

    void deposit(int amount) {
        savings += amount;
    }

    void withdraw(int amount) {
        if (amount <= savings) {
            savings -= amount;
        }
    }

    int getSavings() {
        return savings;
    }
}