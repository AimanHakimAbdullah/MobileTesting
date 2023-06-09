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

Mobile.verifyElementText(findTestObject('Object Repository/Edit Note/android.widget.TextView - Revert Testing'), 'Revert Testing')

Mobile.tap(findTestObject('Edit Note/android.widget.TextView - Revert Testing'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Note/android.widget.ImageButton (2)'), 0)

Mobile.clearText(findTestObject('Object Repository/Edit Note/android.widget.EditText - Revert Testing'), 0)

Mobile.setText(findTestObject('Object Repository/Edit Note/android.widget.EditText (1)'), 'Attempt to Edit in Revert Testing', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Edit Note/android.widget.ImageButton (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Note/android.widget.LinearLayout'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Edit Note/android.widget.TextView - Are you sure you want to revert'), 
    0)

Mobile.tap(findTestObject('Object Repository/Edit Note/android.widget.Button - OK (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Edit Note/android.widget.TextView - Revert Testing (1)'), 'Revert Testing ')

Mobile.pressBack()

Mobile.closeApplication()

