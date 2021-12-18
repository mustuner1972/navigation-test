package tests;

import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;

public class NavigationTestFirefox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String googleTitle = driver.getTitle();
        System.out.println("Google title is " + googleTitle);
        Thread.sleep(2000);

        driver.get("https://etsy.com");
        String etsyTitle = driver.getTitle();
        driver.navigate().back();
        String googleTitleLast = driver.getTitle();
        Thread.sleep(2000);

        if (googleTitle.equals(googleTitleLast)){
            System.out.println("Titles are same " );
        }else{
            System.out.println("Titles are not same: ");
            System.out.println("googleTitle = " + googleTitle);
            System.out.println("googleTitleLast = " + googleTitleLast);
        }
        driver.navigate().forward();
        String etsyTitleLast= driver.getTitle();
        System.out.println("Etsy title is: " + etsyTitleLast);
        if (etsyTitleLast.equals(etsyTitle)){
            System.out.println("Titles for etsy are same");
        }else {
            System.out.println("Titles are not same");
            System.out.println("etsyTitle = " + etsyTitle);
            System.out.println("etsyTitleLast = " + etsyTitleLast);

        }
        driver.quit();
    }}