package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leeds {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      ChromeDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("http://leaftaps.com/opentaps/control/main");
      driver.manage().window().maximize();
      driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
      driver.findElement(By.id("password")).sendKeys("crmsfa");
      driver.findElement(By.className("decorativeSubmit")).click();
      driver.findElement(By.linkText("CRM/SFA")).click();
      driver.findElement(By.linkText("Leads")).click();
      driver.findElement(By.linkText("Create Lead")).click();
     driver.findElement(By.className("inputBox")).sendKeys("Testleaf");
     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sanjay");
     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rocky");
     WebElement findElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
     Select ob = new Select(findElement);
     ob.selectByIndex(4);
     driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("virat");
     driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
     driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("40000");
     WebElement findElement2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
     Select ob1 = new Select(findElement2);
     ob1.selectByValue("IND_SOFTWARE");
     WebElement findElement3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
     Select ob2 = new Select(findElement3);
     ob2.selectByValue("OWN_CCORP");
     WebElement findElement4 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
     Select ob4 =new Select(findElement4);
     ob4.selectByIndex(2);
     WebElement findElement5 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
     Select ob5 = new Select(findElement5);
     ob5.selectByValue("IND");
     WebElement findElement6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
     Select ob6 = new Select(findElement6);
     ob6.selectByVisibleText("TAMILNADU");
     driver.findElement(By.xpath("//*[@id=\"createLeadForm_primaryPhoneAreaCode\"]")).sendKeys("600");
     driver.findElement(By.xpath("//*[@id=\"createLeadForm_primaryPhoneExtension\"]")).sendKeys("001");
     driver.findElement(By.xpath("//*[@id=\"createLeadForm_primaryEmail\"]")).sendKeys("sanjayoffc05@gmail.com");
     driver.findElement(By.xpath("//*[@id=\"createLeadForm_primaryPhoneNumber\"]")).sendKeys("7871745980");
     driver.findElement(By.xpath("//*[@id=\"createLeadForm_generalToName\"]")).sendKeys("Aravind");
     driver.findElement(By.xpath("//*[@id=\"createLeadForm_generalAttnName\"]")).sendKeys("Assesment");
     driver.findElement(By.xpath("//*[@id=\"createLeadForm_generalAddress1\"]")).sendKeys("73,New street");
     driver.findElement(By.xpath("//*[@id=\"createLeadForm_generalAddress2\"]")).sendKeys("73,New street");
     driver.findElement(By.xpath("//*[@id=\"createLeadForm_generalCity\"]")).sendKeys("Chennai");
     driver.findElement(By.xpath("//*[@id=\"createLeadForm_generalPostalCode\"]")).sendKeys("600001");
     driver.findElement(By.xpath("//*[@id=\"createLeadForm_generalPostalCodeExt\"]")).sendKeys("001");
   
     driver.findElement(By.className("smallSubmit")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//div[@class='frameSectionExtra']//a)[3]")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id=\"updateLeadForm_firstName\"]")).clear();
     driver.findElement(By.xpath("//*[@id=\"updateLeadForm_firstName\"]")).sendKeys("SanjayRamaswamy");
     driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
     String title= driver.getTitle();
    System.out.println(title);
      String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
      System.out.println(text);
     
	}

}
