package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Bank Coordinates
 */
@Schema(description = "Bank Coordinates")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:40:10.505Z[GMT]")


public class WireTransfertResourceBankCoordinates   {
  @JsonProperty("bankCode")
  private String bankCode = null;

  @JsonProperty("branchCode")
  private String branchCode = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("bic")
  private String bic = null;

  @JsonProperty("accountOwner")
  private String accountOwner = null;

  @JsonProperty("bankName")
  private String bankName = null;

  @JsonProperty("ics")
  private String ics = null;

  public WireTransfertResourceBankCoordinates bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

  /**
   * Bank identifier
   * @return bankCode
   **/
  @Schema(example = "12548", description = "Bank identifier")
  
  @Pattern(regexp="[0-9]{5}")   public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  public WireTransfertResourceBankCoordinates branchCode(String branchCode) {
    this.branchCode = branchCode;
    return this;
  }

  /**
   * Bank branch identifier
   * @return branchCode
   **/
  @Schema(example = "02998", description = "Bank branch identifier")
  
  @Pattern(regexp="[0-9]{5}")   public String getBranchCode() {
    return branchCode;
  }

  public void setBranchCode(String branchCode) {
    this.branchCode = branchCode;
  }

  public WireTransfertResourceBankCoordinates accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Account number extracted from RIB
   * @return accountNumber
   **/
  @Schema(example = "98765432109", description = "Account number extracted from RIB")
  
  @Pattern(regexp="[A-Z9-9]{11}")   public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public WireTransfertResourceBankCoordinates key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Control key extracted from RIB
   * @return key
   **/
  @Schema(example = "9172", description = "Control key extracted from RIB")
  
  @Pattern(regexp="[0-9]{2}")   public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public WireTransfertResourceBankCoordinates iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * Identification Bank Account Number extracted from RIB
   * @return iban
   **/
  @Schema(example = "FR7612548029989876543210917", description = "Identification Bank Account Number extracted from RIB")
  
    public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public WireTransfertResourceBankCoordinates bic(String bic) {
    this.bic = bic;
    return this;
  }

  /**
   * Bank Identifier Number
   * @return bic
   **/
  @Schema(example = "BIC", description = "Bank Identifier Number")
  
    public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public WireTransfertResourceBankCoordinates accountOwner(String accountOwner) {
    this.accountOwner = accountOwner;
    return this;
  }

  /**
   * Name of the account owner
   * @return accountOwner
   **/
  @Schema(example = "Ma Petite Entreprise", description = "Name of the account owner")
  
    public String getAccountOwner() {
    return accountOwner;
  }

  public void setAccountOwner(String accountOwner) {
    this.accountOwner = accountOwner;
  }

  public WireTransfertResourceBankCoordinates bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

  /**
   * the clear name of the institution and the counter holding the account
   * @return bankName
   **/
  @Schema(example = "LA BANQUE DU BUYER", description = "the clear name of the institution and the counter holding the account")
  
    public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public WireTransfertResourceBankCoordinates ics(String ics) {
    this.ics = ics;
    return this;
  }

  /**
   * SEPA creditor identifier
   * @return ics
   **/
  @Schema(example = "FR83ZZZ459654", description = "SEPA creditor identifier")
  
  @Pattern(regexp="[A-Z]{2}[A-Z0-9]{11}")   public String getIcs() {
    return ics;
  }

  public void setIcs(String ics) {
    this.ics = ics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WireTransfertResourceBankCoordinates wireTransfertResourceBankCoordinates = (WireTransfertResourceBankCoordinates) o;
    return Objects.equals(this.bankCode, wireTransfertResourceBankCoordinates.bankCode) &&
        Objects.equals(this.branchCode, wireTransfertResourceBankCoordinates.branchCode) &&
        Objects.equals(this.accountNumber, wireTransfertResourceBankCoordinates.accountNumber) &&
        Objects.equals(this.key, wireTransfertResourceBankCoordinates.key) &&
        Objects.equals(this.iban, wireTransfertResourceBankCoordinates.iban) &&
        Objects.equals(this.bic, wireTransfertResourceBankCoordinates.bic) &&
        Objects.equals(this.accountOwner, wireTransfertResourceBankCoordinates.accountOwner) &&
        Objects.equals(this.bankName, wireTransfertResourceBankCoordinates.bankName) &&
        Objects.equals(this.ics, wireTransfertResourceBankCoordinates.ics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankCode, branchCode, accountNumber, key, iban, bic, accountOwner, bankName, ics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WireTransfertResourceBankCoordinates {\n");
    
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    branchCode: ").append(toIndentedString(branchCode)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    accountOwner: ").append(toIndentedString(accountOwner)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    ics: ").append(toIndentedString(ics)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
