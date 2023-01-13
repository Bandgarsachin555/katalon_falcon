import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mbx-staging.getmagicbox.com/falcon/auth/login')

WebUI.setText(findTestObject('Object Repository/tc1/Page_Student HomePage/input_username-sername-0d5'), 'popat')

WebUI.setEncryptedText(findTestObject('Object Repository/tc1/Page_Student HomePage/input_password-assword-0e6'), 'K5whAN5BGSo=')

WebUI.click(findTestObject('Object Repository/tc1/Page_Student HomePage/button_Sign In-Sign In-ecd'))

not_run: WebUI.click(findTestObject('Object Repository/tc1/Page_Student HomePage/p_Password should not be less than six characters-assword-a29'))

WebUI.verifyElementText(findTestObject('Object Repository/tc1/Page_Student HomePage/p_Password should not be less than six characters-assword-a29'), 
    'Password should not be less than six characters')

