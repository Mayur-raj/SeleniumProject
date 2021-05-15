package QualityKioskTraining.New_Selenium_Assessment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment_4 {
	public static void main(String [] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\C2C Softwares\\chromedriver\\chromedriver89\\chromedriver.exe");
	ChromeDriver D=new ChromeDriver();
	D.manage().window().maximize();
	D.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_disabled");
	
	D.switchTo().frame("iframeResult");

	
	if(!D.findElementByCssSelector("button[type='button']").isEnabled()) {
		System.out.println("Button is Disable...Passed");
	}
	else
		System.out.println("Button is Enable...Failed");
	
}
}