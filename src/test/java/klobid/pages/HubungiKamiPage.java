package klobid.pages;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class HubungiKamiPage extends PageObject {
    @FindBy (xpath = "//div[@id='ForPass']")
    private WebElementFacade formHubungiKami;

    @FindBy (xpath = "//input[@name='emailContactUs']")
    private WebElementFacade emailContactUs;

    @FindBy (xpath = "//button[@title='Corporate Message']")
    private WebElementFacade buttonJenis;

    @FindBy (xpath = "//div[@class='dropdown-menu open show']")
    private WebElementFacade popUpJenis;

    @FindBy (xpath = "//li[@data-original-index='4']")
    private WebElementFacade pilihSaran;

    @FindBy (xpath = "//textarea[@id='messageText']")
    private WebElementFacade detailPesan;

   // @FindBy (xpath = "//input[@id='fileAttachment']")
   // private WebElementFacade pilihFile;

    @FindBy (xpath = "//button[@id='btnSendContactUs']")
    private WebElementFacade btnKlikContactUs;

    @FindBy (xpath = "//h4[contains(text(),'Terima kasih telah menghubungi kami, catat nomor p')]")
    private WebElementFacade containsSukses;

    @FindBy (xpath = "//button[@id='btnTabInquiryContactUs']")
    private WebElementFacade btnLihatTiketAnda;

    @FindBy (xpath = "//input[@id='inquirySearchMessageId']")
    private WebElementFacade inputNomorTiket;

    @FindBy (xpath = "//div[@id='inquirySearch']")
    private WebElementFacade formLihatTiket;

    @FindBy (xpath = "//input[@id='inquirySearchEmail']")
    private WebElementFacade inputEmailTiket;

    @FindBy (xpath = "//button[@id='inquiryBtnApply']")
    private WebElementFacade btnCariTiket;

    @FindBy (xpath = "//div[@id='inquiryMessage']")
    private WebElementFacade detailTiket;

    @FindBy (xpath = "//div[@id='inquiryDetail']")
    private WebElementFacade detailTanggapan;

    @FindBy (xpath = "//textarea[@id='txtComment']")
    private WebElementFacade txtComment;

    @FindBy (xpath = "//button[@id='btnSendComment']")
    private WebElementFacade btnSendComment;

    @FindBy (xpath = "//p[contains(text(),'aku takut aja')]")
    private WebElementFacade resultDetailPesan;

    @FindBy (xpath = "//button[contains(text(),'Tutup Tiket')]")
    private WebElementFacade btnClose;

    @FindBy (xpath = "//div[contains(text(),'CLOSED')]")
    private WebElementFacade statusClosed;

    @FindBy ( id = "emailContactUs-error")
    private WebElementFacade errorMessage;



    public Boolean formHubungiKami(){
        return formHubungiKami
                .withTimeoutOf(5, TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public void emailContactUs(String emailContact) {
        emailContactUs.type(emailContact);
    }

    public void buttonJenis(){
        buttonJenis.click();
    }

    public Boolean popUpjenis(){
        return popUpJenis
                .withTimeoutOf(5, TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public void pilihSaran(){
        pilihSaran.click();
    }

    public void detailPesan(String detailIsiPesan){
        detailPesan.type(detailIsiPesan);
    }

    public void pilihFile(){
        String I = File.separator;
        String location = System.getProperty("user.dir")
                + I + "src" + I + "test" + I + "resources"
                + I + "image" + I + "bear.jpg";
        WebElementFacade pilihFile = find(By.xpath("//input[@id='fileAttachment']"));
        pilihFile.sendKeys(location);

    }

    public void btnKlikContactUs(){
        btnKlikContactUs.click();
    }

    public Boolean containsSukses(){
        return containsSukses
                .withTimeoutOf(5,TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public void btnLihatTiketAnda(){
        btnLihatTiketAnda.click();
    }

    public Boolean  formLihatTiket(){
        return formLihatTiket
                .withTimeoutOf(5,TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public void inputNomorTiket(String nomorTiket){
        inputNomorTiket.type(nomorTiket);
    }

    public void inputEmailTiket(String emailTiket){
        inputEmailTiket.type(emailTiket);
    }

    public void btnCariTiket(){
        btnCariTiket.click();
    }

    public Boolean detailTiket(){
        return detailTiket
                .withTimeoutOf(5, TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public Boolean detailTanggapan(){
        return detailTanggapan
                .withTimeoutOf(5,TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public void txtComment(String detailPesan){
        txtComment.type(detailPesan);
    }

    public void btnSendComment(){
        btnSendComment.click();
    }

    public Boolean resultDetailPesan(){
        return resultDetailPesan
                .withTimeoutOf(5,TimeUnit.SECONDS)
                .isCurrentlyEnabled();
    }

    public void btnClose(){
        btnClose.click();
    }

    public Boolean statusClosed(){
        return statusClosed
                .withTimeoutOf(5,TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public Boolean errorMessage(){
        return errorMessage
                .withTimeoutOf(5,TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public void popUpAlert(){
        getDriver().switchTo().alert().accept();

    }



}
