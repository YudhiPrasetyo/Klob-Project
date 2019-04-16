@AutomationKlobKetentuanPenggunaan
  Feature: Automation ketentuan penggunaan on Klob

    @KetentuanPenggunaan
    Scenario: Menuju ke halaman ketentuan penggunaan
      Given user berada di landing page
      When user klik link ketentuan penggunaan
      Then user menuju ke halaman ketentuan penggunaan