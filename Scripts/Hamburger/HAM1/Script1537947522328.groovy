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
//import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.logging.KeywordLogger

//Call Login custom keyword
CustomKeywords.'utility.ValidLogin.Level0Login'()

WebUI.delay(10)

//Initializing webdriver script
WebDriver driver = DriverFactory.getWebDriver()

//Click Hamburger Icon
WebUI.click(findTestObject('trade.html/Hamburger Menu'))


driver.findElement(By.xpath("//*[contains(text(), 'Sign Out')]")).click()


WebUI.navigateToUrl('https://test.dqr-private.com/trade.html')


WebUI.click(findTestObject('trade.html/Hamburger Menu'))

WebUI.verifyElementPresent(findTestObject('SideMenuBar/OpenSideMenu'), 5, FailureHandling.STOP_ON_FAILURE)


println('Side Menu is Open Successfuly')




