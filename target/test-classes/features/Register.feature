  @AutomationKlobProject
  Feature: Automation Register on Klob

    @PositifRegister
    Scenario: Register menggunakan data valid
      Given user berada di landing page
      When user klik button ikut klob
      Then muncul pop up gabung klob
      When user input field klob id "automation21"
      And user input field email
      And user input field nomor ponsel "080988889999"
      And user klik button kebutuhan khusus
      Then muncul pop up kebutuhan khusus
      And user klik pendengaran
      And user input field kata sandi "Alamanda1"
      And user input field ulang kata sandi "Alamanda1"
      And user klik button lanjutkan
      Then muncul pop up register sukses
      When user klik button ok
      Then muncul halaman verfication code

    @NegatifRegister
    Scenario: Register menggunakan data invalid
      Given user berada di landing page
      When user klik button ikut klob
      Then muncul pop up gabung klob
      When user klik button lanjutkan
      Then muncul error message klob id
      And muncul error message email
      And muncul error message nomor ponsel
      And muncul error message kata sandi
      And muncul error message ulang kata sandi


    @ValidasiKlobId
    Scenario: Register - validasi klob id
      Given user berada di landing page
      When user klik button ikut klob
      Then muncul pop up gabung klob
      When user input field klob id "aaa"
      And user klik field email
      Then muncul error message klob id

    @ValidasiEmail
    Scenario: Register - validasi email
      Given user berada di landing page
      When user klik button ikut klob
      Then muncul pop up gabung klob
      When user input field email "alamanda"
      And user klik field nomor ponsel
      Then muncul error message email

    @ValidasiNoPonsel
    Scenario: Register - validasi nomor ponsel
      Given user berada di landing page
      When user klik button ikut klob
      Then muncul pop up gabung klob
      When user input field nomor ponsel "08123"
      And user klik btn kebutuhan khusus
      Then muncul error message nomor ponsel


    @ValidasiKataSandi
    Scenario: Register - validasi kata sandi
      Given user berada di landing page
      When user klik button ikut klob
      Then muncul pop up gabung klob
      When user input field kata sandi "aaaaa"
      And user klik ulang kata sandi
      Then muncul error message kata sandi


    @ValidasiUlangKataSandi
    Scenario: Register - validasi ulang kata sandi
      Given user berada di landing page
      When user klik button ikut klob
      Then muncul pop up gabung klob
      When user input field kata sandi "Alamanda1"
      And user input field ulang kata sandi "Alamanda"
      And user klik email
      Then muncul error message ulang kata sandi






























