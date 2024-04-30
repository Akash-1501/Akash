package Akash;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;



public class IRC {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub




//System.setProperty("webdriver.Chrome.driver", "C:\\Users\\akash.venkatesan\\eclipse-workspace\\JavaProject\\Driver\\chromedriver.exe");



        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("irctc");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='sbic vYOkbe']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//h3[text()='IRCTC Next Generation eTicketing System']")).click();
        Thread.sleep(1000);


        ChromeOptions op = new ChromeOptions();
//disable notification parameter
        op.addArguments("--disable-notifications");


        Thread.sleep(5000);

        driver.findElement(By.xpath("//a[text()=' REGISTER ']")).click();
        Thread.sleep(1000);
        driver.findElement((By.xpath("//input[@id='userName']"))).sendKeys("Akash1507PPP");
        driver.findElement((By.xpath("//input[@id='usrPwd']"))).sendKeys("Akash1501@");
        driver.findElement((By.xpath("//input[@id='cnfUsrPwd']"))).sendKeys("Akash1501@");
        driver.findElement((By.xpath("//div[@aria-haspopup='listbox'][1]"))).click();
        driver.findElement((By.xpath("//Span[text()='English']"))).click();
        Thread.sleep(1000);
        driver.findElement((By.xpath("//span[text()='Security Question']"))).click();

        driver.findElement((By.xpath("//Span[text()='What was the name of your first school?']"))).click();

        driver.findElement((By.cssSelector("input[placeholder='Security Answer']"))).sendKeys("RKM");
        driver.findElement(By.cssSelector("button[class='search_btn train_Search ng-star-inserted']")).click();

        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Akash");
        driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("V");

        driver.findElement(By.xpath("//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c65-16 pi pi-chevron-down']")).click();
        driver.findElement(By.xpath("//span[text()='SELF EMPLOYED']")).click();
//span[@class='ng-tns-c58-17 ui-calendar']
        driver.findElement(By.xpath("//span[@class='ng-tns-c58-17 ui-calendar']")).click();

        Select Dateofbirth= new Select(driver.findElement(By.xpath("//select[@tabindex='0']")));
        Dateofbirth.selectByVisibleText("January");
//select[@class='ui-datepicker-year ng-tns-c58-17 ng-star-inserted']
        driver.findElement(By.xpath("//select[@class='ui-datepicker-year ng-tns-c58-17 ng-star-inserted']")).click();
        driver.findElement(By.xpath("//option[text()='2000']")).click();
//a[@class='ui-state-default ng-tns-c58-17 ui-state-active ng-star-inserted']
        driver.findElement(By.xpath("//a[text()='15']")).click();

        Select india= new Select(driver.findElement(By.xpath("//select[@formcontrolname='resCountry']")));
        india.selectByVisibleText("India");
        driver.findElement(By.xpath("//span[text()='Male']")).click();
//id="email"
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("akash150120000@gmail.com");
//Unmarried
        driver.findElement(By.xpath("//label[text()='Unmarried']")).click();
//id="mobile"
        driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("6381726436");
//formcontrolname="nationality"
        Select Nation= new Select(driver.findElement(By.xpath("//select[@formcontrolname='nationality']")));
        Nation.selectByVisibleText("India");
        driver.findElement(By.xpath("//button[@class='search_btn train_Search ng-star-inserted']")).click();
        Thread.sleep(1000);
////input[@id='resAddress1']
        driver.findElement(By.xpath("//input[@id='resAddress1']")).sendKeys("26");
//input[@id='resAddress2']
        driver.findElement(By.xpath("//input[@id='resAddress2']")).sendKeys("Surendran Street");
//resAddress3
        driver.findElement(By.xpath("//input[@id='resAddress3']")).sendKeys("M G R Nagar");
////input[@formcontrolname='resPinCode']
        driver.findElement(By.xpath("//input[@formcontrolname='resPinCode']")).sendKeys("600078");
//formcontrolname="resState"
        driver.findElement(By.xpath("//input[@formcontrolname='resState']")).sendKeys("TAMIL NADU");
        Thread.sleep(1000);
        Select Selectcity= new Select(driver.findElement(By.xpath("//select[@formcontrolname='resCity']")));
        Selectcity.selectByVisibleText("Chennai");
//Kalaignar Karunanidhi Nagar S.O
////select[@formcontrolname='resPostOff']
        driver.findElement(By.xpath("//select[@formcontrolname='resPostOff']")).sendKeys("Kalaignar Karunanidhi Nagar S.O");
//Select Postoffice= new Select(driver.findElement(By.xpath("//select[@formcontrolname='resPostOff']")));
//Postoffice.selectByVisibleText("Kalaignar");
//resPhone
        driver.findElement(By.xpath("//input[@id='resPhone']")).sendKeys("8072169560");
//yes
        driver.findElement(By.xpath("//p-radiobutton[@id='yes']")).click();
////input[@formcontrolname='termCondition']
        driver.findElement(By.xpath("//input[@formcontrolname='termCondition']")).click();
        system.out






















//Select year= new Select(driver.findElement(By.xpath("//option[@value='2000']")));
//year.selectByVisibleText("2000");
























//drpCountry.selectByVisibleText("");

//driver.switchTo().alert().dismiss();

//driver.findElement(By.xpath("//p-autocomplete[@class='form-group ng-tns-c57-24 ng-touched ng-dirty ng-invalid']")).click();






























    }

}
