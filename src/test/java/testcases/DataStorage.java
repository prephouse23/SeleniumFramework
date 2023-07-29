package testcases;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataStorage extends BaseTest{

    @Test
    public void data(){
        String name = "Daniel";
        String[] names = new String[3];
        names[1] = "Leslie";
        names[0] = "Jullie";
        names[2] = name;

        System.out.println(names[2]);
        System.out.println(names.length);
        System.out.println(names);

        List<Object> cars = new ArrayList<>();
        cars.add("Porsche");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyota");
        cars.add(267);
        cars.add(false);
        cars.add('a');
        cars.add("12");
        cars.add("Main St");
        cars.add("New York");
        cars.add("Porsche");

        System.out.println(cars.get(2));
        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars.contains("BMW"));
        System.out.println(cars.contains(true));
        System.out.println("12 main st, new york");
        System.out.println(cars.get(7) + " " + cars.get(8) + " " + cars.get(9));
        for (int i = 0; i <= 4; i++){
            System.out.println(cars.get(i));
        }

        Map<String,Integer> zooAnimals = new HashMap<>();
        zooAnimals.put("Bear",2);
        zooAnimals.put("Alligator",5);
        zooAnimals.put("Monkey",12);
        zooAnimals.put("Elephant",3);

        System.out.println(zooAnimals);
        System.out.println(zooAnimals.get("Elephant"));
        System.out.println(zooAnimals.get("Monkey"));
        System.out.println(zooAnimals.size());
    }

    @Test
    public void ValidateFiveCardsOnHomePage(){
        homePage.openHomePage();
        homePage.ValidateSkuCards();
    }
}
