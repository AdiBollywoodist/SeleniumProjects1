package SeleniumProjects.SeleniumProjects1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox 
{
public static void main( String[] args )
    {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADITYA\\Desktop\\JOB 2023\\SELENIUM END TO END\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.google.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.quit();
    }
}