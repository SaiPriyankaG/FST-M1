package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver= new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");

        String Title= driver.getTitle();
        System.out.println("Title:" + Title);

        WebElement firstName= driver.findElement(By.id("firstName"));
        firstName.sendKeys("Priyanka");

        WebElement lastName= driver.findElement(By.id("lastName"));
        lastName.sendKeys("Ganti");

        WebElement email= driver.findElement(By.id("email"));
        email.sendKeys("priyankaganti@gmail.com");

        WebElement number= driver.findElement(By.id("number"));
        number.sendKeys("9876543210");

        driver.findElement(By.xpath("//input[@value='submit']")).click();

        Thread.sleep(5000);

        driver.close();





    }
}
