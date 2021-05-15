package QualityKioskTraining.New_Selenium_Assessment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment_7 {
	public static void main(String [] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\C2C Softwares\\chromedriver\\chromedriver89\\chromedriver.exe");
	ChromeDriver D=new ChromeDriver();
	D.manage().window().maximize();
	D.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro");


			D.switchTo().frame("iframeResult");
			
			WebElement UKCompany=D.findElementByXPath("//table/descendant::tr/td[text()='UK']/parent::tr/descendant::td");
			System.out.println("Name of the Company in UK is "+UKCompany.getText());
			
			
			D.switchTo().defaultContent();
}
}