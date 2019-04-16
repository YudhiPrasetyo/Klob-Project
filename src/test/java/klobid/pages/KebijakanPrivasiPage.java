package klobid.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.concurrent.TimeUnit;

public class KebijakanPrivasiPage extends PageObject {

    @FindBy (xpath = "//a[@class='font-ws text-white ml-2']")
    private WebElementFacade linkKebijakanPrivasi;

    @FindBy (xpath = "//div[@class='terms-content']")
    private WebElementFacade contTerms;


    public void kebijakanPrivasi(){
        linkKebijakanPrivasi.click();
    }

    public Boolean contTerms(){
        return contTerms
                .withTimeoutOf(5, TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }
}
