//Demonstration of list of the browser command user in webdriver

package com.command.sl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommand {

	//Declare static variable
	static String path = System.getProperty("user.dir");
	static WebDriver driver; //Web-driver is interface
	
	//Main method
	
	public static void main(String args[])
	{
		//Instantiate chrome browser
		
         System.setProperty("webdriver.chrome.driver", path+"//Browser//chromedriver.exe");
         driver = new ChromeDriver();//Using driver ref var create object of chromedriver class
         
         //Launch website using get method
          // driver.get("https://www.google.com");
        
        //Launch website using navigate method
           driver.navigate().to("https://www.google.com");
           
         //get the Title of the webpage
           String PageTitle = driver.getTitle();
           System.out.println(PageTitle);
           
         //Length of the PageTitle
           int pageTitleLength = driver.getTitle().length();
           System.out.println(pageTitleLength);
           
         //Get the current page url
           String currentPageURL = driver.getCurrentUrl();
           System.out.println(currentPageURL);
           
         //Close browser
           driver.close();
           
	}
	
}
