package klobid.steps.definition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import klobid.steps.enduserstep.HubungiKamiStep;
import net.thucydides.core.annotations.Steps;

public class HubungiKamiDefs {

    @Steps
    HubungiKamiStep hubungiKamiStep;

    @When("^user klik link hubungi kami$")
    public void userKlikLinkHubungiKami() {
        hubungiKamiStep.klikContactUs();
    }

    @Then("^user seharusnya melihat form hubungi kami$")
    public void userSeharusnyaMelihatFormHubungiKami() {
        hubungiKamiStep.formHubungiKami();
    }

    @When("^user klik field emailContactUs \"([^\"]*)\"$")
    public void userKlikFieldEmailContactUs(String emailContactUs) {
        hubungiKamiStep.emailContactUs(emailContactUs);

    }

    @And("^klik button jenis pertanyaan$")
    public void klikButtonJenisPertanyaan() {
        hubungiKamiStep.buttonJenis();
    }

    @Then("^muncul dropdown jenis pertanyaan$")
    public void munculDropdownJenisPertanyaan() {
        hubungiKamiStep.popUpJenis();
    }

    @When("^user pilih saran$")
    public void userPilihSaran() {
        hubungiKamiStep.pilihSaran();
    }

    @And("^user input detail pesan \"([^\"]*)\"$")
    public void userInputDetailPesan(String detailIsiPesan){
        hubungiKamiStep.detailPesan(detailIsiPesan);
    }

    @And("^user upload foto contact us$")
    public void userUploadFotoContactUs() {
        hubungiKamiStep.pilihFile();
    }

    @And("^klik button kirim pesan$")
    public void klikButtonKirimPesan() {
        hubungiKamiStep.btnKlikContatcUs();
    }

    @Then("^muncul text terima kasih telah menghubungi kami$")
    public void munculTextTerimaKasihTelahMenghubungiKami() {
        hubungiKamiStep.containSukses();
    }


    @When("^user klik button lihat tiket anda$")
    public void userKlikButtonLihatTiketAnda() {
        hubungiKamiStep.klikBtnLihatTiketAnda();
    }


    @Then("^user seharusnya melihat form lihat tiket anda$")
    public void userSeharusnyaMelihatFormLihatTiketAnda() {
        hubungiKamiStep.formLihatTiketAnda();
    }

    @When("^user input nomor tiket \"([^\"]*)\"$")
    public void userInputNomorTiket(String nomorTiket)  {
        hubungiKamiStep.inputNomorTiket(nomorTiket);
    }

    @And("^user input email tiket \"([^\"]*)\"$")
    public void userInputEmailTiket(String emailTiket) {
        hubungiKamiStep.inputEmailTiket(emailTiket);
    }

    @And("^user klik button cari tiket$")
    public void userKlikButtonCariTiket() {
        hubungiKamiStep.klikBtnCariTiket();
    }

    @Then("^user seharusnya melihat form tiket result$")
    public void userSeharusnyaMelihatFormTiketResult() {
        hubungiKamiStep.formDetailTiket();
    }


    @When("^user tambah detail pesan \"([^\"]*)\"$")
    public void userTambahDetailPesan(String detailPesan)  {
        hubungiKamiStep.txtComment(detailPesan);
    }

    @And("^user klik button kirim pesan$")
    public void userKlikButtonKirimPesan() {
        hubungiKamiStep.btnSendComment();
    }

    @Then("^user seharusnya melihat komentar berhasil di muat$")
    public void userSeharusnyaMelihatKomentarBerhasilDiMuat() {
        hubungiKamiStep.resultPesan();
    }

    @When("^user klik button tutup$")
    public void userKlikButtonTutup() {
        hubungiKamiStep.btnClose();
    }

    @Then("^user seharusnya melihat status tiket close$")
    public void userSeharusnyaMelihatStatusTiketClose() {
        hubungiKamiStep.statusClosed();
    }

    @Then("^user seharusnya melihat error message$")
    public void userSeharusnyaMelihatErrorMessage() {
        hubungiKamiStep.errorMessage();
    }

    @Then("^muncul alert tiket tidak di temukan$")
    public void munculAlertTiketTidakDiTemukan() {
        hubungiKamiStep.popUpAlert();
    }

}
