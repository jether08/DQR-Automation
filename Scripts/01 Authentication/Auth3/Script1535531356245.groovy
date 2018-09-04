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

//Open the browser
WebUI.openBrowser('')

//maximize the browser window
WebUI.maximizeWindow()

//Navigate to the site
WebUI.navigateToUrl(GlobalVariable.Url)

//wait 30s for the page to load
WebUI.waitForPageLoad(30)

//Click Login button
WebUI.click(findTestObject('Object Repository/Login/a_Login'))

//Input pasword; leave username field empty
WebUI.setText(findTestObject('Login/input_password'), GlobalVariable.Gpassword)

//Click Login button
WebUI.click(findTestObject('Login/button_Log_In'))

//Verify if the user is still in the login page
url = WebUI.getUrl()

WebUI.verifyMatch(url, GlobalVariable.GloginUrl, true)

WebUI.delay(3)

WebUI.comment('User Failed to Login due to Empty Userid value')


