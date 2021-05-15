package QualityKioskTraining.New_Selenium_Assessment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assessment_5 {
	public static void main(String [] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\C2C Softwares\\chromedriver\\chromedriver89\\chromedriver.exe");
	ChromeDriver D=new ChromeDriver();
	D.manage().window().maximize();
	D.get("https://letskodeit.teachable.com/p/practice");
	
	WebElement ListBox=D.findElementById("multiple-select-example");
	
	
	Select s= new Select(ListBox);
	s.selectByVisibleText("Orange");
	
	List<String>OptionNames=new ArrayList<String>();
	OptionNames.add("Apple");
	OptionNames.add("Orange");
	OptionNames.add("Peach");
	

	List<WebElement>MultipleOption=s.getOptions();
	
	for(WebElement Element:MultipleOption)
	{
		String OptionText=Element.getText();
		
		if(OptionNames.contains(OptionText))
			System.out.println("Correct Option are present... Passed");
		else
			System.out.println("Incorrect Option are present...Failed");
	}
	

	List<WebElement>GetSelectedOption=s.getAllSelectedOptions();
	
	for(WebElement Element:GetSelectedOption)
	{
		String SelectedText=Element.getText();
		
		if(OptionNames.contains(SelectedText))
			System.out.println("Correct Option are selected... Passed");
		else
			System.out.println("Incorrect Option"+GetSelectedOption +"is selected...Failed");

	}

}
}