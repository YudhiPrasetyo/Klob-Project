@AutomationKlobKebijakanPrivasi
  Feature: Automation Kebijakan Privasi on Klob

    @KebijakanPrivasi
    Scenario: Menuju ke halaman kebijakan privasi
      Given user berada di landing page
      When user klik link kebijakan privasi
      Then user menuju ke halaman kebijakan privasi
