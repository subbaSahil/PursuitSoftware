package Test1.testing1;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Helper.BaseTest;
import Helper.Interactions;
import Pages.CareerTab;

public class CareerTabTest extends BaseTest {
	
	public void initialTest() {
		CareerTab ct = new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcareerTabbtn());
	}
	@Test(priority = 1)
	public void TC_001_Validate_Career_Button_Click_() {
		CareerTab ct= new CareerTab(driver);	
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ct.clickcareerTabbtn());
	}
	@Test(priority = 2)
	public void TC_002_Validate_currentOpenings_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.pursuitsoftware.com/current-openings/");
	}
	@Test(priority = 3)
	public void TC_003_Validate_joinus_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickjoinus());
		Assert.assertEquals(driver.getTitle(), "Join Us - Pursuit Software");
	}
	@Test(priority = 5)
	public void TC_004_Validate_knowmoreaboutus_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickjoinus());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickknowmoreaboutus());
//		Assert.assertEquals(driver.getTitle(), "Join Us - Pursuit Software");
	}
	@Test(priority = 6)
	public void TC_006_Validate_moreaboutus_Button_Click_() {
		CareerTab ct= new CareerTab(driver);	
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ct.clickcareerTabbtn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickmoreaboutus());
	}
	@Test(priority = 7)
	public void TC_007_Validate_getintouch_Button_Click_() {
		CareerTab ct= new CareerTab(driver);	
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ct.clickcareerTabbtn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickgetintouch());
	}
	@Test(priority = 8)
	public void TC_008_Validate_videobtn_Button_Click_() {
		CareerTab ct= new CareerTab(driver);	
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ct.clickcareerTabbtn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickvideobtn());
	}
	@Test(priority = 9)
	public void TC_009_Validate_contactus_Button_Click_() {
		CareerTab ct= new CareerTab(driver);	
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ct.clickcareerTabbtn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickcontactus());
	}
	@Test(priority = 10)
	public void TC_009_Validate_contactuss_Button_Click_() {
		CareerTab ct= new CareerTab(driver);	
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ct.clickcareerTabbtn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickcontactuss());
	}
	@Test(priority = 11)
	public void TC_009_Validate_more_Button_Click_() {
		CareerTab ct= new CareerTab(driver);	
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ct.clickcareerTabbtn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickmorebtn());
	}
	@Test(priority = 12)
	public void TC_0012_Validate_viewourjobopenings_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		interact.executeWithDelay(() -> ct.clickviewourjobopenings());		
	}
	@Test(priority = 13)
	public void TC_0013_Validate_joinuscurrent_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickjoinuscurrent());
	}
	@Test(priority = 14)
	public void TC_0014_Validate_Qualityengineeringlead_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickQualityengineeringlead());	
	}
	@Test(priority = 15)
	public void TC_0015_Validate_QualityengineeringleadAN_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickQualityengineeringlead());
		interact.executeWithDelay(() -> ct.clickQualityengineeringleadAN());	
	}
	@Test(priority = 16)
	public void TC_0016_Validate_Qualityengineeringlead2_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickQualityengineeringlead2());
	}
	@Test(priority = 17)
	public void TC_0017_Validate_Qualityengineeringlead2AN_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickQualityengineeringlead2());
		interact.executeWithDelay(() -> ct.clickQualityengineeringlead2AN());
	}
	@Test(priority = 18)
	public void TC_0018_Validate_QualityengineeringleadSTE_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickQualityengineeringleadSTE());
	}
	@Test(priority = 19)
	public void TC_0019_Validate_QualityengineeringleadSTEAN_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickQualityengineeringleadSTE());
		interact.executeWithDelay(() -> ct.clickQualityengineeringleadSTEAN());

	}
	
	@Test(priority = 20)
	public void TC_0020_Validate_clickSeniorQEDataTesting_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickSeniorQEDataTesting());
	}
	@Test(priority = 21)
	public void TC_0021_Validate_clickSeniorQEDataTestingAN_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickSeniorQEDataTesting());
		interact.executeWithDelay(() -> ct.clickSeniorQEDataTestingAN());
	}
	@Test(priority = 22)
	public void TC_0022_Validate_QELead_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickQELead());
	}
	@Test(priority = 23)
	public void TC_0023_Validate_QELeadAN_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickQELead());
		interact.executeWithDelay(() -> ct.clickQELeadAN());
	}
	@Test(priority = 24)
	public void TC_0024_Validate_SAPSDFunctionalConsultant_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickSAPSDFunctionalConsultant());
	}
	@Test(priority = 25)
	public void TC_0025_Validate_SAPSDFunctionalConsultantAN_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickSAPSDFunctionalConsultant());
		interact.executeWithDelay(() -> ct.clickSAPSDFunctionalConsultantAN());
	}
	@Test(priority = 26)
	public void TC_0026_Validate_SeniorNet_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickSeniorNet());
	}
	@Test(priority = 27)
	public void TC_0027_Validate_SeniorNetAN_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickSeniorNet());
		interact.executeWithDelay(() -> ct.clickSeniorNetAN());
	}
	@Test(priority = 28)
	public void TC_0028_Validate_QELeadArchitectIndia_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickQELeadArchitectIndia());
	}
	@Test(priority = 29)
	public void TC_0029_Validate_QELeadArchitectIndiaAN_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickQELeadArchitectIndia());
		interact.executeWithDelay(() -> ct.clickQELeadArchitectIndiaAN());
	}
	@Test(priority = 30)
	public void TC_0030_Validate_PerformanceTesterIndia_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickPerformanceTesterIndia());
	}
	
	@Test(priority = 31)
	public void TC_0031_PerformanceTesterIndiaAN_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickPerformanceTesterIndia());
		interact.executeWithDelay(() -> ct.clickPerformanceTesterIndiaAN());
	}
	
	@Test(priority = 32)
	public void TC_0032_DataSciMLEngIndia_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickDataSciMLEngIndia());
	}
	
	@Test(priority = 33)
	public void TC_0033_DataSciMLEngIndiaAN_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickDataSciMLEngIndia());
		interact.executeWithDelay(() -> ct.clickDataSciMLEngIndiaAN());
	}
	
	@Test(priority = 34)
	public void TC_0034_clickSeniorQualityAutomationEngineer_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickSeniorQualityAutomationEngineer());
	}
	
	@Test(priority = 35)
	public void TC_0035_clickSeniorQualityAutomationEngineerAN_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickSeniorQualityAutomationEngineer());
		interact.executeWithDelay(() -> ct.clickSeniorQualityAutomationEngineerAN());
	}
	
	@Test(priority = 36)
	public void TC_0036_clickSeniorQualityEngineerIndia_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickSeniorQualityEngineerIndia());
	}
	
	@Test(priority = 37)
	public void TC_0037_clickSeniorQualityEngineerIndiaAN_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickSeniorQualityEngineerIndia());
		interact.executeWithDelay(() -> ct.clickSeniorQualityEngineerIndiaAN());
	}
	@Test(priority = 38)
	public void TC_0038_clickAzureDeveloperIndia_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickAzureDeveloperIndia());
		interact.executeWithDelay(() -> ct.clickSeniorQualityEngineerIndiaAN());
	}
	
	@Test(priority = 39)
	public void TC_0039_clickAzureDeveloperIndiaAN_Button_Click_() {
		CareerTab ct= new CareerTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.HoverCareerBtn());
		interact.executeWithDelay(() -> ct.clickcurrentOpenningsLinktn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickAzureDeveloperIndia());
		interact.executeWithDelay(() -> ct.clickAzureDeveloperIndiaAN());
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}

}
