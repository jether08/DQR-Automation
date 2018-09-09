import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import com.kms.katalon.core.webui.driver.DriverFactory
import java.awt.Robot
import java.awt.event.KeyEvent
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


//Open the browser
WebUI.openBrowser('http://apsite-staging.hidora.com/registration.html')

WebUI.waitForPageLoad(10)

//Initializing webdriver script
WebDriver driver = DriverFactory.getWebDriver()

//Method to Open new tab in same browser
Robot robot = new Robot()

robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_T);
robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyRelease(KeyEvent.VK_T);

//Switch focus to new tab
ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(tabs.get(1));

//Launch URL in the new tab
driver.get("https://temp-mail.org/en/");

//Get Email address generated in temp-mail
IDmail = WebUI.getAttribute(findTestObject('Registration/IDmail'),'value')

//Print generated email address
println(IDmail)

WebUI.refresh()

WebUI.delay(3)

//Switch back to DQRX registration page
WebUI.switchToWindowUrl('http://apsite-staging.hidora.com/registration.html')

WebUI.delay(3)


WebUI.setText(findTestObject('Registration/reg_username'), username)

//Add email generated in Temp-email
WebUI.setText(findTestObject('Registration/reg_email'), IDmail)


WebUI.setText(findTestObject('Registration/reg_password'),password)

WebUI.setText(findTestObject('Registration/reg_confirm-password'),confirmpassword)

WebUI.click(findTestObject('Registration/Signup button'))


//get the Welcome message for successful register user if this fails, then this test case fails
WelcomeMessage = WebUI.getText(findTestObject('Registration/Welcome'), FailureHandling.STOP_ON_FAILURE)


//Verify that the user is successfuy registered
WebUI.verifyMatch(WelcomeMessage,"WELCOME", true)

WebUI.comment('User Successfuly Registered')

//Swithc back to Temp-mail
WebUI.switchToWindowUrl('https://temp-mail.org/en/')

WebUI.delay(5)

WebUI.refresh()

// Verify Email received from DQRX registration
ActivationMail = WebUI.getText(findTestObject('Registration/InboxMail'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch(ActivationMail,"Activate your Account.", true)

WebUI.comment('User Successfuly recieved Invitation Email')


