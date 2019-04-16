package klobid.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.concurrent.TimeUnit;

public class BerandaPage extends PageObject {

    @FindBy (xpath = "//div[@class='sc-bEufUU CSMht']")
    private WebElementFacade formDashboard;

    public Boolean isFormDashboard(){
        return formDashboard
                .withTimeoutOf(5, TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }
}
