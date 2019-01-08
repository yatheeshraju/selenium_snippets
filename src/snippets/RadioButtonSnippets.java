package snippets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonSnippets {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\yathe\\Documents\\JavaStuff\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/radio.html");

		// select an option in radio button

		WebElement radioButton = driver.findElement(By.xpath("//*[@id=\'yes\']"));
		radioButton.click();

		// find which element is checked
		List<WebElement> radiobtns = driver.findElements(By.name("news"));
		for (WebElement webElement : radiobtns) {
			System.out.println(webElement.getText() + ":" + webElement.isSelected());
		}

		// check if an element is selected else select it 
		List<WebElement> radiobtnage = driver.findElements(By.name("age"));
		for (int i=0;i<radiobtnage.size();i++ ) {
			if(radiobtnage.get(i).getAttribute("value").equals("0")&&!radiobtnage.get(i).isSelected()){
				radiobtnage.get(i).click();
			}
		}

	}

}
