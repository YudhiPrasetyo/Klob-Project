package klobid.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.concurrent.TimeUnit;

public class VerificationPage extends PageObject {
    @FindBy (xpath = "//div[@class='center verify-form']")
    private WebElementFacade formVerifikasi;

    public Boolean isFormVerifikasiVisible(){
        return formVerifikasi
                .withTimeoutOf(5, TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }
}
