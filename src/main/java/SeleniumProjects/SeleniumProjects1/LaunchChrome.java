package SeleniumProjects.SeleniumProjects1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome 
{
public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADITYA\\Desktop\\JOB 2023\\SELENIUM END TO END\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
    }
}