package PageElements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class walletHubElements {
	
	@FindBy(xpath="//*[@id=\"web-app\"]/header/div/nav[1]/span")
	public WebElement login;
	
	@FindBy(xpath="//*[@id=\"email\"][@name=\"em\"]")
	public WebElement loginTextBox;
	
	@FindBy(xpath="//*[@id=\"password\"][@name=\"pw\"]")
	public WebElement passwdTextBox;
	
	@FindBy(xpath= "//*[@id=\"join-login\"]/form/div[4]/button[2]/span")
	public WebElement submitLogin;
	
	@FindBy(xpath="//*[@id=\"scroller\"]/main/div[1]/nav/div[2]/a[2]/span[2][contains(text(),'Reviews')]")
	public WebElement reviewsTab;
	
	@FindBy(css="#reviews-section > div.review-stat-box > div.rv.review-action.ng-enter-element > review-star > div > svg")
	public List<WebElement>  stars;
	
	@FindBy(css="#reviews-section > div.review-stat-box > div.rv.review-action.ng-enter-element > review-star > div > svg:nth-child(1)")
	public WebElement star;	
	
	@FindBy(xpath="//*[@id=\"reviews-section\"]/modal-dialog/div/div/write-review/div/ng-dropdown/div/span[1]")
	public WebElement reviewDropdown;
	
	@FindBy(css="#reviews-section > modal-dialog > div > div > write-review > div > ng-dropdown > div > ul > li:nth-child(2)")
	public WebElement HealthInsurancePolicy;
	
	@FindBy(xpath="//*[@id=\"reviews-section\"]/modal-dialog/div/div/write-review/div/div[1]/textarea")
	public WebElement reviewtextArea;
	
	@FindBy(xpath="//*[@id=\"reviews-section\"]/modal-dialog/div/div/write-review/sub-navigation/div/div[2][contains(text(),\"Submit\")]")
	public WebElement reviewSubmit;
	
	@FindBy(xpath="//*[@id=\"reviews-section\"]/section/article[1]")
	public WebElement reviewAccordian;
	
	@FindBy(xpath="//*[@id=\"reviews-section\"]/section/article[1]/div[2]/div[2]/span[2]")
	public WebElement reviewUserId;
	
	@FindBy(xpath="//*[@id=\"reviews-section\"]/section/article[1]/div[2]/div[2]/span[2]")
	public WebElement myEmailAddr;

}
