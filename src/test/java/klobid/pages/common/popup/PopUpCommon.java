package klobid.pages.common.popup;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.concurrent.TimeUnit;

public class PopUpCommon extends PageObject {
    @FindBy (xpath = "//div[@class='swal2-header']")
    private WebElementFacade popUpCommon;

    public Boolean isPopUpCommonVisible(){
        return popUpCommon
                .withTimeoutOf(5, TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }
}
