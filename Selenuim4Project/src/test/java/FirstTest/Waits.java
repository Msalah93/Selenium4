package FirstTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		//implicit waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://www.google.fr/");
		driver.findElement(By.id("L2AGLb")).click();

		driver.findElement(By.name("q")).sendKeys("automation step by step" + Keys.ENTER);
		
		//explicit waits
		WebDriverWait explicitwait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement myLink = explicitwait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Automation Step by Step: NEVER STOP LEARNING")));
		
		myLink.click();
		
		//fluent wait
		Wait<WebDriver> fluentWait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(300))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		WebElement myLink2 = fluentWait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Selenium 4 with Java")));
		myLink2.click();
		driver.quit();
	}
}
