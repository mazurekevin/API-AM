package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.BusinessAddress;
import io.swagger.model.BusinessBuyerEInvoicing;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes buyer organisation &amp; contact
 */
@Schema(description = "Describes buyer organisation & contact")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:40:10.505Z[GMT]")


public class BusinessBuyer   {
  @JsonProperty("buyerRef")
  private String buyerRef = null;

  /**
   * Gets or Sets buyerType
   */
  public enum BuyerTypeEnum {
    PARTICULAR("PARTICULAR"),
    
    PROFESSIONNAL("PROFESSIONNAL");

    private String value;

    BuyerTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BuyerTypeEnum fromValue(String text) {
      for (BuyerTypeEnum b : BuyerTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("buyerType")
  private BuyerTypeEnum buyerType = null;

  @JsonProperty("party")
  private OneOfBusinessBuyerParty party = null;

  @JsonProperty("eInvoicing")
  private BusinessBuyerEInvoicing eInvoicing = null;

  @JsonProperty("contactPerson")
  private AllOfBusinessBuyerContactPerson contactPerson = null;

  @JsonProperty("contactAddress")
  private BusinessAddress contactAddress = null;

  @JsonProperty("billingAddress")
  private BusinessAddress billingAddress = null;

  public BusinessBuyer buyerRef(String buyerRef) {
    this.buyerRef = buyerRef;
    return this;
  }

  /**
   * External reference of buyer (By example: social reason of the company)
   * @return buyerRef
   **/
  @Schema(example = "Ma Petite Entreprise", description = "External reference of buyer (By example: social reason of the company)")
  
    public String getBuyerRef() {
    return buyerRef;
  }

  public void setBuyerRef(String buyerRef) {
    this.buyerRef = buyerRef;
  }

  public BusinessBuyer buyerType(BuyerTypeEnum buyerType) {
    this.buyerType = buyerType;
    return this;
  }

  /**
   * Get buyerType
   * @return buyerType
   **/
  @Schema(example = "PROFESSIONNAL", required = true, description = "")
      @NotNull

    public BuyerTypeEnum getBuyerType() {
    return buyerType;
  }

  public void setBuyerType(BuyerTypeEnum buyerType) {
    this.buyerType = buyerType;
  }

  public BusinessBuyer party(OneOfBusinessBuyerParty party) {
    this.party = party;
    return this;
  }

  /**
   * Get party
   * @return party
   **/
  @Schema(description = "")
  
    public OneOfBusinessBuyerParty getParty() {
    return party;
  }

  public void setParty(OneOfBusinessBuyerParty party) {
    this.party = party;
  }

  public BusinessBuyer eInvoicing(BusinessBuyerEInvoicing eInvoicing) {
    this.eInvoicing = eInvoicing;
    return this;
  }

  /**
   * Get eInvoicing
   * @return eInvoicing
   **/
  @Schema(description = "")
  
    @Valid
    public BusinessBuyerEInvoicing getEInvoicing() {
    return eInvoicing;
  }

  public void setEInvoicing(BusinessBuyerEInvoicing eInvoicing) {
    this.eInvoicing = eInvoicing;
  }

  public BusinessBuyer contactPerson(AllOfBusinessBuyerContactPerson contactPerson) {
    this.contactPerson = contactPerson;
    return this;
  }

  /**
   * Get contactPerson
   * @return contactPerson
   **/
  @Schema(required = true, description = "")
      @NotNull

    public AllOfBusinessBuyerContactPerson getContactPerson() {
    return contactPerson;
  }

  public void setContactPerson(AllOfBusinessBuyerContactPerson contactPerson) {
    this.contactPerson = contactPerson;
  }

  public BusinessBuyer contactAddress(BusinessAddress contactAddress) {
    this.contactAddress = contactAddress;
    return this;
  }

  /**
   * Get contactAddress
   * @return contactAddress
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public BusinessAddress getContactAddress() {
    return contactAddress;
  }

  public void setContactAddress(BusinessAddress contactAddress) {
    this.contactAddress = contactAddress;
  }

  public BusinessBuyer billingAddress(BusinessAddress billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

  /**
   * Get billingAddress
   * @return billingAddress
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public BusinessAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(BusinessAddress billingAddress) {
    this.billingAddress = billingAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessBuyer businessBuyer = (BusinessBuyer) o;
    return Objects.equals(this.buyerRef, businessBuyer.buyerRef) &&
        Objects.equals(this.buyerType, businessBuyer.buyerType) &&
        Objects.equals(this.party, businessBuyer.party) &&
        Objects.equals(this.eInvoicing, businessBuyer.eInvoicing) &&
        Objects.equals(this.contactPerson, businessBuyer.contactPerson) &&
        Objects.equals(this.contactAddress, businessBuyer.contactAddress) &&
        Objects.equals(this.billingAddress, businessBuyer.billingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyerRef, buyerType, party, eInvoicing, contactPerson, contactAddress, billingAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessBuyer {\n");
    
    sb.append("    buyerRef: ").append(toIndentedString(buyerRef)).append("\n");
    sb.append("    buyerType: ").append(toIndentedString(buyerType)).append("\n");
    sb.append("    party: ").append(toIndentedString(party)).append("\n");
    sb.append("    eInvoicing: ").append(toIndentedString(eInvoicing)).append("\n");
    sb.append("    contactPerson: ").append(toIndentedString(contactPerson)).append("\n");
    sb.append("    contactAddress: ").append(toIndentedString(contactAddress)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
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
