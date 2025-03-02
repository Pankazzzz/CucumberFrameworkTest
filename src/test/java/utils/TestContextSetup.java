package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {

	public WebDriver driver;
	public String landingPageProductName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;

	public TestContextSetup() throws IOException
	{
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		genericUtils = new GenericUtils(testBase.WebDriverManager());
	}
	
}


//Cucumber-Picocontainer dependency is used for Dependency injection 
//Whenever any @TWAG is called, picoconatiner initializes this file and return the object to the constructor of the step defination file