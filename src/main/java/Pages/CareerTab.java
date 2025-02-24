package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Interactions;
import Locators.CareerTabLocators;

public class CareerTab {
	WebDriver driver;
	WebDriverWait wait;
	Actions action;
	CareerTabLocators locator;
    Interactions interact;
    
    public CareerTab(WebDriver driver) {
		if (driver == null) {
            throw new IllegalArgumentException("Driver must be set");
        }
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.action = new Actions(driver);
        this.locator = new CareerTabLocators();
        this.interact = new Interactions(driver);
	}
    
    public void HoverCareerBtn() {
		
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(locator.CareerTab));
		
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
    	}
	
    public void clickcareerTabbtn() {
		interact.clickElement(locator.CareerTab);
	}
    
    public void clickcurrentOpenningsLinktn() {
		interact.clickElement(locator.currentOpenningsLink);
	}
    
    public void clickjoinus() {
		interact.clickElement(locator.joinus);
	}
    
    public void clickknowmoreaboutus() {
		interact.clickElement(locator.knowmoreaboutus);
	}
    
    public void clickmoreaboutus() {
		interact.clickElement(locator.moreaboutus);
	}
    
    public void clickgetintouch() {
		interact.clickElement(locator.getintouch);
	}
    
    public void clickvideobtn() {
		interact.clickElement(locator.videobtn);
	}
    
    public void clickcontactus() {
		interact.clickElement(locator.contactus);
	}
    
    public void clickcontactuss() {
		interact.clickElement(locator.contactuss);
	}
    
    public void clickmorebtn() {
		interact.clickElement(locator.morebtn);
	}
    
    public void clickviewourjobopenings() {
		interact.clickElement(locator.viewourjobopenings);
	}
    
    public void clickjoinuscurrent() {
		interact.clickElement(locator.joinuscurrent);
	}
    
    public void clickQualityengineeringlead() {
		interact.clickElement(locator.Qualityengineeringlead);
	}
    public void clickQualityengineeringleadAN() {
		interact.clickElement(locator.QualityengineeringleadAN);
	}
    
    public void clickQualityengineeringlead2() {
		interact.clickElement(locator.Qualityengineeringlead2);
	}
    public void clickQualityengineeringlead2AN() {
		interact.clickElement(locator.Qualityengineeringlead2AN);
	}
    
    public void clickQualityengineeringleadSTE() {
		interact.clickElement(locator.QualityengineeringleadSTE);
	}
    public void clickQualityengineeringleadSTEAN() {
		interact.clickElement(locator.QualityengineeringleadSTEAN);
	}
    
    public void clickSeniorQEDataTesting() {
		interact.clickElement(locator.SeniorQEDataTesting);
	}
    public void clickSeniorQEDataTestingAN() {
		interact.clickElement(locator.SeniorQEDataTestingAN);
	}
    
    public void clickQELead() {
		interact.clickElement(locator.QELead);
	}
    public void clickQELeadAN() {
		interact.clickElement(locator.QELeadAN);
	}
    
    public void clickSAPSDFunctionalConsultant() {
		interact.clickElement(locator.SAPSDFunctionalConsultant);
	}
    public void clickSAPSDFunctionalConsultantAN() {
		interact.clickElement(locator.SAPSDFunctionalConsultantAN);
	}
    
    public void clickSeniorNet() {
		interact.clickElement(locator.SeniorNet);
	}
    public void clickSeniorNetAN() {
		interact.clickElement(locator.SeniorNetAN);
	}
    public void clickQELeadArchitectIndia() {
		interact.clickElement(locator.QELeadArchitectIndia);
	}
    public void clickQELeadArchitectIndiaAN() {
		interact.clickElement(locator.QELeadArchitectIndiaAN);
	}
    
    public void clickPerformanceTesterIndia() {
		interact.clickElement(locator.PerformanceTesterIndia);
	}
    public void clickPerformanceTesterIndiaAN() {
		interact.clickElement(locator.PerformanceTesterIndiaAN);
	}

    public void clickDataSciMLEngIndia() {
		interact.clickElement(locator.DataSciMLEngIndia);
	}
    public void clickDataSciMLEngIndiaAN() {
		interact.clickElement(locator.DataSciMLEngIndiaAN);
	}
    
    public void clickSeniorQualityAutomationEngineer() {
		interact.clickElement(locator.SeniorQualityAutomationEngineer);
	}
    public void clickSeniorQualityAutomationEngineerAN() {
		interact.clickElement(locator.SeniorQualityAutomationEngineerAN);
	}
    
    public void clickSeniorQualityEngineerIndia() {
		interact.clickElement(locator.SeniorQualityEngineerIndia);
	}
    public void clickSeniorQualityEngineerIndiaAN() {
		interact.clickElement(locator.SeniorQualityEngineerIndiaAN);
	}
    
    public void clickAzureDeveloperIndia() {
		interact.clickElement(locator.AzureDeveloperIndia);
	}
    public void clickAzureDeveloperIndiaAN() {
		interact.clickElement(locator.AzureDeveloperIndiaAN);
	}
}
