package Test;

import java.awt.AWTException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Sample {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		//ExcelApiTest eat = new ExcelApiTest("C:\\Users\\BHPANI\\Desktop\\testdata.xlsx");

		System.setProperty("webdriver.ie.driver",

				"C:\\Users\\BHPANI\\Downloads\\IEDriverServer_Win32_2.48.0\\IEDriverServer.exe");
		// System.setProperty("webdriver.ie.driver","C:\\Users\\BHPANI\\Downloads\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();

		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);

		capabilities.setCapability("requireWindowFocus", true);

		WebDriver driver = new InternetExplorerDriver(capabilities);

		// NGELA HARUE KUBOTA BENAT

		// System.setProperty("webdriver.ie.driver","C:\\Users\\BHPANI\\Desktop\\IEDriverServer.exe");

		// driver =new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(
				"http://172.25.109.42:9080/prweb/PRServlet/beEBp4uRVTogorRwSwWqbOtn9IL2fwdI*/!STANDARD?pzPostData=1183258123");
		//String UserId = eat.getCellData("Credentials", "UserName", 2);
		//String Pwd = eat.getCellData("Credentials", "PassWord", 2);

		//driver.findElement(By.id("txtUserID")).sendKeys(UserId);
		//driver.findElement(By.id("txtPassword")).sendKeys(Pwd);
		waitForElement(driver, "//button[@id='sub']");

		Actions action1 = new Actions(driver);
		action1.moveToElement(driver.findElement(By.xpath("//button[@id='sub']"))).doubleClick().build().perform();

		waitForElement(driver, "(//img[@class='pzbtn-img'])[1]");
		// Thread.sleep(2000);

		driver.findElement(By.xpath("(//img[@class='pzbtn-img'])[1]")).click();
		waitForElement(driver, "//td[contains(.,'Seguro com Base em S6')]");
		WebElement web = driver.findElement(By.xpath("//td[contains(.,'Seguro com Base em S6')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(web).doubleClick().build().perform();
		// Thread.sleep(1000);
		driver.switchTo().frame("PWGadget1Ifr");
		// Thread.sleep(1000);
		waitForElement(driver, "//input[@id='PolicyNumber']");
		driver.findElement(By.xpath("//input[@id='PolicyNumber']")).sendKeys("BMGBZ0013036300");
		waitForElement(driver, "//input[@id='EventDate']");
		driver.findElement(By.xpath("//input[@id='EventDate']")).sendKeys("03/05/2013");
		// Thread.sleep(1000);
		waitForElement(driver, "//button[@class='pzhc']");
		// waitForLoad(driver);
		driver.findElement(By.xpath("//button[@class='pzhc']")).click();
		/*
		 * Thread.sleep(3000); WebElement
		 * element=driver.findElement(By.xpath("//button[@class='pzhc']"));
		 * actions.moveToElement(element).doubleClick().build().perform();
		 * Thread.sleep(1000);
		 */

		waitForElement(driver, "//tr[@class=' listTableRowStyle']/td[contains(.,'N707P66300')]");

		// Thread.sleep(2000);
		// waitForLoad(driver);
		Actions action = new Actions(driver);
		action.moveToElement(
				driver.findElement(By.xpath("//tr[@class=' listTableRowStyle']/td[contains(.,'N707P66300')]")))
				.doubleClick().build().perform();

		// waitForLoad(driver);
		waitForElement(driver, "//select[@name='$PPolicyPage$pProduct']");
		WebElement ele = driver.findElement(By.xpath("//select[@name='$PPolicyPage$pProduct']"));

		Select sel = new Select(ele);
		sel.selectByValue("BCF065");
		// Thread.sleep(2000);
		// waitForLoad(driver);
		// waitForElement(driver,"//select[@id='ScheduleOfBenefits']");
		waitmenthod1(driver, "//select[@id='ScheduleOfBenefits']");
		WebElement ele1 = driver.findElement(By.xpath("//select[@id='ScheduleOfBenefits']"));

		Select sel1 = new Select(ele1);
		sel1.selectByValue("0903");
		// waitForLoad(driver);
		// Thread.sleep(2000);
		waitForElement(driver, "//select[@id='SIS_CoverageCode']");
		WebElement ele2 = driver.findElement(By.xpath("//select[@id='SIS_CoverageCode']"));

		Select sel2 = new Select(ele2);
		sel2.selectByValue("20");
		// waitForLoad(driver);
		// Thread.sleep(2000);
		waitForElement(driver, "//select[@id='CoverageType']");
		WebElement ele3 = driver.findElement(By.xpath("//select[@id='CoverageType']"));

		Select sel3 = new Select(ele3);
		sel3.selectByValue("RC0001");
		// waitForLoad(driver);
		// Thread.sleep(2000);
		waitForElement(driver, "//input[@name='$PpyWorkPage$pOccupation']");
		driver.findElement(By.xpath("//input[@name='$PpyWorkPage$pOccupation']")).sendKeys("a");

		waitForLoad(driver);
		// Thread.sleep(1000);
		try {

			List<WebElement> listItems = driver.findElements(By.xpath("//table[@class='gridTable ']/tbody/tr"));
			// Thread.sleep(4000);

			listItems.get(7).click();
		} catch (Exception e) {

		}

		// waitForLoad(driver);
		waitForElement(driver, "//input[@id='ClaimedPersonalID']");
		driver.findElement(By.xpath("//input[@id='ClaimedPersonalID']")).click();

		// waitForLoad(driver);
		waitForElement(driver, "(//input[@name='$PpyWorkPage$pClaimedSameAsInsured'])[2]");
		driver.findElement(By.xpath("(//input[@name='$PpyWorkPage$pClaimedSameAsInsured'])[2]")).click();

		// Thread.sleep(2000);
		// waitForLoad(driver);
		waitForElement(driver, "//select[@id='ClaimedInsuredRelationship']");
		WebElement ele4 = driver.findElement(By.xpath("//select[@id='ClaimedInsuredRelationship']"));
		Select sel4 = new Select(ele4);
		sel4.selectByValue("Beneficiario");
		// waitForLoad(driver);
		waitForElement(driver, "//input[@id='CCRepClaimant_FullName']");
		driver.findElement(By.xpath("//input[@id='CCRepClaimant_FullName']")).click();

		// waitForLoad(driver);
		waitForElement(driver, "(//input[@name='$PpyWorkPage$pCCRepSameAsInsured'])[2]");
		driver.findElement(By.xpath("(//input[@name='$PpyWorkPage$pCCRepSameAsInsured'])[2]")).click();
		// Thread.sleep(1000);
		// waitForLoad(driver);
		waitForElement(driver, "//select[@id='CCRepClaimant_ProvinceCode']");
		WebElement ele5 = driver.findElement(By.xpath("//select[@id='CCRepClaimant_ProvinceCode']"));
		Select sel5 = new Select(ele5);
		sel5.selectByValue("20");
		// waitForLoad(driver);
		// Thread.sleep(1000);
		waitForElement(driver, "//input[@id='Description']");
		driver.findElement(By.xpath("//input[@id='Description']")).sendKeys("xyz");

		// Thread.sleep(1000);
		// waitForLoad(driver);
		waitForElement(driver, "//input[@id='SubClaimDescription']");
		driver.findElement(By.xpath("//input[@id='SubClaimDescription']")).sendKeys("abcde");
		// Thread.sleep(1000);
		// waitForLoad(driver);
		waitForElement(driver, "//select[@id='CauseCode']");
		WebElement ele6 = driver.findElement(By.xpath("//select[@id='CauseCode']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele6).build().perform();
		// Thread.sleep(1000);
		waitForLoad(driver);
		Select sel6 = new Select(ele6);

		sel6.selectByIndex(1);

		// waitForLoad(driver);
		waitForElement(driver, "//select[@id='SubClaimCode']");
		WebElement ele7 = driver.findElement(By.xpath("//select[@id='SubClaimCode']"));
		act.moveToElement(ele7).build().perform();
		// Thread.sleep(1000);
		waitForLoad(driver);
		Select sel7 = new Select(ele7);
		sel7.selectByIndex(1);
		waitForLoad(driver);
		waitForElement(driver, "//select[@id='ClaimType']");
		WebElement ele8 = driver.findElement(By.xpath("//select[@id='ClaimType']"));
		act.moveToElement(ele8).build().perform();
		Thread.sleep(1000);
		waitForLoad(driver);
		Select sel8 = new Select(ele8);
		sel8.selectByIndex(1);
		waitForLoad(driver);
		waitForElement(driver, "//select[@id='ContributingFactor']");
		WebElement ele10 = driver.findElement(By.xpath("//select[@id='ContributingFactor']"));
		act.moveToElement(ele10).build().perform();
		// Thread.sleep(1000);
		waitForLoad(driver);
		Select sel10 = new Select(ele10);
		sel10.selectByIndex(1);
		waitForLoad(driver);
		waitForElement(driver, "//select[@name='$PpyWorkPage$pCauseOfLoss']");
		WebElement ele9 = driver.findElement(By.xpath("//select[@name='$PpyWorkPage$pCauseOfLoss']"));
		act.moveToElement(ele9).build().perform();
		// Thread.sleep(1000);
		waitForLoad(driver);
		Select sel9 = new Select(ele9);
		sel9.selectByIndex(3);
		waitForLoad(driver);
		waitForElement(driver, "//select[@id='ConditionCode']");
		WebElement ele11 = driver.findElement(By.xpath("//select[@id='ConditionCode']"));
		act.moveToElement(ele11).build().perform();
		Thread.sleep(1000);
		waitForLoad(driver);
		Select sel11 = new Select(ele11);
		sel11.selectByIndex(1);
		// waitForLoad(driver);
		// Thread.sleep(1000);
		waitForElement(driver, "//button[contains(.,'With Out Claimkit')]");
		driver.findElement(By.xpath("//button[contains(.,'With Out Claimkit')]")).click();
		Thread.sleep(3000);
		WebElement web1 = driver.findElement(By.xpath("//a[contains(.,'CaseSetupOfFile')]"));
		Actions acti = new Actions(driver);
		acti.moveToElement(web1).doubleClick().build().perform();
		Thread.sleep(3000);
		WebElement ment = driver.findElement(By.xpath("(//button[@class='buttonTdButton'])[1]"));
		String str1 = ment.getText();
		System.out.println("====================>" + str1);

		Thread.sleep(1000);

		List<WebElement> frames1 = driver.findElements(By.tagName("iframe"));

		int frame1 = frames1.size();
		for (int i = 0; i < frame1; i++) {
			String names1 = frames1.get(i).getAttribute("name");
			System.out.println(frame1);
			System.out.println("=========>" + names1);
		}

		driver.switchTo().frame("actionIFrame");

		List<WebElement> listItems1 = driver.findElements(By.xpath("//input[@id='DocCheck']"));

		System.out.println("===================>" + listItems1.size());
		Thread.sleep(2000);

		for (int i = 0; i < listItems1.size(); i++) {
			try {

				Thread.sleep(1000);
				listItems1.get(i).click();

				Thread.sleep(2000);

			} catch (Exception e) {

			}

		}

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='submitButton']")).click();

		Thread.sleep(3000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame("PWGadget1Ifr");

		List<WebElement> frames = driver.findElements(By.tagName("iframe"));

		int frame = frames.size();
		for (int i = 0; i < frame; i++) {
			String names = frames.get(i).getAttribute("name");
			System.out.println(frame);
			System.out.println("================>" + names);
		}

		Thread.sleep(1000);

		driver.switchTo().frame("actionIFrame");

		new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(InvalidSelectorException.class);

		driver.findElement(By.id("ConfirmPolicyNumber")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//input[@id='ConfirmSISPolicyNumber'])[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='ConfirmEventDate']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='ConfirmEventDescription']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='ConfirmSISPolicyNumber'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("VerifyPotentialForRecoveryNo")).click();

		driver.findElement(By.id("CauseOfDeath")).sendKeys("accident");

		driver.findElement(By.id("CestaBasicaNo")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("$PpyWorkPage$pMedicalDiagnosis")).sendKeys("CARDIOPATIA NO ESPECIFICADA");

		driver.findElement(By.id("submitButton")).click();

		Thread.sleep(3000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame("PWGadget1Ifr");

		List<WebElement> frames2 = driver.findElements(By.tagName("iframe"));

		int frame2 = frames2.size();
		for (int i = 0; i < frame2; i++) {
			String names1 = frames2.get(i).getAttribute("name");
			System.out.println(frame2);
			System.out.println("================>" + names1);
		}

		Thread.sleep(1000);

		driver.switchTo().frame("actionIFrame");
		Thread.sleep(1000);
		driver.findElement(By.id("submitButton")).click();

		Thread.sleep(3000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame("PWGadget1Ifr");

		List<WebElement> frames3 = driver.findElements(By.tagName("iframe"));

		int frame3 = frames3.size();
		for (int i = 0; i < frame3; i++) {
			String names2 = frames3.get(i).getAttribute("name");
			System.out.println(frame3);
			System.out.println("================>" + names2);
		}

		Thread.sleep(1000);

		driver.switchTo().frame("actionIFrame");
		Thread.sleep(1000);

		waitForLoad(driver);
		Thread.sleep(2000);
		driver.findElement(By.id("NumberOfEvents")).sendKeys("1");

		WebElement type = driver.findElement(By.xpath("//select[@id='BenefitType']"));

		Select select = new Select(type);
		select.selectByValue("1");
		waitForLoad(driver);
		Thread.sleep(2000);
		driver.findElement(By.id("TotalClaimAmount")).sendKeys("300");
		Thread.sleep(2000);
		WebElement bentype = driver.findElement(By.xpath("//select[@id='BenificiaryType']"));

		Select select1 = new Select(bentype);
		select1.selectByValue("5");

		// driver.findElement(By.id("NumberOfEvents")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='iconInsert']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='IsSelectedBen']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("BENBeneficiaryName")).sendKeys("NGELA HARUE KUBOTA BENAT");
		Thread.sleep(1000);
		WebElement benrel = driver.findElement(By.xpath("//select[@id='BENRelationship']"));
		Thread.sleep(1000);
		Select select2 = new Select(benrel);
		select2.selectByValue("Titular");

		WebElement IndemnityTypeCode = driver.findElement(By.xpath("//select[@id='IndemnityTypeCode']"));
		Thread.sleep(2000);
		Select select3 = new Select(IndemnityTypeCode);
		select3.selectByValue("1");

		Thread.sleep(1000);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("PWGadget1Ifr");

		List<WebElement> frames4 = driver.findElements(By.tagName("iframe"));

		int frame4 = frames4.size();
		for (int i = 0; i < frame4; i++) {
			String names3 = frames4.get(i).getAttribute("name");
			System.out.println(frame4);
			System.out.println("================>" + names3);
		}

		Thread.sleep(1000);

		driver.switchTo().frame("actionIFrame");
		Thread.sleep(1000);
		// button[contains(.,'Search in SIS')]
		driver.findElement(By.xpath("//input[@class='Beneficiary Selection']")).click();
		Thread.sleep(1000);

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)

				.withTimeout(120, TimeUnit.SECONDS)

				.pollingEvery(10, TimeUnit.SECONDS)

				.ignoring(Exception.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {

				return driver.findElement(By.xpath("//label[contains(.,'OFAC Webservice is unavailable')]"));

			}
		});
		String str = driver.findElement(By.xpath("//label[contains(.,'OFAC Webservice is unavailable')]")).getText();

		System.out.println("====================>" + str);

	}

	public static void waitForElement(WebDriver driver, String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));

	}

	public static void waitForLoad(WebDriver driver) {
		ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		};
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(pageLoadCondition);
	}

	public static void waitmenthod(final String idvalue) {

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)

				.withTimeout(30, TimeUnit.SECONDS)

				.pollingEvery(5, TimeUnit.SECONDS)

				.ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {

				return driver.findElement(By.id(idvalue));

			}
		});

	}

	public static void waitmenthod1(WebDriver driver, final String Xpath) {

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)

				.withTimeout(120, TimeUnit.SECONDS)

				.pollingEvery(10, TimeUnit.SECONDS)

				.ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {

				WebElement element = driver.findElement(By.xpath(Xpath));
				if (element.getSize() == null) {
					System.out.println("FluentWait failed");
					return null;

				} else {
					return element;
				}
			}
		});

	}

	public static void waitmenthod3(String classNamevalue) {

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)

				.withTimeout(30, TimeUnit.SECONDS)

				.pollingEvery(5, TimeUnit.SECONDS)

				.ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {

				return driver.findElement(By.className("classNamevalue"));

			}
		});

	}

}
