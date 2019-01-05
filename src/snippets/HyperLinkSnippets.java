package snippets;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HyperLinkSnippets {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\yathe\\Documents\\JavaStuff\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		
		// get href 
		WebElement linkLocation = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/a"));
		System.out.println("href location : "+linkLocation.getAttribute(("href")));
		
		// check if a link is broken
		WebElement brokenLink = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/a"));
		System.out.println("Is Link Broken : "+isLinkBroken(brokenLink.getAttribute("href")));
		
		// find all links in page
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Total Links : "+ list.size());
		
		// navigate by clicking on link
		WebElement linkName = driver.findElement(By.linkText("Go to Home Page"));
		linkName.click();
		
		//driver.quit();

	}
	
	public static boolean isLinkBroken(String urllink) {
	
		boolean status=false;
		URL url;
		try {
			url = new URL(urllink);
		
		HttpURLConnection httpUrlConnection = (HttpURLConnection)url.openConnection();
		httpUrlConnection.setConnectTimeout(3000);
		httpUrlConnection.connect();
		if(httpUrlConnection.getResponseCode()==200)
        {
        status= false;
        }else if(httpUrlConnection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
        {
        status= true;	 
        }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status; 
	}
	

}
