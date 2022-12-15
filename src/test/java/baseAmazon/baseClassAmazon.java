package baseAmazon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseClassAmazon {
	
	
	public static Properties prop = new Properties();
	public static WebDriver driver;
	
	//Constructor Initialized
	
	public baseClassAmazon() {
		
		//step 2 Create File Input Class to read from Config File
		
		
		try {
			String Path ="D:\\QA COURSE\\JavaTest\\ProjectAmazon\\src\\test\\java\\EnvironmentVariable\\Config.properties";
				FileInputStream f1 = new FileInputStream(Path);
				prop.load(f1); // Reading file 
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException a) {
			a.printStackTrace();
			
		}
} //End of Constructor

			
	//Method for Initialization 
	
	
	//Common Method for Code 
	
	
		public static void initiation() {
			
			
			//Reading Property form Config File
			
			String browserName= prop.getProperty("browser");
			
			
			
			//Checking Browser Name 
			
			if(browserName.equals("Firefox")) {
				System.setProperty("webdriver.gecko.driver","geckodriver.exe");
				driver = new FirefoxDriver();
			}
					else if(browserName.equals("Chrome")){
						System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
						driver = new ChromeDriver();
					}
					
					
											else{
												System.out.println("Invalid Browser");
											}
					
			
			//Maximizing Window
			
			driver.manage().window().maximize();
			
			//Setting Time for Page Load
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			
			
			
			
			//Implicit Wait
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			
		}
		
		//Method for open Amazon Registration  Url
				public static void getRegisterUrl() {
					driver.get(prop.getProperty("urlRegistration"));
				}
		
				//Method for open Amazon Registration  Url
				public static void getLoginUrl() {
					driver.get(prop.getProperty("urlLogin"));
				}
				
				public void watExplicit() {
					
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
					wait.until(ExpectedConditions.elementToBeClickable(By.id("Login")));
					driver.findElement(By.id("Login")).click();
				}


		

}


