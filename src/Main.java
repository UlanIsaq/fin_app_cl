import services.IncomeExpenses;
import services.IncomeService;
import ui.UI;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner scn = new Scanner(System.in);

        UI ui = new UI();
       IncomeService incomeService = new IncomeService(3);
        IncomeExpenses incomeExpenses = new IncomeExpenses(3);

        do{
            System.out.println(ui.mainMenu());
            int a = scn.nextInt();
            if(a == -1)
            {
                break;
            }
            switch(a){
                case 1:
                    System.out.println(ui.newIncomeMenu());
                    float income = scn.nextFloat();
                    if(income == -1){
                        break;
                    }
                    if(incomeService.insertIncome(income))
                    {
                        System.out.println("You income reccorded: "+incomeService.numberOfIncomes());
                    }
                    else
                    {
                        System.out.println("Sorry incomes are full");
                    }

                    break;
                case 2:
                    System.out.println(ui.newExpenseMenu());
                    float expense = scn.nextFloat();
                    if(expense == -1){
                        break;}
                    if(incomeExpenses.insertExpense(expense))
                    {
                        System.out.println("You expenses are recorded: "+incomeExpenses.numberOfexpenses());
                    }
                    else
                    {
                        System.out.println("Sorry expenses are full");
                    }
                    break;
                case 3:
                    System.out.println("List income is selected");
                    System.out.println(Arrays.toString(incomeService.getAllIncomes()));
                    break;
                case 4:
                    System.out.println("List expenses is selected");
                    System.out.println(Arrays.toString(incomeExpenses.getAllExpenses()));
                    break;
                default:
                    System.out.println("please use numbers between 1 and 4");
            }


        }while(true);
    }
}
