package snippets;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonSnippets {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\yathe\\Documents\\JavaStuff\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		// get the position of a button
		WebElement btnpos = driver.findElement(By.xpath("//*[@id=\'position\']"));
		Point point = btnpos.getLocation();
		System.out.println("The position of the button is : x-"+point.x+"y-"+point.y);
		
		// get button color 
		WebElement btncolor = driver.findElement(By.xpath("//*[@id=\'color\']"));
		System.out.println("The color of the button is :"+btncolor.getCssValue("background-color"));
		
		// get width and height of a button
		WebElement btndims = driver.findElement(By.xpath("//*[@id=\'size\']"));
		System.out.println("Height :"+ btndims.getSize().getHeight());
		System.out.println("Width :"+ btndims.getSize().getWidth());
		
		// click on the button
		WebElement btnclick = driver.findElement(By.xpath("//*[@id=\'home\']"));
		btnclick.click();
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}

}
