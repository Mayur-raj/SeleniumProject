package QualityKioskTraining.New_Selenium_Assessment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment_2 {
	public static void main(String [] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\C2C Softwares\\chromedriver\\chromedriver89\\chromedriver.exe");
	ChromeDriver D=new ChromeDriver();
	D.manage().window().maximize();
	D.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	D.switchTo().frame("iframeResult");
	
	D.findElementByXPath("//button[@onclick='myFunction()']").click();
	Thread.sleep(2000);
	
	Alert K=D.switchTo().alert();
	K.sendKeys("MAYUR");
	Thread.sleep(2000);
	K.accept();
	

}

}

