package FirstTest;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		
		//Popup
		driver.findElement(By.xpath("//input[@onclick='show_confirm()']")).click();
		Alert alert = driver.switchTo().alert();

		alert.accept();
		if (driver.getPageSource().contains("true")){
			System.out.println("success"
					+ "****************"
					+ "**********************************");
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		//propt(popup dont laquel on ecrit)
		driver.findElement(By.xpath("//input[@onclick='show_prompt()']")).click();
		Alert alert2 = driver.switchTo().alert();

		alert2.sendKeys("helo salah");
		
		alert2.accept();
		if (driver.getPageSource().contains("salah")){
			System.out.println("success2"
					+ "****************"
					+ "**********************************");
		}
		driver.quit();
		
	}

}
