package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTests {

    private static final String ALERT_TEXT = "You selected a context menu";

    @Test
    public void contextMenu() {
        contextMenuPage.openPage();
        contextMenuPage.rightClickHotSpot();
        contextMenuPage.getAlertText();
        Assert.assertEquals(contextMenuPage.getAlertText(), ALERT_TEXT);
        contextMenuPage.closeAlert();
    }
}
