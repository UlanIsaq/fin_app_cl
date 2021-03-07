package ui;

public class UI {
    String menu;
    public String mainMenu() {
        menu = "1. Create Income\n 2. Create Expense\n 3. List Income\n 4. List Expense\n -1.Exit";
        return menu;
    }
    public  String newIncomeMenu(){
        menu = "Please enter value, (-1 to go to main menu)";
        return menu;
    }
    public  String newExpenseMenu() {
        menu = "Please enter value, (-1 to go to main menu)";
        return menu;
    }
    }

