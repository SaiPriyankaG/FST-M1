package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        String title= driver.getTitle();
        System.out.println(title);
        WebElement checkbox= driver.findElement(By.xpath("//input[@class='willDisappear']"));
        WebElement toggleCheckbox= driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
        toggleCheckbox.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOf(checkbox));

        toggleCheckbox.click();
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        checkbox.click();

        driver.close();





    }
}
