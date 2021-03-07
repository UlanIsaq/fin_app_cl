package services;

import java.util.ArrayList;

public class IncomeExpenses {

    ArrayList<Float> expensesList = new ArrayList<>();


    public boolean insertExpense(float value) {
        return expensesList.add(value);
    }

    public ArrayList<Float> getAllExpenses() {
        return expensesList;
    }

    public int numberOfexpenses() {
        return expensesList.size();
    }

    @Override
    public String toString() {
        return "expensesList=" + expensesList;
    }
}
