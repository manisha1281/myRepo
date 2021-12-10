package Base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {
	   
		protected static WebDriver d;
		File prop = new File("C:\\Users\\manisha\\eclipse-workspace\\walletHubAssignment\\Config\\ConfiguratnFacebook.properties");
		File propWalletHub = new File("C:\\Users\\manisha\\eclipse-workspace\\walletHubAssignment\\Config\\ConfiguratnWalletHub.properties");

		Properties props, propsWalletHub;
		public baseClass() {
		try {
			
			FileReader fileObj = new FileReader(prop);	
			FileReader fileObjWalletHub = new FileReader(propWalletHub);
			BufferedReader propFile = new BufferedReader(fileObj);
			BufferedReader propFileWH = new BufferedReader(fileObjWalletHub);
			props = new Properties();
			propsWalletHub = new Properties();
    	try {
    		props.load(propFile);
    		propFile.close();
    		propsWalletHub.load(propFileWH);
    		propFileWH.close();
    	}
        catch(IOException e) {
			e.printStackTrace();
		}
		}
    	catch(FileNotFoundException e ) {
    		e.printStackTrace();   		
    	}
		
		}
		public String getDriverPath() {
			 String driverPath = props.getProperty("driverPath");
			 if(driverPath!=null)
				 return driverPath;
			 else
				 throw new RuntimeException("driverPath is not available");
				
			}
		 
		
		public String getFacebookURL() {
			 String url = props.getProperty("urlFacebook");
			 if(url!=null)
				 return url;
			 else
				 throw new RuntimeException("url is not available");
				
			}
			
		public String getWallethubURL() {
			 String url = propsWalletHub.getProperty("url");
			 if(url!=null)
				 return url;
			 else
				 throw new RuntimeException("url is not available");
				
			}
		public String getFacebookUsername() {
			 String username = props.getProperty("username");
			 if(username!=null)
				 return username;
			 else
				 throw new RuntimeException("url is not available");
				
			}
		
		public String getFacebookPassword() {
			 String password = props.getProperty("password");
			 if(password!=null)
				 return password;
			 else
				 throw new RuntimeException("url is not available");
				
			}	
		
		public String getWalletHubUsername() {
			 String username = propsWalletHub.getProperty("username");
			 if(username!=null)
				 return username;
			 else
				 throw new RuntimeException("url is not available");
				
			}
		
		public String getWalletHubPassword() {
			 String password = propsWalletHub.getProperty("password");
			 if(password!=null)
				 return password;
			 else
				 throw new RuntimeException("url is not available");
				
			}		
		
		
		public  WebDriver setUp() {
			System.setProperty("webdriver.chrome.driver", getDriverPath());
			d = new ChromeDriver();
			return d;
		}

}
