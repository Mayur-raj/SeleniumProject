package QualityKioskTraining.New_Selenium_Assessment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assesssment_3 {
	public static void main(String [] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\C2C Softwares\\chromedriver\\chromedriver89\\chromedriver.exe");
	ChromeDriver D=new ChromeDriver();
	D.manage().window().maximize();
	D.get("https://letskodeit.teachable.com/p/practice");
	
	D.switchTo().frame("courses-iframe");
	WebElement Element=D.findElementByCssSelector("input[class='form-control search input-lg']");
	
	Element.sendKeys("Selenium");
	Thread.sleep(2000);
	
	
	D.findElementByCssSelector("button[class='btn search btn-default btn-lg']").click();
	Thread.sleep(2000);
	

}
}