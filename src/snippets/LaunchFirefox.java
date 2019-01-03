package snippets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\yathe\\Documents\\JavaStuff\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/");
	}

}
