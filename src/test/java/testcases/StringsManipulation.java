package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class StringsManipulation extends BaseTest{

    @Test
    public void whatIsString() {
        String username = "Dmytro.Sylyvonchyk";
        System.out.println(username);
        System.out.println("Dmytro" + "Sylyvonchyk");
        System.out.println("Dmytro" + "Sylyvonchyk" + 234);
        boolean is = true;
        double roundUp = 99.9;
        System.out.println(is + username + roundUp);
        String usernameWithDouble = "Dmytro.Sylyvonchyk" + 99.9;
        System.out.println(usernameWithDouble);
        String callOut = username + roundUp;
        System.out.println(callOut);

        char oneCharacter = 'u';
        char[] arrayFromString = username.toCharArray();
        System.out.println(arrayFromString.length);
        int lengthOfArray = arrayFromString.length;
        System.out.println(arrayFromString[5]);
        System.out.println(arrayFromString[0]);
        System.out.println("___________________");

        int stringLength = username.length();
        System.out.println(stringLength);
        System.out.println(username.charAt(5));
    }

    @Test
    public void stringFunctions(){
        String username = "Dmytro.Sylyvonchyk";
        boolean verification = username.contains(".");
        System.out.println(verification);

    }
    @Test
    public void stringFunctionsFromPage(){
//        driver.get("http://bestbuy.com");
//        String price = driver.findElement(By.xpath("//div[@data-testid='customer-price']/span[@aria-hidden='true']")).getText();
        String price = "$1,430,999.99";
        System.out.println(price);
        System.out.println(price.substring(1,6));
        int indexOfDot = price.indexOf("."); //ending index
        int indexOfBeginning = price.indexOf("$") + 2; //beginning index

        System.out.println(indexOfBeginning);
        System.out.println(indexOfDot);

        System.out.println(price.substring(1,indexOfDot));
        System.out.println(price.substring(indexOfBeginning,indexOfDot));

    }
    @Test
    public void stringFunctionsFromPageText(){
        driver.get("http://bestbuy.com");
        String buttonText = driver.findElement(By.xpath("//div[@id='my-bby-skinny-banner']//a")).getText();
        System.out.println(buttonText);
        System.out.println(buttonText.contains(" "));
        //Button has to have text "JOIN TODAY" in any case
        System.out.println("--------------");
        String expected = "JOIN TODAY";

        System.out.println(buttonText);

        buttonText = buttonText.toUpperCase();
        System.out.println(buttonText);

        buttonText = buttonText.toLowerCase();
        System.out.println(buttonText);

        System.out.println(buttonText.equals(expected));
        System.out.println(buttonText.equalsIgnoreCase(expected));

    }

    @Test
    public void moreStringFunctions(){
        String username = "Dmytro.Sylyvonchyk";
        username = username.replace('.','_');
        System.out.println(username);
        username = username.replace('y','i');
        System.out.println(username);

        System.out.println("==========");
        System.out.println(username.substring(5));
        System.out.println(username.substring(5,7));

        String[] a = {"one","two","three"};
        for (String b: a){
            System.out.println(b);
        }
    }
}
