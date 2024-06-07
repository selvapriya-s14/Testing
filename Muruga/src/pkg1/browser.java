package pkg1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser { 

	      public static void main(String[] args) throws InterruptedException {
	  		 String exePath = "C:\\Browserdrivers\\chromedriver-win32\\chromedriver.exe";
	  		 System.setProperty("webdriver.chrome.driver", exePath);
//		  	 WebDriver driver = new ChromeDriver();
		  	 WebDriver driver1 = new EdgeDriver();
		  	 driver1.get("https://www.google.co.in");
		  	 // driver.get("https://www.rediff.com");
		  	 Thread.sleep(3000);
		  	 driver1.quit();
	  	}
	}

