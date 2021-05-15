package QualityKioskTraining.New_Selenium_Assessment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment_1 {
			public static void main(String [] args)
		{
		System.setProperty("webdriver.chrome.driver","C:\\C2C Softwares\\chromedriver\\chromedriver89\\chromedriver.exe");
		ChromeDriver D=new ChromeDriver();
		D.manage().window().maximize();
		D.get("https://letskodeit.teachable.com/p/practice");
		
			WebElement Entername=D.findElementById("name"); 
			Entername.sendKeys("MAYUR"); 
			
			String Name=Entername.getAttribute("value");
			
			D.findElementById("confirmbtn").click();
			
			Alert K=D.switchTo().alert(); 
			
			String ConfirmText = K.getText();
			if(ConfirmText.contains(Name)) 
				System.out.println("Text Contain name...Passed");
			else
				System.out.println("Text Does not Contain name...Failed");
			
			K.dismiss();
		}
		}
