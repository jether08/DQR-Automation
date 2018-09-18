import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.server.handler.WebElementHandler
import org.openqa.selenium.WebElement

CustomKeywords.'utility.ValidLogin.Level4Login'()


WebDriver driver = DriverFactory.getWebDriver()

WebUI.delay(10)

WebElement iframe = (driver.findElement(By.tagName("iframe")));
driver.switchTo().frame(iframe)


/*int size = (driver.findElements(By.tagName('iframe'))).size();
System.out.println(size);

String tagname = (driver.findElements(By.tagName('iframe')));

	System.out.println(tagname);

WebUI.delay(5)

//driver.switchTo().frame(0);

//driver.findElement(By.xpath("//*[@id='chart-trigger-content-1']"))
//System.out.println("test");*/



