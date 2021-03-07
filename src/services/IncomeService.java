package services;

import java.util.ArrayList;

public class IncomeService {

    ArrayList<Float> incomesList = new ArrayList<>();

    public boolean insertIncome(float value) {
        return incomesList.add(value);
    }

    public ArrayList<Float> getAllIncomes() {
        return incomesList;
    }

    public int numberOfIncomes() {
        return incomesList.size();
    }
    private Float calculateAverage(){
        return incomesList.isEmpty() ? 0.0f : calculateSum()/incomesList.size();
    }
    private Float calculateSum(){
        float sum = 0.0f;
        for (Float element: incomesList) {
            sum +=element;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "incomesList=" + incomesList
                + "Average of: "+calculateAverage();
    }
}
