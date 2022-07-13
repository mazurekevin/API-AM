package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.BusinessAddress;
import io.swagger.model.BusinessSubscriberEInvoicing;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes subscriber organisation &amp; contact
 */
@Schema(description = "Describes subscriber organisation & contact")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:46:33.636Z[GMT]")


public class BusinessSubscriber   {
  @JsonProperty("subscriberRef")
  private String subscriberRef = null;

  /**
   * Gets or Sets subscriberType
   */
  public enum SubscriberTypeEnum {
    PARTICULAR("PARTICULAR"),
    
    PROFESSIONNAL("PROFESSIONNAL");

    private String value;

    SubscriberTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SubscriberTypeEnum fromValue(String text) {
      for (SubscriberTypeEnum b : SubscriberTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("subscriberType")
  private SubscriberTypeEnum subscriberType = null;

  @JsonProperty("party")
  private OneOfBusinessSubscriberParty party = null;

  @JsonProperty("eInvoicing")
  private BusinessSubscriberEInvoicing eInvoicing = null;

  @JsonProperty("contactPerson")
  private AllOfBusinessSubscriberContactPerson contactPerson = null;

  @JsonProperty("contactAddress")
  private BusinessAddress contactAddress = null;

  @JsonProperty("billingAddress")
  private BusinessAddress billingAddress = null;

  public BusinessSubscriber subscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
    return this;
  }

  /**
   * External reference of subscriber (By example: social reason of the company)
   * @return subscriberRef
   **/
  @Schema(example = "Ma Petite Entreprise", description = "External reference of subscriber (By example: social reason of the company)")
  
    public String getSubscriberRef() {
    return subscriberRef;
  }

  public void setSubscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
  }

  public BusinessSubscriber subscriberType(SubscriberTypeEnum subscriberType) {
    this.subscriberType = subscriberType;
    return this;
  }

  /**
   * Get subscriberType
   * @return subscriberType
   **/
  @Schema(example = "PROFESSIONNAL", required = true, description = "")
      @NotNull

    public SubscriberTypeEnum getSubscriberType() {
    return subscriberType;
  }

  public void setSubscriberType(SubscriberTypeEnum subscriberType) {
    this.subscriberType = subscriberType;
  }

  public BusinessSubscriber party(OneOfBusinessSubscriberParty party) {
    this.party = party;
    return this;
  }

  /**
   * Get party
   * @return party
   **/
  @Schema(description = "")
  
    public OneOfBusinessSubscriberParty getParty() {
    return party;
  }

  public void setParty(OneOfBusinessSubscriberParty party) {
    this.party = party;
  }

  public BusinessSubscriber eInvoicing(BusinessSubscriberEInvoicing eInvoicing) {
    this.eInvoicing = eInvoicing;
    return this;
  }

  /**
   * Get eInvoicing
   * @return eInvoicing
   **/
  @Schema(description = "")
  
    @Valid
    public BusinessSubscriberEInvoicing getEInvoicing() {
    return eInvoicing;
  }

  public void setEInvoicing(BusinessSubscriberEInvoicing eInvoicing) {
    this.eInvoicing = eInvoicing;
  }

  public BusinessSubscriber contactPerson(AllOfBusinessSubscriberContactPerson contactPerson) {
    this.contactPerson = contactPerson;
    return this;
  }

  /**
   * Get contactPerson
   * @return contactPerson
   **/
  @Schema(required = true, description = "")
      @NotNull

    public AllOfBusinessSubscriberContactPerson getContactPerson() {
    return contactPerson;
  }

  public void setContactPerson(AllOfBusinessSubscriberContactPerson contactPerson) {
    this.contactPerson = contactPerson;
  }

  public BusinessSubscriber contactAddress(BusinessAddress contactAddress) {
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

  public BusinessSubscriber billingAddress(BusinessAddress billingAddress) {
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
    BusinessSubscriber businessSubscriber = (BusinessSubscriber) o;
    return Objects.equals(this.subscriberRef, businessSubscriber.subscriberRef) &&
        Objects.equals(this.subscriberType, businessSubscriber.subscriberType) &&
        Objects.equals(this.party, businessSubscriber.party) &&
        Objects.equals(this.eInvoicing, businessSubscriber.eInvoicing) &&
        Objects.equals(this.contactPerson, businessSubscriber.contactPerson) &&
        Objects.equals(this.contactAddress, businessSubscriber.contactAddress) &&
        Objects.equals(this.billingAddress, businessSubscriber.billingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriberRef, subscriberType, party, eInvoicing, contactPerson, contactAddress, billingAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessSubscriber {\n");
    
    sb.append("    subscriberRef: ").append(toIndentedString(subscriberRef)).append("\n");
    sb.append("    subscriberType: ").append(toIndentedString(subscriberType)).append("\n");
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
