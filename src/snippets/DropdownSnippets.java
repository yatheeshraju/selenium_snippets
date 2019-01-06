package snippets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSnippets {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\yathe\\Documents\\JavaStuff\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		// select dropdown option  using index
		WebElement indexElement = driver.findElement(By.xpath("//*[@id=\'dropdown1\']"));
		Select indexSelect = new Select(indexElement);
		indexSelect.selectByIndex(1);
		
		// select dropdown option by text
		
		WebElement textElement = driver.findElement(By.name("dropdown2"));
		Select textSelect = new Select(textElement);
		textSelect.selectByVisibleText("Loadrunner");
		
		// select dropdown using value 
		
		WebElement valueElement = driver.findElement(By.id("dropdown3"));
		Select valueSelect = new Select(valueElement);
		valueSelect.selectByVisibleText("Appium");
		

		//get number of drop down options
		
		WebElement totoptElement = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/select"));
		Select totoptSelect = new Select(valueElement);
		List<WebElement> totele = totoptSelect.getOptions();
		System.out.println("Number of options :"+ totele.size());
		
		
		
		// using send keys to select 
		
		WebElement sndkeyselement = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/select"));
		sndkeyselement.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		
		// select multiple 
		WebElement multiElement = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[6]/select"));
		Select multiSelect = new Select(multiElement);
		multiSelect.selectByIndex(2);
		multiSelect.selectByIndex(3);
		
		
	}

}
