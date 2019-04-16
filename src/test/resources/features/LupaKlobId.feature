@AutomationKlobLupaKlobId
  Feature: Automation lupa klob id on klob

    @PositiveLupaKlobId
    Scenario: Input lupa klob id menggunakan data valid
      Given user berada di landing page
      When user klik login
      Then user menuju ke login page
      When user klik lupa klob id
      Then user seharusnya menuju ke halaman lupa klob id
      When user input field email "a"
      And user klik kirim
      Then user seharusnya melihat pop up sukses

