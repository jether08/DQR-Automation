import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Authentication')

suiteProperties.put('name', 'Authentication')

suiteProperties.put('description', 'Test cases for Authentication')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\arcillas\\git\\DQR-Automation\\Reports\\Authentication\\20180829_195752\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Authentication', suiteProperties, [new TestCaseBinding('Test Cases/01 Authentication/Auth1', 'Test Cases/01 Authentication/Auth1',  null), new TestCaseBinding('Test Cases/01 Authentication/Auth2', 'Test Cases/01 Authentication/Auth2',  null), new TestCaseBinding('Test Cases/01 Authentication/Auth3', 'Test Cases/01 Authentication/Auth3',  null), new TestCaseBinding('Test Cases/01 Authentication/Auth4', 'Test Cases/01 Authentication/Auth4',  null), new TestCaseBinding('Test Cases/01 Authentication/Auth5', 'Test Cases/01 Authentication/Auth5',  null)])
