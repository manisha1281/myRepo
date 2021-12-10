package PageTests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import PageElements.postMsgElements;
import Base.baseClass;

public class facebookPostMsg {
         
	public static void main(String[] args) {
		baseClass baseObj = new baseClass();
		System.setProperty("webdriver.chrome.driver", baseObj.getDriverPath());
		WebDriver d = new ChromeDriver();
		postMsgElements postObj = new postMsgElements();
		PageFactory.initElements(d, postObj);
		d.get(baseObj.getFacebookURL());
		d.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(15));
		postObj.loginTextBox.sendKeys(baseObj.getFacebookUsername());
		postObj.passwdTextBox.sendKeys(baseObj.getFacebookPassword());
		wait.until(ExpectedConditions.elementToBeClickable(postObj.submitLogin)).click();	
	    WebElement profile = wait.until(ExpectedConditions.visibilityOf(postObj.profileIcon));
		profile.click();
		WebElement textBoxPost = wait.until(ExpectedConditions.visibilityOf(postObj.postTextBoxMain));
		textBoxPost.click();
		wait.until(ExpectedConditions.elementToBeClickable(postObj.typePostText)).sendKeys("Its chilly here today!!");		
		wait.until(ExpectedConditions.elementToBeClickable(postObj.submitPost)).click();
	}

}
