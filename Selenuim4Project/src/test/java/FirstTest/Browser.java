package FirstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
   	      WebDriver driver = new ChromeDriver();
   	      
   	      //open a web page
   	      driver.get("https://translate.google.fr/");
   	      String originalwindow =driver.getWindowHandle();
   	      
   	      driver.navigate().to("https://stackoverflow.com/");
   	     driver.switchTo().newWindow(WindowType.WINDOW);
  	      Thread.sleep(1000);

   	      driver.switchTo().window(originalwindow);
   	      driver.switchTo().newWindow(WindowType.TAB);
   	     
   	      System.out.println(driver.getTitle());
   	      System.out.println(driver.getCurrentUrl());
   	      //driver.close();
   	     // driver.quit();
   	      
   	      //foward | back | refresh
//   	      driver.navigate().back();
//   	      driver.navigate().forward();
//   	      driver.navigate().refresh();
	}

}
