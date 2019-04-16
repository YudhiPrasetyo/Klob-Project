package klobid.steps.definition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import klobid.steps.enduserstep.LoginStep;
import net.thucydides.core.annotations.Steps;

public class LoginDefs {

    @Steps
    LoginStep loginStep;

    @When("^user klik login$")
    public void userKlikLogin() {
        loginStep.clickMasuk();
    }

    @Then("^user menuju ke login page$")
    public void userMenujuKeLoginPage() {
        loginStep.isFormLoginVisible();
    }

    @When("^user input username \"([^\"]*)\"$")
    public void userInputUsername(String username)  {
        loginStep.inputUsername(username);
    }

    @And("^user input katasandi valid \"([^\"]*)\"$")
    public void userInputKatasandiValid(String password) {
        loginStep.inputPassword(password);
    }

    @And("^user klik button masuk$")
    public void userKlikButtonMasuk() {
        loginStep.clickBtnMasuk();
    }

    @Then("^user menuju ke halaman beranda$")
    public void userMenujuKeHalamanBeranda() {
        loginStep.isBerandaVisible();
    }

    @Then("^muncul pop up error message$")
    public void munculPopUpErrorMessage() {
        loginStep.isErrorLoginVisible();
    }

    @Then("^muncul pop up error message username$")
    public void munculPopUpErrorMessageUsername() {
        loginStep.isErrorUsernameVisible();
    }

    @And("^muncul pop up error message password$")
    public void munculPopUpErrorMessagePassword() {
        loginStep.isErrorPasswordVisible();
    }
}
