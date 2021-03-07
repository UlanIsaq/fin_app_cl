package services;

public class IncomeService {
    private float[] incomes;
    private int incomeLevel;


    public IncomeService(int sizeIncome) {
        incomes = new float[sizeIncome];
        incomeLevel = 0;
    }

    public boolean insertIncome(float value) {
        if (incomeLevel < incomes.length) {
            incomes[incomeLevel] = value;
            incomeLevel++;
            return true;
        } else {
            return false;
        }
    }

    public float[] getAllIncomes() {

        return incomes;
    }

    public int numberOfIncomes() {
        return incomeLevel;
    }
}
