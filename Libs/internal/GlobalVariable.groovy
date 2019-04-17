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
     * <p></p>
     */
    public static Object URL
     
    /**
     * <p></p>
     */
    public static Object element
     
    /**
     * <p></p>
     */
    public static Object mapele
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['URL' : findTestData('CredentialsDetails/URL').getValue('URL', 1), 'element' : ['1234', 'suma'], 'mapele' : [('abcd') : '34556', ('suma') : '1234']])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        URL = selectedVariables['URL']
        element = selectedVariables['element']
        mapele = selectedVariables['mapele']
        
    }
}
