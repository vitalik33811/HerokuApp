package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTests{

    private final String TEXT_UNDER_CHECKBOX = "It's gone!";
    private final String TEXT_UNDER_INPUT = "It's enabled!";
    private final String REMOVE_BUTTON_NAME_AFTER_CLICK = "Add";
    private final String ENABLE_BUTTON_NAME_AFTER_CLICK = "Disable";


    @Test
    public void findCheckboxTest() {
        dynamicControlsPage.openPage();
        Assert.assertTrue(dynamicControlsPage.checkboxDisplayed());
    }
    @Test
    public void messageUnderCheckboxTest() {
        dynamicControlsPage.openPage();
        dynamicControlsPage.clickRemoveButton();
        Assert.assertEquals(dynamicControlsPage.getTextAfterClick(),TEXT_UNDER_CHECKBOX);
        Assert.assertEquals(dynamicControlsPage.getRemoveButtonName(), REMOVE_BUTTON_NAME_AFTER_CLICK);
    }
    @Test
    public void checkCheckboxNotDisplayedAfterRemoveBtnClickTest() {
        dynamicControlsPage.openPage();
        dynamicControlsPage.clickRemoveButton();
        Assert.assertTrue(dynamicControlsPage.сheckCheckbox());
    }
    @Test
    public void displayedInputTest() {
        dynamicControlsPage.openPage();
        Assert.assertTrue(dynamicControlsPage.inputDisplayed());
    }
    @Test
    public void checkInputIsDisabledTest() {
        dynamicControlsPage.openPage();
        Assert.assertFalse(dynamicControlsPage.inputEnabled());
    }
    @Test
    public void checkMessageInputTest() {
        dynamicControlsPage.openPage();
        dynamicControlsPage.clickEnableButton();
        Assert.assertEquals(dynamicControlsPage.getTextAfterClick(), TEXT_UNDER_INPUT);
        Assert.assertEquals(dynamicControlsPage.buttonOnName(), ENABLE_BUTTON_NAME_AFTER_CLICK);
    }
    @Test
    public void checkInputIsEnabledTest() {
        dynamicControlsPage.openPage();
        Assert.assertFalse(dynamicControlsPage.inputEnabled());
    }

}
