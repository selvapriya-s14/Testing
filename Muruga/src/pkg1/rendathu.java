package pkg1;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.Dimension;
	import org.openqa.selenium.By;
public class rendathu {
	
	 
	public class webNavigation {
	 
		public static void main(String[] args) {
			String exePath = "C:\\Browserdrivers\\chromedriver-win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
	 
		  	//WebDriver driver = new ChromeDriver();
		  	//WebDriver driver1 = new FirefoxDriver();
			WebDriver driver2=new EdgeDriver();

	        driver2.get("https://www.amazon.in/");

	        String title = driver2.getTitle();
	        System.out.println("Title of the webpage: " + title);
	 
	        Dimension size = driver2.manage().window().getSize();
	        System.out.println("Default size of the browser window: " + size);
	 
	        // Get the current URL
	        String currentUrl = driver2.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);
	 
	        // Get the page source
	        String pageSource = driver2.getPageSource();
	 
	        // Perform some validation on the source code
	        // Example: Check if the page contains a specific keyword or element
	        if (pageSource.contains("Appliances")) {
	            System.out.println("Validation passed: Page contains expected text");
	        } else {
	            System.out.println("Validation failed: Page does not contain that text");
	        }
	 
	        // Close the browser
	        driver2.quit();
		}
	 
	}

}
