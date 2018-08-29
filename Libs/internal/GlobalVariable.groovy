package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile Staging : username used to log in</p>
     */
    public static Object Gusername
     
    /**
     * <p>Profile Staging : password for nora-qa</p>
     */
    public static Object Gpassword
     
    /**
     * <p></p>
     */
    public static Object GloginUrl
     
    /**
     * <p>Profile Staging : Staging URL</p>
     */
    public static Object Url
     

    static {
        def allVariables = [:]        
        allVariables.put('default', [:])
        allVariables.put('Staging', allVariables['default'] + ['Gusername' : 'nora-qa', 'Gpassword' : 'Vf4WmEw!', 'GloginUrl' : 'http://apsite-staging.hidora.com/login.html', 'Url' : 'http://apsite-staging.hidora.com/'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        Gusername = selectedVariables['Gusername']
        Gpassword = selectedVariables['Gpassword']
        GloginUrl = selectedVariables['GloginUrl']
        Url = selectedVariables['Url']
        
    }
}
