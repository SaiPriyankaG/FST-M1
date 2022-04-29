package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net");

        String Title=driver.getTitle();
        System.out.println("Title:" +Title );

        WebElement idLocator=driver.findElement(By.id("about-link"));
        System.out.println("text in id locator:" + idLocator.getText());

        WebElement classNameLocator= driver.findElement(By.className("green"));
        System.out.println("text in classNameLocator:" + classNameLocator.getText());

        WebElement linkTextLocator= driver.findElement(By.linkText("About Us"));
        System.out.println("text in LinkTextLocator:" + linkTextLocator.getText());

        WebElement cssSelectorLocator= driver.findElement(By.cssSelector(".green"));
        System.out.println("text in cssSelectorLocator:" + cssSelectorLocator.getText());

        Thread.sleep(5000);
        driver.close();
    }
}
