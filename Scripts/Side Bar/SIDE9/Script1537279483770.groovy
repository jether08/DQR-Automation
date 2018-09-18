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

//Call Level4 Login custom keyword
CustomKeywords.'utility.ValidLogin.Level4Login'()

WebUI.delay(10)

//Click Hamburger Icon
WebUI.click(findTestObject('trade.html/Hamburger Menu'))

//Click the Signout button
WebUI.click(findTestObject('SideMenuBar/Signout'))

WebUI.delay(10)

//Navigate to trade.html page
WebUI.navigateToUrl('https://test.dqr-private.com/trade.html')

//Click Hamburger Icon again
WebUI.click(findTestObject('trade.html/Hamburger Menu'))

//Verify that the Login button is clickable
WebUI.verifyElementClickable(findTestObject('SideMenuBar/Side_Login'))

//Click on the Login option
WebUI.click(findTestObject('SideMenuBar/Side_Login'))

WebUI.delay(10)

//Verify that the site navigates to the Login page
url = WebUI.getUrl()
WebUI.verifyMatch(url, 'https://test.dqr-private.com/login.html', true)
