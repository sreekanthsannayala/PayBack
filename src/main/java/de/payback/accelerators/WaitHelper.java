package de.payback.accelerators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class WaitHelper {
	private WebDriver driver;
	public WaitHelper(WebDriver driver)
	{
			//this.driver=(AppiumDriver)driver;
		this.driver=driver;
	}
	

	public WebElement waitFor(WebElement elem){
		Wait wait = new FluentWait(this.driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);

		WebElement foo = (WebElement) wait.until(new Function<WebDriver, WebElement>()
		{
			public WebElement apply(WebDriver driver) {
				return elem;
			}
		});
		return foo;
	}

	public WebElement waitFor(By loc){
		Wait wait = new FluentWait(this.driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);

		WebElement foo = (WebElement) wait.until(new Function<WebDriver, WebElement>()
		{
			public WebElement apply(WebDriver driver) {
				return driver.findElement(loc);
			}
		});
		return foo;
	}
}


