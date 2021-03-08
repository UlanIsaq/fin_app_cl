package services;

import domain.Income;

import java.util.ArrayList;
import java.util.Comparator;

public class IncomeService {

    ArrayList<Income> incomesList = new ArrayList<>();

    public boolean insertIncome(Income value) {
        return incomesList.add(value);
    }

    public ArrayList<Income> getAllIncomes() {
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
        for (Income element: incomesList) {
            sum +=element.getValue();
        }
        return sum;
    }

    @Override
    public String toString() {
        Comparator<Income> valueComparator = new Comparator<Income>() {
            @Override
            public int compare(Income o1, Income o2) {
                if(o1.getIncomeDate() == o2.getIncomeDate())
                {
                    return 0;
                }
                else if (o1.getIncomeDate() > o2.getIncomeDate())
                {
                    return 1;
                }
                else{
                    return -1;
                }

            }
        };
        incomesList.sort(valueComparator);
        return "incomesList=" + incomesList
                + " Average of: "+calculateAverage();
    }

}
