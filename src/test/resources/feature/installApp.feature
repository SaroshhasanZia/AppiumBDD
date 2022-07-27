@InstallApp
  Feature: Install the Air Droid App
    Scenario: Test the installation of App
      Given User clicks on the playStore App
      When User search for Airdroid
      And User selects the App and click install
      Then user can view the App status as installed