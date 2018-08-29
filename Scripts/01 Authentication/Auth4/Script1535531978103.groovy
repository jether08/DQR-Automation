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

WebUI.maximizeWindow( //maximize the browser window
    )

//Navigate to the site
WebUI.navigateToUrl('http://apsite-staging.hidora.com/')

//wait 30s for the page to load
WebUI.waitForPageLoad(30)

//Click Login button
WebUI.click(findTestObject('Object Repository/Login/a_Login'))

//Input invalid username
WebUI.setText(findTestObject('Object Repository/Login/input_name'), 'incorrectuser')

//Input valid password
WebUI.setText(findTestObject('Login/input_password'), GlobalVariable.Gpassword)

//Click Login button
WebUI.click(findTestObject('Object Repository/Login/button_Log In'))

WebUI.delay(5)

//Wait for 2s and verify if error message is displayed
WebUI.verifyElementText(findTestObject('Login/error_mesage'), 'Wrong credentials')

