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

Mobile.startExistingApplication('com.socialnmobile.dictapps.notepad.color.note')

Mobile.tap(findTestObject('Object Repository/Search for Words/New/Search button'), 0)

Mobile.tap(findTestObject('Search for Words/New/android.widget.EditText - this'), 0)

Mobile.clearText(findTestObject('Search for Words/New/android.widget.EditText - this'), 0)

Mobile.setText(findTestObject('Search for Words/New/android.widget.EditText - Search'), 'mobile testing', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Search for Words/New/android.widget.TextView - This is the note for Mobile Testing (1)'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Search for Words/New/android.widget.TextView - This is the note for Mobile Testing (2)'), 
    'This is the note for Mobile Testing')

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

