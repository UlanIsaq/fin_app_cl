package domain;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Income {
    public Income(String name, float value, long incomeDate) {
        this.name = name;
        this.value = value;
        this.incomeDate = incomeDate;
    }

    //private DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private SimpleDateFormat dtf= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public long getIncomeDate() {
        return incomeDate;
    }

    public void setIncomeDate(long incomeDate) {
        this.incomeDate = incomeDate;
    }

    private String name;
    private float value;
    private long incomeDate;

    @Override
    public String toString() {
        return "Income{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", incomeDate=" + dtf.format(new Timestamp(incomeDate)) +
                '}';
    }
}
