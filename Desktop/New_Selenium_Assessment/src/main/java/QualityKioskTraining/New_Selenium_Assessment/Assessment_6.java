package QualityKioskTraining.New_Selenium_Assessment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment_6 {
	public static void main(String [] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\C2C Softwares\\chromedriver\\chromedriver89\\chromedriver.exe");
	ChromeDriver D=new ChromeDriver();
	D.manage().window().maximize();
	D.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_table_test");
	

	D.switchTo().frame("iframeResult");
	
	WebElement Saving=D.findElementByXPath("//table/descendant::tr[last()]/td[last()]");
	
	System.out.print("Saving Of February Month is "+Saving.getText());
	
	D.switchTo().defaultContent();

}
}