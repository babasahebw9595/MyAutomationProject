import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	
		
		public static void main(String[] args) throws InterruptedException {
			
			//1.to launch the browser
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.google.com/");
		}
}
