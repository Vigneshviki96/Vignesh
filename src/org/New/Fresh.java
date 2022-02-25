package org.New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fresh {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\Auto\\Driver\\chromedriver.exe");
	WebDriver driv=new ChromeDriver();
	driv.get("https://www.facebook.com/");
	
}
}
