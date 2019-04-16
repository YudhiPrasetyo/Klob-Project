package klobid.steps.definition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import klobid.steps.enduserstep.LupaKataSandiStep;
import net.thucydides.core.annotations.Steps;

public class LupaKataSandiDefs {

    @Steps
    LupaKataSandiStep lupaKataSandiStep;

    @When("^user klik link lupa kata sandi$")
    public void userKlikLinkLupaKataSandi() {
        lupaKataSandiStep.klikLupaKataSandi();
    }

    @Then("^user seharusnya menuju ke halaman lupa kata sandi$")
    public void userSeharusnyaMenujuKeHalamanLupaKataSandi() {
        lupaKataSandiStep.isFormLupaKataSandi();
    }

    @When("^user input ulang username \"([^\"]*)\"$")
    public void userInputUlangUsername(String lupaKataSandi)  {
        lupaKataSandiStep.inputUlangUsername(lupaKataSandi);
    }

    @And("^user klik btn kirim$")
    public void userKlikBtnKirim() {
        lupaKataSandiStep.klikBtnKirim();
    }

    @Then("^user seharusnya melihat pop up error message$")
    public void userSeharusnyaMelihatPopUpErrorMessage() {
        lupaKataSandiStep.popUpLupaKataSandi();
    }

    @Then("^user seharusnya melihat error message username$")
    public void userSeharusnyaMelihatErrorMessageUsername() {
        lupaKataSandiStep.emLupaKataSandi();
    }

    @Then("^user seharusnya melihat form ubah kata sandi$")
    public void userSeharusnyaMelihatFormUbahKataSandi() {
        lupaKataSandiStep.isFormUbahKataSandi();
    }

    @When("^user input kode verifikasi \"([^\"]*)\"$")
    public void userInputKodeVerifikasi(String kodeverifikasi) {
        lupaKataSandiStep.inputKodeVerifikasi(kodeverifikasi);
    }

    @And("^user input lupa kata sandi \"([^\"]*)\"$")
    public void userInputLupaKataSandi(String newPass)  {
        lupaKataSandiStep.inputNewPassword(newPass);
    }

    @And("^user input ulang kata sandi \"([^\"]*)\"$")
    public void userInputUlangKataSandi(String ulangNewPass)  {
        lupaKataSandiStep.inputUlangNewPass(ulangNewPass);
    }

    @And("^user klik button kirim$")
    public void userKlikButtonKirim() {
        lupaKataSandiStep.klikButtonKirim();
    }

    @Then("^user seharusnya menerima error message kode verifikasi$")
    public void userSeharusnyaMenerimaErrorMessageKodeVerifikasi() {
        lupaKataSandiStep.emKodeVerifikasi();
    }

    @And("^error message kata sandi$")
    public void errorMessageKataSandi() {
        lupaKataSandiStep.emNewPass();
    }

    @And("^error message ulang kata sandi$")
    public void errorMessageUlangKataSandi() {
        lupaKataSandiStep.emUlangNewPass();
    }



}
