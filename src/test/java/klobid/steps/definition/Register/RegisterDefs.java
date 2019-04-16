package klobid.steps.definition.Register;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import klobid.steps.enduserstep.RegisterStep;
import net.thucydides.core.annotations.Steps;

public class RegisterDefs {

    @Steps
    RegisterStep registerStep;


    @Given("^user berada di landing page$")
    public void userBeradaDiLandingPage() {
        registerStep.openHomePage();
    }

    @When("^user klik button ikut klob$")
    public void userKlikButtonIkutKlob() {
        registerStep.clickBtnIkutKlob();
    }

    @Then("^muncul pop up gabung klob$")
    public void munculPopUpGabungKlob() {
        registerStep.isPopUpRegister();
    }

    @When("^user input field klob id \"([^\"]*)\"$")
    public void userInputFieldKlobId(String klobid) {
        registerStep.inputKlobId(klobid);
    }

    @And("^user input field email$")
    public void userInputFieldEmail() {
        registerStep.inputEmail();
    }

    @And("^user input field nomor ponsel \"([^\"]*)\"$")
    public void userInputFieldNomorPonsel(String nomorPonsel) {
        registerStep.inputNomorPonsel(nomorPonsel);
    }

    @And("^user klik button kebutuhan khusus$")
    public void userKlikButtonKebutuhanKhusus() {
        registerStep.clickKebutuhanKhusus();
    }

    @Then("^muncul pop up kebutuhan khusus$")
    public void munculPopUpKebutuhanKhusus() {
        registerStep.isPopUpKebutuhanKhusus();
    }

    @And("^user klik pendengaran$")
    public void userKlikPendengaran() {
        registerStep.clickPendengaran();
    }

    @And("^user input field kata sandi \"([^\"]*)\"$")
    public void userInputFieldKataSandi(String kataSandi) {
        registerStep.inputKataSandi(kataSandi);
    }

    @And("^user input field ulang kata sandi \"([^\"]*)\"$")
    public void userInputFieldUlangKataSandi(String ulangKataSandi) {
        registerStep.inputUlangKataSandi(ulangKataSandi);
    }

    @And("^user klik button lanjutkan$")
    public void userKlikButtonLanjutkan() {
        registerStep.clickBtnLanjutkan();
    }

    @Then("^muncul pop up register sukses$")
    public void munculPopUpRegisterSukses() {
        registerStep.isPopUpSuksesVisible();
    }

    @When("^user klik button ok$")
    public void userKlikButtonOk() {
        registerStep.clickBtnOk();
    }

    @Then("^muncul halaman verfication code$")
    public void munculHalamanVerficationCode() {
        registerStep.isFormVerificationVisible();
    }

    @Then("^muncul error message klob id$")
    public void munculErrorMessageKlobId() {
        registerStep.isErrorMessageIdVisible();
    }

    @And("^muncul error message email$")
    public void munculErrorMessageEmail() {
        registerStep.isErrorMessageEmailVisible();
    }

    @And("^muncul error message nomor ponsel$")
    public void munculErrorMessageNomorPonsel() {
        registerStep.isErrorMessageNoPonsel();
    }

    @And("^muncul error message kata sandi$")
    public void munculErrorMessageKataSandi() {
        registerStep.isErrorMessageKataSandi();
    }

    @And("^muncul error message ulang kata sandi$")
    public void munculErrorMessageUlangKataSandi() {
        registerStep.isErrorMessageUlangKataSandi();
    }

    @And("^user klik field email$")
    public void userKlikFieldEmail() {
        registerStep.clickEmail();
    }

    @And("^user klik field nomor ponsel$")
    public void userKlikFieldNomorPonsel() {
        registerStep.clickNoPonsel();
    }

    @And("^user klik btn kebutuhan khusus$")
    public void userKlikBtnKebutuhanKhusus() {
        registerStep.clickKebutuhanKhusus();
    }

    @And("^user klik ulang kata sandi$")
    public void userKlikUlangKataSandi() {
        registerStep.clickUlangKataSandi();
    }

    @And("^user klik email$")
    public void userKlikEmail() {
        registerStep.clickEmail();
    }

}
