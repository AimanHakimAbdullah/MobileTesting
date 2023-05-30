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

Mobile.tap(findTestObject('Object Repository/Set Reminder/android.widget.ImageButton (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Set Reminder/android.widget.LinearLayout (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Set Reminder/android.widget.EditText (2)'), 'Archieve Test', 0)

Mobile.hideKeyboard()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Set Reminder/android.widget.ImageButton (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Set Reminder/android.widget.TextView - Reminder (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Set Reminder/android.widget.Button - REMIND ME TODAY (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Set Reminder/android.widget.Button - DONE (2)'), 0)

Mobile.tap(findTestObject('Set Reminder/android.widget.ImageButton (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Set Reminder/android.widget.TextView - Archive'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Set Reminder/android.widget.TextView - The reminder will be dismissed when a note is archived. Are you sure you want to archive the note'), 
    'The reminder will be dismissed when a note is archived. Are you sure you want to archive the note?')

Mobile.tap(findTestObject('Object Repository/Set Reminder/android.widget.Button - OK (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Set Reminder/android.widget.ListView'), 2)

Mobile.closeApplication()

