package snippets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxSnippets {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\yathe\\Documents\\JavaStuff\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		WebElement javaCheckBox = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/input[1]"));
		
		javaCheckBox.click();
		
		WebElement checkSelected = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/input"));
		
		System.out.println("Is check box selected ?: "+checkSelected.isSelected());
		
		WebElement deslectckbox = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/input[2]"));
		
		deslectckbox.click();
		
	}

}
