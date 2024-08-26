package FirstTest;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		// localiser un élément
//		driver.get("https://www.google.fr/");
//		driver.manage().window().maximize();
//
//		WebElement button = driver.findElement(By.id("W0wltc"));
//		button.click();
//		Thread.sleep(1000);
//		WebElement searchBox = driver.findElement(By.id("APjFqb"));
//		searchBox.sendKeys("abc", Keys.ENTER);
//		Thread.sleep(3000);

		// localiser des éléments
//		driver.navigate().to("https://trytestingthis.netlify.app/");
//		List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
//		for (WebElement element : options) {
//			System.out.println(element.getText());
//		}
//		Thread.sleep(2000);
//		driver.close();
//
		driver.navigate().to("https://www.ebay.fr/");
		//driver.findElement(By.cssSelector(".vl-popular-destinations--evo-v1__name")).click();
		//driver.findElement(By.linkText("Reconditionné")).click();
		
		//relative Locators
		WebElement lien = driver.findElement(By.linkText("Reconditionné"));
		driver.findElement(RelativeLocator.with(By.tagName("h3")).toLeftOf(lien)).click();

		Thread.sleep(2000);
		//driver.close();
		
		
		//get element from element
		driver.navigate().to("https://www.google.fr/");
		WebElement searchForm = driver.findElement(By.tagName("form"));
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("selenuim");


	}

}
