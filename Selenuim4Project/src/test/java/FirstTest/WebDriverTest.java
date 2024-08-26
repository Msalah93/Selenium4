package FirstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//utilisant webWebDriverManager (methode manuelle)
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//    	WebDriver driver = new ChromeDriver();
//		driver.get("https://www.selenium.dev/documentation/webdriver/getting_started/install_library/");
		
		//utilisant webWebDriverManager (methode auto)
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		//WebDriverManager.chromedriver().driverVersion("121.0.6167.85").setup();
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/getting_started/install_library/");

	}

}
