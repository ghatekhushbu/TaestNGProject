package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	
	public void browserIntialisation() throws IOException {
		//to read properties files
		FileInputStream fis=new FileInputStream("C:\\Users\\kghate\\eclipse-workspace\\SeleniupTestNGProject\\src\\main\\java\\Resources\\data.properties");
	
		//to access properties file
		Properties prop=new Properties();
		prop.load(fis);
	
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			
              WebDriver driver=new ChromeDriver();
              
              
		} else if(browserName.equalsIgnoreCase("Firefox")) {
			//firefoxcode
		} else {
			System.out.println("please enter valid browsername");
		}
	}
}
