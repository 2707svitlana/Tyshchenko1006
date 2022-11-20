package lekcia11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestFirst {
    static WebDriver driver = new ChromeDriver();
    public static void main(String[] args) {
        test1();
        driver.quit();
    }
    public static void test1() {

        driver.get("https://dnipro.ithillel.ua/");
        System.out.println(driver.getTitle());

        if (!driver.getTitle().equals("Комп'ютерна школа Hillel у Дніпрі: Курси IT-технологій")){
            System.err.println("TEST1 Failure");
        }
    }
}

