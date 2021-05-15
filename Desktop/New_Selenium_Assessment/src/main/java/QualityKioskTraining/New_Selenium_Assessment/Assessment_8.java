package QualityKioskTraining.New_Selenium_Assessment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assessment_8 {
	public static void main(String [] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\C2C Softwares\\chromedriver\\chromedriver89\\chromedriver.exe");
	ChromeDriver D=new ChromeDriver();
	D.manage().window().maximize();
	D.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");

			D.switchTo().frame("iframeResult");
			
			WebElement FirstName=D.findElementById("fname");
			FirstName.sendKeys("Mayur");
			Actions Act=new Actions(D);
			Thread.sleep(5000);
			
			Act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			
			Act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(5000);

			WebElement LastName=D.findElementById("lname");
			
			Act.keyDown(LastName, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
			
			D.findElementByCssSelector("input[type='submit']").click();
			Thread.sleep(5000);
}
}