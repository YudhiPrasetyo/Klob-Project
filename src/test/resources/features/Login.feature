@AutomationKlobLogin
  Feature: Automation Login on Klob

    @PositifLogin
    Scenario: Login menggunakan data valid
      Given user berada di landing page
      When user klik login
      Then user menuju ke login page
      When user input username "ddgo"
     # And user input katasandi valid "Alamanda"
      And user klik button masuk
     # Then user menuju ke halaman beranda
     # Then muncul pop up error message
      Then muncul pop up error message username
      And muncul pop up error message password

    @NegatifLogin
    Scenario: Login menggunakan user yang belum verifikasi email
      Given user berada di landing page
      When user klik login
      Then user menuju ke login page
      When user input username "automation5"
      And user input katasandi valid "Asdfghjkl"
      And user klik button masuk
      Then muncul halaman verfication code






