package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4a {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String title=driver.getTitle();
        System.out.println(title);
        driver.findElement(By.xpath("//a[@id='about-link']")).click();
        System.out.println("TitleOfNewPage:" +driver.getTitle());

    }
}
