package klobid.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LandingPage extends PageObject{
    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm btn-round mt-2']")
    private WebElementFacade btnIkutKlob;

    @FindBy (xpath = "//a[@class='font-ws float-left text-white mr-4 mt-3']")
    private WebElementFacade clickMasuk;

    @FindBy (xpath = "//a[contains(text(),'Hubungi Kami')]")
    private WebElementFacade clickHubungiKami;

    public void clickIkutKlob(){
        btnIkutKlob.click();
    }

    public void clickMasuk(){
        clickMasuk.click();
    }

    public void clickHubungiKami(){
        clickHubungiKami.click();
    }
}
