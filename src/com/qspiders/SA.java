package com.qspiders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SA {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
FirefoxDriver driver=new FirefoxDriver();
driver.get("http://localhost/login.do");

	}

}
