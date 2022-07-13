package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BusinessAddress;
import io.swagger.model.BusinessPerson;
import io.swagger.model.BusinessSellerEFacturation;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes seller organisation &amp; contact
 */
@Schema(description = "Describes seller organisation & contact")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:40:10.505Z[GMT]")


public class BusinessSeller   {
  @JsonProperty("sellerRef")
  private String sellerRef = null;

  @JsonProperty("eFacturation")
  private BusinessSellerEFacturation eFacturation = null;

  @JsonProperty("contactPerson")
  private BusinessPerson contactPerson = null;

  @JsonProperty("contactAddress")
  private BusinessAddress contactAddress = null;

  public BusinessSeller sellerRef(String sellerRef) {
    this.sellerRef = sellerRef;
    return this;
  }

  /**
   * External reference of seller
   * @return sellerRef
   **/
  @Schema(example = "esgi SA", description = "External reference of seller")
  
    public String getSellerRef() {
    return sellerRef;
  }

  public void setSellerRef(String sellerRef) {
    this.sellerRef = sellerRef;
  }

  public BusinessSeller eFacturation(BusinessSellerEFacturation eFacturation) {
    this.eFacturation = eFacturation;
    return this;
  }

  /**
   * Get eFacturation
   * @return eFacturation
   **/
  @Schema(description = "")
  
    @Valid
    public BusinessSellerEFacturation getEFacturation() {
    return eFacturation;
  }

  public void setEFacturation(BusinessSellerEFacturation eFacturation) {
    this.eFacturation = eFacturation;
  }

  public BusinessSeller contactPerson(BusinessPerson contactPerson) {
    this.contactPerson = contactPerson;
    return this;
  }

  /**
   * Get contactPerson
   * @return contactPerson
   **/
  @Schema(description = "")
  
    @Valid
    public BusinessPerson getContactPerson() {
    return contactPerson;
  }

  public void setContactPerson(BusinessPerson contactPerson) {
    this.contactPerson = contactPerson;
  }

  public BusinessSeller contactAddress(BusinessAddress contactAddress) {
    this.contactAddress = contactAddress;
    return this;
  }

  /**
   * Get contactAddress
   * @return contactAddress
   **/
  @Schema(description = "")
  
    @Valid
    public BusinessAddress getContactAddress() {
    return contactAddress;
  }

  public void setContactAddress(BusinessAddress contactAddress) {
    this.contactAddress = contactAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessSeller businessSeller = (BusinessSeller) o;
    return Objects.equals(this.sellerRef, businessSeller.sellerRef) &&
        Objects.equals(this.eFacturation, businessSeller.eFacturation) &&
        Objects.equals(this.contactPerson, businessSeller.contactPerson) &&
        Objects.equals(this.contactAddress, businessSeller.contactAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerRef, eFacturation, contactPerson, contactAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessSeller {\n");
    
    sb.append("    sellerRef: ").append(toIndentedString(sellerRef)).append("\n");
    sb.append("    eFacturation: ").append(toIndentedString(eFacturation)).append("\n");
    sb.append("    contactPerson: ").append(toIndentedString(contactPerson)).append("\n");
    sb.append("    contactAddress: ").append(toIndentedString(contactAddress)).append("\n");
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
