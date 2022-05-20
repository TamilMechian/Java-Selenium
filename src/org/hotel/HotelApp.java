package org.hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelApp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\test\\eclipse-workspace\\AdactinHotel\\Driver\\chromedriver.exe");
		WebDriver app = new ChromeDriver();
		app.get(" http://adactinhotelapp.com/");
		String title = app.getTitle();
		System.out.println(title);
		String currentUrl = app.getCurrentUrl();
		System.out.println(currentUrl);
		WebElement findElement = app.findElement(By.xpath("//input[@name='username']"));
		findElement.sendKeys("krishna");
		WebElement findElement2 = app.findElement(By.xpath("//input[@name='password']"));
		findElement2.sendKeys("7654311");
		
	}

}
