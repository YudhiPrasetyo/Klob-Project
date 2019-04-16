package klobid.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.concurrent.TimeUnit;

public class KetentuanPenggunaanPage extends PageObject {

    @FindBy (xpath = "//a[contains(text(),'Ketentuan Penggunaan')]")
    private WebElementFacade linkKetentuanPenggunaan;

    @FindBy (xpath = "//div[@class='col-12 ui-block terms-block text-justify border-none']")
    private WebElementFacade contKetentuanPenggunaan;

    public void KetentuanPenggunaan(){
        linkKetentuanPenggunaan.click();
    }

    public Boolean contKetentuanPenggunaan(){
       return contKetentuanPenggunaan
               .withTimeoutOf(5, TimeUnit.SECONDS)
               .isCurrentlyVisible();
    }

}
