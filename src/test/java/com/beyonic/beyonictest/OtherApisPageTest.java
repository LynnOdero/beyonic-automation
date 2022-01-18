package com.beyonic.beyonictest;

import static com.codeborne.selenide.Selenide.open;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OtherApisPageTest {
  OtherApisPage otherApisPage = new OtherApisPage();
  @BeforeAll
  public static void setUpAll() {
    Configuration.browserSize = "1280x800";
    Configuration.headless = true;
    SelenideLogger.addListener("allure", new AllureSelenide());
  }

  @BeforeEach
  public void setUp() {
    open("https://apidocs.beyonic.com/docs/other-apis");
  }

  @Test
  public void List_Accounts_Should_Be_Visible() {
    otherApisPage.accountLinkElement.click();
    otherApisPage.listingAllAccountsSectionElement.hover();
    otherApisPage.listingAllAccountsSectionElement.shouldHave(Condition.text("Listing all accounts"));
    otherApisPage.returnAccountsText.hover();
    otherApisPage.returnAccountsText.shouldHave(Condition.text("This will return a list of accounts"));
  }

  @Test
  public void List_Banks_Should_Be_Visible() {
    otherApisPage.banksLinkElement.click();
    otherApisPage.listingAllBanksSectionElement.hover();
    otherApisPage.listingAllBanksSectionElement.shouldHave(Condition.text("Listing all banks"));
    otherApisPage.returnBanksText.hover();
    otherApisPage.returnBanksText.shouldHave(Condition.text("This will return a list of banks"));
  }

  @Test
  public void List_Currencies_Should_Be_Visible(){
    otherApisPage.currenciesLinkElement.click();
    otherApisPage.listingAllCurrenciesSectionElement.hover();
    otherApisPage.listingAllCurrenciesSectionElement.shouldHave(Condition.text("Listing all Currencies"));
    otherApisPage.returnCurrenciesText.hover();
    otherApisPage.returnCurrenciesText.shouldHave(Condition.text("This will return a list of currencies"));
  }

  @Test
  public void List_Networks_Should_Be_Visible(){
    otherApisPage.networksLinkElement.click();
    otherApisPage.listingAllNetworksSectionElement.hover();
    otherApisPage.listingAllNetworksSectionElement.shouldHave(Condition.text("Listing all networks"));
    otherApisPage.returnNetworksText.hover();
    otherApisPage.returnNetworksText.shouldHave(Condition.text("This will return a list of networks"));
  }

  @Test
  public void List_Transactions_Should_Be_Visible(){
    otherApisPage.transactionsLinkElement.click();
    otherApisPage.listingAllTransactionsSectionElement.hover();
    otherApisPage.listingAllTransactionsSectionElement.shouldHave(Condition.text("Listing all transactions"));
    otherApisPage.returnTransactionsText.hover();
    otherApisPage.returnTransactionsText.shouldHave(Condition.text("This will return a list of transactions"));
  }

  @Test
  public void List_Contacts_Should_Be_Visible() {
    otherApisPage.contactsLinkElement.click();
    otherApisPage.listingAllContactsSectionElement.hover();
    otherApisPage.listingAllContactsSectionElement.shouldHave(Condition.text("Listing all Contacts"));
    otherApisPage.returnContactsText.hover();
    otherApisPage.returnContactsText.shouldHave(Condition.text("This will return a list of contacts"));
  }

  @Test
  public void List_Webhooks_Should_Be_Visible() {
    otherApisPage.webHooksLinkElement.click();
    otherApisPage.listingAllWebhooksSectionElement.hover();
    otherApisPage.listingAllWebhooksSectionElement.shouldHave(Condition.text("Listing all webhooks"));
    otherApisPage.returnWebhooksText.hover();
    otherApisPage.returnWebhooksText.shouldHave(Condition.text("This will return a list of webhooks"));
  }

  @Test
  public void List_Events_Should_Be_Visible() {
    otherApisPage.eventsLinkElement.click();
    otherApisPage.listingAllEventsSectionElement.hover();
    otherApisPage.listingAllEventsSectionElement.shouldHave(Condition.text("Listing all Events"));
    otherApisPage.returnEventsText.hover();
    otherApisPage.returnEventsText.shouldHave(Condition.text("This will return a list of events"));
  }
}
