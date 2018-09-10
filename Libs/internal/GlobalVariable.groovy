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
     
    /**
     * <p>Profile Staging : username used to log-in level 0</p>
     */
    public static Object Gusername0
     
    /**
     * <p>Profile Staging : password for jether-qa1</p>
     */
    public static Object Gpassword0
     
    /**
     * <p></p>
     */
    public static Object Bitcoin
     
    /**
     * <p></p>
     */
    public static Object BitcoinCash
     
    /**
     * <p></p>
     */
    public static Object Ethereum
     
    /**
     * <p></p>
     */
    public static Object Ripple
     
    /**
     * <p></p>
     */
    public static Object Litecoin
     
    /**
     * <p></p>
     */
    public static Object Euro
     
    /**
     * <p></p>
     */
    public static Object EthereumClassic
     
    /**
     * <p></p>
     */
    public static Object DQR10
     
    /**
     * <p></p>
     */
    public static Object DQR30
     
    /**
     * <p></p>
     */
    public static Object IOTA
     
    /**
     * <p></p>
     */
    public static Object Dash
     

    static {
        def allVariables = [:]        
        allVariables.put('default', [:])
        allVariables.put('Staging', allVariables['default'] + ['Gusername' : 'nora-qa', 'Gpassword' : 'Vf4WmEw!', 'GloginUrl' : 'http://test.dqr-private.com/login.html', 'Url' : 'http://test.dqr-private.com', 'Gusername0' : 'jether-qa1', 'Gpassword0' : 'Jether08', 'Bitcoin' : 'BTC', 'BitcoinCash' : 'BCH', 'Ethereum' : 'ETH', 'Ripple' : 'XRP', 'Litecoin' : 'LTC', 'Euro' : 'EUR', 'EthereumClassic' : 'ETC', 'DQR10' : 'DQR10', 'DQR30' : 'DQR30', 'IOTA' : 'IOTA', 'Dash' : 'Dash'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        Gusername = selectedVariables['Gusername']
        Gpassword = selectedVariables['Gpassword']
        GloginUrl = selectedVariables['GloginUrl']
        Url = selectedVariables['Url']
        Gusername0 = selectedVariables['Gusername0']
        Gpassword0 = selectedVariables['Gpassword0']
        Bitcoin = selectedVariables['Bitcoin']
        BitcoinCash = selectedVariables['BitcoinCash']
        Ethereum = selectedVariables['Ethereum']
        Ripple = selectedVariables['Ripple']
        Litecoin = selectedVariables['Litecoin']
        Euro = selectedVariables['Euro']
        EthereumClassic = selectedVariables['EthereumClassic']
        DQR10 = selectedVariables['DQR10']
        DQR30 = selectedVariables['DQR30']
        IOTA = selectedVariables['IOTA']
        Dash = selectedVariables['Dash']
        
    }
}
