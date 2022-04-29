package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4b {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        String title= driver.getTitle();
        System.out.println(title);
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Priyanka");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Ganti");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("priyankaganti@gmail.com");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("9876543210");
        driver.findElement(By.xpath("//textarea")).sendKeys("Hi");
        driver.findElement(By.xpath("//input[@value='submit']")).click();
    }
}
