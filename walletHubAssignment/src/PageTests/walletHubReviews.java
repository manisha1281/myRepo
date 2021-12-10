package PageTests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.baseClass;
import PageElements.walletHubElements;
import net.jodah.failsafe.internal.util.Assert;

public class walletHubReviews {

	public static void main(String[] args) throws InterruptedException {
		
		baseClass baseObj = new baseClass();
		System.setProperty("webdriver.chrome.driver", baseObj.getDriverPath());
		WebDriver d = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(20));
		walletHubElements WHObj = new walletHubElements();
		PageFactory.initElements(d, WHObj);
		d.get(baseObj.getWallethubURL());
		d.manage().window().maximize();
		WHObj.login.click();
		WHObj.loginTextBox.sendKeys(baseObj.getWalletHubUsername());
		WHObj.passwdTextBox.sendKeys(baseObj.getWalletHubPassword());
		WHObj.submitLogin.click();
    	wait.until(ExpectedConditions.visibilityOf(WHObj.reviewsTab)).click();
	    Actions actn = new Actions(d);
		System.out.println("Please provide your feedback by rating");
		System.out.println(WHObj.stars.size());
		int i = 0;
		for(WebElement e : WHObj.stars)
		{			
			actn.moveToElement(e).build().perform();
			i++;
			if(i==4) {
				actn.click(e).build().perform();
				break;}		
		}
		
		WHObj.reviewDropdown.click();
		WebElement HealthInsurancePolicy = d.findElement(By.cssSelector("#reviews-section > modal-dialog > div > div > write-review > div > ng-dropdown > div > ul > li:nth-child(2)"));
		HealthInsurancePolicy.click();
		wait.until(ExpectedConditions.elementToBeClickable(WHObj.reviewtextArea)).sendKeys("Wallethub helped me in not only getting my credit report immediately,but to analyse my finances and choose one of the great health insurance policies.");
		WHObj.reviewSubmit.click();
        d.get("https://wallethub.com/profile/13732055i");
		wait.until(ExpectedConditions.visibilityOf(WHObj.reviewsTab)).click();
        String myLoginId = WHObj.reviewAccordian.findElement(By.xpath("//*[@id=\"reviews-section\"]/section/article[1]/div[2]/div[2]/span[2]")).getText();
        assert baseObj.getWalletHubUsername().contains(myLoginId);
        System.out.println(" Yes my review is visible on Wallethub ");

		
	}

}
