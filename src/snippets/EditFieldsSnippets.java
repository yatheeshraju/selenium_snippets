package snippets;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EditFieldsSnippets {

	public static void main(String[] args) {
		
		// set firefox gecko driver path
		System.setProperty("webdriver.gecko.driver","C:\\Users\\yathe\\Documents\\JavaStuff\\geckodriver.exe" );
		
		// launch firefox 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		// enter text to input field
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("dummy@email.com");
		
		// append text to input field
		WebElement appendtxt = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input"));
		appendtxt.sendKeys("Adding some text "+ Keys.TAB);
		
		// get default  text from input field
		WebElement defaulttxt = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input"));
		System.out.println("The default text in the input box is : "+defaulttxt.getAttribute("value"));

		// clear text from input field
		WebElement cleartxt = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/input"));
		cleartxt.clear();
		
		// get the status of input field enabled/disabed
		WebElement disabledfld = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/div/div/input"));
		System.out.println("Is the Field Enabled ? : "+disabledfld.isEnabled());
		
		// close browser
		//driver.close();
	}

}
