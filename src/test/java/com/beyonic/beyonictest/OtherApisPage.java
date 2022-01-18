package com.beyonic.beyonictest;

import static com.codeborne.selenide.Selenide.$;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class OtherApisPage {
  // Accounts Page Objects
  public SelenideElement accountLinkElement = $(By.linkText("Accounts"));
  public SelenideElement listingAllAccountsSectionElement = $(By.linkText("Listing all accounts"));
  public SelenideElement returnAccountsText = $(By.xpath("//*[contains(text(),'This will return a list of accounts')]"));

  // Bank Page Objects
  public SelenideElement banksLinkElement = $(By.linkText("Banks"));
  public SelenideElement listingAllBanksSectionElement = $(By.linkText("Listing all Banks"));
  public SelenideElement returnBanksText = $(By.xpath("//*[contains(text(),'This will return a list of banks')]"));

  // Currencies Page Objects
  public SelenideElement currenciesLinkElement = $(By.linkText("Currencies"));
  public SelenideElement listingAllCurrenciesSectionElement = $(By.linkText("Listing all Currencies"));
  public SelenideElement returnCurrenciesText = $(By.xpath("//*[contains(text(),'This will return a list of currencies')]"));

  //Networks Page Objects
  public SelenideElement networksLinkElement = $(By.linkText("Networks"));
  public SelenideElement listingAllNetworksSectionElement = $(By.linkText("Listing all networks"));
  public SelenideElement returnNetworksText = $(By.xpath("//*[contains(text(),'This will return a list of networks')]"));

  // Transactions Page Objects
  public SelenideElement transactionsLinkElement = $(By.linkText("Transactions"));
  public SelenideElement listingAllTransactionsSectionElement = $(By.linkText("Listing all transactions"));
  public SelenideElement returnTransactionsText = $(By.xpath("//*[contains(text(),'This will return a list of transactions')]"));

  // Contacts Page Objects
  public SelenideElement contactsLinkElement = $(By.linkText("Contacts"));
  public SelenideElement listingAllContactsSectionElement = $(By.linkText("Listing all Contacts"));
  public SelenideElement returnContactsText = $(By.xpath("//*[contains(text(),'This will return a list of contacts')]"));

  // Events Page Objects
  public SelenideElement eventsLinkElement = $(By.linkText("Events"));
  public SelenideElement listingAllEventsSectionElement = $(By.linkText("Listing all Events"));
  public SelenideElement returnEventsText = $(By.xpath("//*[contains(text(),'This will return a list of events')]"));

  // Webhooks Page Objects
  public SelenideElement webHooksLinkElement = $(By.linkText("Webhooks"));
  public SelenideElement listingAllWebhooksSectionElement = $(By.linkText("Listing all webhooks"));
  public SelenideElement returnWebhooksText = $(By.xpath("//*[contains(text(),'This will return a list of webhooks')]"));

}
