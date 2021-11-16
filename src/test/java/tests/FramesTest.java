package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTest extends BaseTests {

    private static final String GET_TEXT = "Your content goes here.";

    @Test
    public void iFrame() {
        framesPage.openPage();
        framesPage.openIframe();
        Assert.assertEquals(framesPage.iFrameBoxText(), GET_TEXT);
    }
}
