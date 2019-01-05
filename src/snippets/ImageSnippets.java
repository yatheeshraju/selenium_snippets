package snippets;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageSnippets {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\yathe\\Documents\\JavaStuff\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		
		// broken image link
		WebElement brokenImg = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/img"));
		System.out.println("Is image broken : "+ isLinkBroken(brokenImg.getAttribute("src")));
		
		// click on image 
		WebElement imagelink = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/img"));
		//imagelink.click();
		
		
		WebElement imgLink2 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/img"));
		imgLink2.click();

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
