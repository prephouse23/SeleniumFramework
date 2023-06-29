package javapracticum;

import java.sql.SQLOutput;
import java.util.Locale;

public class JavaOOP {

    protected int salary = 30000;
    public int overtime = 20;
    public int rate = 10;
    private int overtimeTuedayGeneral = 2;
    public String fruit = "apple";


    public int wage() {
        int totalWage = salary + overtimeTuedayGeneral + (overtime * rate);
        return totalWage;
    }

    public int calculateWage(int salary, int overtime, int rate) {
        int totalWage = salary + (overtime * rate);
        return totalWage;
    }

    public int employeeJessica() {
        int salary = 20000;
        int overtime = 10 + overtimeTuedayGeneral;
        int rate = 15;
        return calculateWage(salary, overtime, rate);
    }

    //
    public void name() {
        //doesn't return anything
    }

    public void harvesting(int people, String month, int tools) {
        System.out.println("Do next 3 things to harvest your fruit:......");
        System.out.println("#1:......");
        System.out.println("#2 if .....");
        int tel = 234545;
        System.out.println("#3 if ....." + tel );

    }

    public void harvesting(int people, int tools) {
        System.out.println("Do next 2 things to harvest your fruit:......");
    }

    public void harvesting(int people){
        System.out.println("Do next 1 thing to harvest your fruit:......");
    }


    public void apples() {
        String color = "red";
        String shape = "round";
        String type = "Gala";
        String location = "CA";
        harvesting(5, "hh", 1);
    }

    public void oranges() {
        String color = "orange";
        String shape = "round";
        String type = "Gala";
        String location = "CA";
        harvesting(5, "hh", 1);
    }

    public void getFruitHarvested(){
        if(fruit.equals("apple")){
            System.out.println("Harvest method will contain 3 activities");
        } else if (fruit.equals("blueberry")){
            System.out.println("Harvest method will contain 2 activities");
        } else if (fruit.contains("banana")){
            System.out.println("Harvest method will contain 1 activity");
        } // 100 fruits
    }

    public static void main(String[] args) {
        int i = 0;
        for(i = 0; i<24; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }







}
