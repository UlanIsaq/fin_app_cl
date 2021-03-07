package services;

public class IncomeExpenses {
    private float[] expenses;
    private int expenseLevel;

    public IncomeExpenses(int sizeOfExpenses) {
        expenses = new float[sizeOfExpenses];
        expenseLevel = 0;
    }

    public boolean insertExpense(float value) {
        if (expenseLevel < expenses.length) {
            expenses[expenseLevel] = value;
            expenseLevel++;
            return true;
        }
        return false;
    }

    public float[] getAllExpenses() {
        return expenses;
    }

    public int numberOfexpenses() {
        return expenseLevel;
    }

}
