Feature: AmazonWebsiteControl

  Scenario: VerifyWorkWebSite

    Given clickToSearchBox
    And  writeTheProductName
    And  clickTheSubmitButton
    And selectTheRandomProduct
    And addTheProductBasket
    And goToBasket
    When clickToBasketButton
    Then controlCountTheBasket





