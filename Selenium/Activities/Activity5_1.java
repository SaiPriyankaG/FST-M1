package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        String title= driver.getTitle();
        System.out.println(title);
         WebElement status =driver.findElement(By.xpath("//input[@class='willDisappear']"));
         System.out.println(status.isDisplayed());
         driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
        System.out.println(status.isDisplayed());
        driver.close();


    }
}
