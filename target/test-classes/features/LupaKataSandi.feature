@AutomationKlobLupaKataSandi
  Feature: Automation lupa kata sandi on klob

    @PositifLupaKataSandi
    Scenario: Input lupa kata sandi menggunakan data valid
      Given user berada di landing page
      When user klik login
      Then user menuju ke login page
      When user klik link lupa kata sandi
      Then user seharusnya menuju ke halaman lupa kata sandi
      When user input ulang username "ddgonb9"
      And user klik btn kirim
      #Then user seharusnya melihat pop up error message
     # Then user seharusnya melihat error message username
      Then user seharusnya melihat form ubah kata sandi
      When user input kode verifikasi "aaaaaaaaaa"
      And user input lupa kata sandi "aaaaaaaa"
      And user input ulang kata sandi "aaaaaaaa"
      And user klik button kirim
      Then user seharusnya melihat pop up error message
      #Then user seharusnya menerima error message kode verifikasi
      #And error message kata sandi
      #And error message ulang kata sandi

