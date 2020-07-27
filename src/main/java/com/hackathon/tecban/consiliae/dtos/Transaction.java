package com.hackathon.tecban.consiliae.dtos;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AccountId",
    "BookingDateTime",
    "ValueDateTime",
    "TransactionInformation",
    "TransactionId",
    "Amount",
    "CreditDebitIndicator",
    "Status",
    "MerchantDetails",
    "TransactionMutability",
    "TransactionReference",
    "BankTransactionCode",
    "Balance"
})
public class Transaction {

    @JsonProperty("AccountId")
    private String accountId;
    @JsonProperty("BookingDateTime")
    private String bookingDateTime;
    @JsonProperty("ValueDateTime")
    private String valueDateTime;
    @JsonProperty("TransactionInformation")
    private String transactionInformation;
    @JsonProperty("TransactionId")
    private String transactionId;
    @JsonProperty("Amount")
    private Amount amount;
    @JsonProperty("CreditDebitIndicator")
    private String creditDebitIndicator;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("MerchantDetails")
    private MerchantDetails merchantDetails;
    @JsonProperty("TransactionMutability")
    private String transactionMutability;
    @JsonProperty("TransactionReference")
    private String transactionReference;
    @JsonProperty("BankTransactionCode")
    private BankTransactionCode bankTransactionCode;
    @JsonProperty("Balance")
    private Balance balance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("AccountId")
    public String getAccountId() {
        return accountId;
    }

    @JsonProperty("AccountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @JsonProperty("BookingDateTime")
    public String getBookingDateTime() {
        return bookingDateTime;
    }

    @JsonProperty("BookingDateTime")
    public void setBookingDateTime(String bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
    }

    @JsonProperty("ValueDateTime")
    public String getValueDateTime() {
        return valueDateTime;
    }

    @JsonProperty("ValueDateTime")
    public void setValueDateTime(String valueDateTime) {
        this.valueDateTime = valueDateTime;
    }

    @JsonProperty("TransactionInformation")
    public String getTransactionInformation() {
        return transactionInformation;
    }

    @JsonProperty("TransactionInformation")
    public void setTransactionInformation(String transactionInformation) {
        this.transactionInformation = transactionInformation;
    }

    @JsonProperty("TransactionId")
    public String getTransactionId() {
        return transactionId;
    }

    @JsonProperty("TransactionId")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @JsonProperty("Amount")
    public Amount getAmount() {
        return amount;
    }

    @JsonProperty("Amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    @JsonProperty("CreditDebitIndicator")
    public String getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    @JsonProperty("CreditDebitIndicator")
    public void setCreditDebitIndicator(String creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
    }

    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("MerchantDetails")
    public MerchantDetails getMerchantDetails() {
        return merchantDetails;
    }

    @JsonProperty("MerchantDetails")
    public void setMerchantDetails(MerchantDetails merchantDetails) {
        this.merchantDetails = merchantDetails;
    }

    @JsonProperty("TransactionMutability")
    public String getTransactionMutability() {
        return transactionMutability;
    }

    @JsonProperty("TransactionMutability")
    public void setTransactionMutability(String transactionMutability) {
        this.transactionMutability = transactionMutability;
    }

    @JsonProperty("TransactionReference")
    public String getTransactionReference() {
        return transactionReference;
    }

    @JsonProperty("TransactionReference")
    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    @JsonProperty("BankTransactionCode")
    public BankTransactionCode getBankTransactionCode() {
        return bankTransactionCode;
    }

    @JsonProperty("BankTransactionCode")
    public void setBankTransactionCode(BankTransactionCode bankTransactionCode) {
        this.bankTransactionCode = bankTransactionCode;
    }

    @JsonProperty("Balance")
    public Balance getBalance() {
        return balance;
    }

    @JsonProperty("Balance")
    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
