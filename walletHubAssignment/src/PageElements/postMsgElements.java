package PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class postMsgElements {

		WebDriver d;
		
		@FindBy(xpath="//*[@id='email']")
		public WebElement loginTextBox;
		
		@FindBy(id="pass")
		public WebElement passwdTextBox;
		
		@FindBy(xpath="//*[@name='login'][@type='submit']")
	    public WebElement submitLogin;
				
		@FindBy(xpath="//div[1]/div/div[1]/div/div[2]/div[4]/div[1]/div[4]/a/span/span")
	    public WebElement profileIcon;
		
		@FindBy(xpath="//*[@data-pagelet='ProfileComposer']/div/div/div/div/div/div/div/span")
	    public WebElement postTextBoxMain;		

		@FindBy(xpath="//form/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div/div/div[2]/div/div/div/div")
	    public WebElement typePostText;
		
		@FindBy(xpath="//form/div/div[1]/div/div/div/div[3]/div[2]/div/div/div[1]/div/span/span")
		public WebElement submitPost;
	
	/*	public postMsgElements() {
		PageFactory.initElements(d, this);  //no need of this constructor or with WebDriver parameter passed
		}*/
		
		

}
