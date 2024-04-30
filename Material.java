package Akash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Material {

    public static void main(String[] args) throws InterruptedException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        WebDriver driver = new ChromeDriver();
        driver.get("https://c877.centricsoftware.com/WebAccess/login.html#redirect=0");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.manage().window().maximize();
//        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='LoginID']")).sendKeys("Administrator");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("centric8");
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Login']")).click();
//        Thread.sleep(20000);

//driver.findElement(By.xpath( "//span[text() =\"build\"]"));
//driver.findElement(By.xpath("//a[text() =\"System Configuration\"]"));
//driver.findElement(By.xpath("//button[@data-csi-tab-name=\"Configuration\"]"));
driver.findElement(By.xpath("//button[@data-csi-tab-name=\"Type Configuration\"]")).click();
//Thread.sleep(2000);
driver.findElement(By.xpath("//button[@data-csi-tab-name=\"Material Types\"]")).click();
//Thread.sleep(5000);
driver.findElement(By.xpath("//div[text()=\"New Material Type\"]")).click();
//Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name=\"Node Name\"]")).sendKeys("Standalone_Material");
        driver.findElement(By.xpath("//span[text()='Save']")).click();
//        Thread.sleep(2000);

//        boolean isEmailVisible = driver.findElement(By.xpath("//td[text()=\"Standalone_Material\"]//following::span[@id=\"csi_page_complete\"]")).isDisplayed();
//        assertEquals(isEmailVisible,true);
        driver.findElement(By.xpath("//td[text()=\"Standalone_Material\"]//following::td[@class='attrBoolean iconEditable csi-table-frozen-left']")).click();
//       Thread.sleep(2000);
        driver.findElement(By.xpath("//td[text()=\"Standalone_Material\"]//following::td[@data-csi-heading=\"HasColor:Child:Config:0\"]")).click();
//Thread.sleep(2000);
        driver.findElement(By.xpath("//td[text()=\"Standalone_Material\"]//following-sibling::td/div[@data-csi-act=\"AllowCreateColoredMaterialOnPlacement:Child:Config:0\"]")).click();
//        driver.findElements(By.xpath("//td[text()=\"Standalone_Material\"]//following-sibling::td[@class=\"attrEnum attrEnumColorPaletteRuleTypes iconEditable\"]")).cl;
        Select se = new Select(driver.findElement(By.xpath("//td[text()=\"Standalone_Material\"]//following-sibling::td[@class=\"attrEnum attrEnumColorPaletteRuleTypes iconEditable\"]")));

        se.selectByVisibleText("Enabled");


//        List<WebElement> Options = driver.findElements(By.xpath("//td[text()=\"Standalone_Material\"]//following-sibling::td[@class=\"attrEnum attrEnumColorPaletteRuleTypes iconEditable\"]"));
//        for(WebElement option : Options)
//        {
//            if(option.getText().equalsIgnoreCase("Enabled"))
//            {
//                option.click();
//                break;
//
//
//            }
//        }
//Thread.sleep(2000);
        driver.findElement(By.xpath("//td[text()=\"Standalone_Material\"]//following::div[@data-csi-act=\"HasSize:Child:Config:0\"]")).click();
//Thread.sleep(2000);
        driver.findElement(By.xpath("//td[text()=\"Standalone_Material\"]//following-sibling::td[@data-csi-heading=\"EnableSKUSources:Child:Config:0\"]")).click();
//Thread.sleep(2000);
        driver.findElement(By.xpath("//td[text()=\"Standalone_Material\"]//following::div[@data-csi-act=\"DefaultHasSeasonAvailability:Child:Config:0\"]")).click();
//Thread.sleep(2000);
//        driver.findElement(By.xpath("//td[text()=\"Standalone_Material\"]//following::div[@data-csi-act=\"DefaultHasSeasonAvailability:Child:Config:0\"]")).click();
Thread.sleep(20000);
//driver.findElement(By.xpath("//span[text()='Cancel']")).click();
 driver.findElement(By.xpath("//td[text()=\"Standalone_Material\"]//following-sibling::td/div[@data-csi-act=\"DefaultPlacementQuoteToHighestCost:Child:Config:0\"]")).click();
//Thread.sleep(2000);
//        boolean isEmailVisible = driver.findElement(By.xpath("//td[text()=\"Standalone_Material\"]//following::span[@id=\"csi_page_complete\"]")).isDisplayed();
//        assertEquals(isEmailVisible,true);




        Thread.sleep(2000);
driver.findElement(By.xpath("//td[text()=\"Standalone_Material\"]//following-sibling::td[@data-csi-heading-vk=\"MaterialBOM\"]")).click();
       // Thread.sleep(2000);
driver.findElement(By.xpath("//td[text()=\"Standalone_Material\"]//following::div[@aria-label=\"uniqName_30_1\"]")).click();
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[text()=\"Standalone_Material\"]//following::div[@aria-label=\"uniqName_30_2\"]")).click();









    }

    private static void assertEquals(boolean isEmailVisible, boolean b) {
    }
}
