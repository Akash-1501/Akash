package Akash;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTest {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        WebDriver driver = new ChromeDriver();
        driver.get("https://c876.centricsoftware.com/WebAccess/login.html#redirect=0");

        driver.manage().window().maximize();


    }
}
