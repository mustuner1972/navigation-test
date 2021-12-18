package tests;

import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;

public class NavigationTestsChrome {
    public static void main(String[] args) throws InterruptedException {
//1. Open	browser
//2. Go	to	website	https://google.com
//3. Save the	title in	a	string	variable
//4. Go	to	https://etsy.com
//5. Save the	title	in	a	string	variable
//6. Navigate	back	to	previous page
//7. Verify	that	title	is	same	is	in	step	3
//8. Navigate	forward	to	previous	page
//9. Verify	that	title	is	same	is	in	step	5
//WebDriver driver = WebDriveFactory.getDriver("chrome");
//        driver.get("https://www.amazon.co.uk/");    }
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
       String googleTitle = driver.getTitle();
        System.out.println("Google title is " +googleTitle);
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