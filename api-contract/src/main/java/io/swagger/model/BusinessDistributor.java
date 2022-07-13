package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BusinessAddress;
import io.swagger.model.BusinessDistributorEFacturation;
import io.swagger.model.BusinessPerson;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes distributor organisation &amp; contact
 */
@Schema(description = "Describes distributor organisation & contact")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:46:33.636Z[GMT]")


public class BusinessDistributor   {
  @JsonProperty("disributorRef")
  private String disributorRef = null;

  @JsonProperty("eFacturation")
  private BusinessDistributorEFacturation eFacturation = null;

  @JsonProperty("contactPerson")
  private BusinessPerson contactPerson = null;

  @JsonProperty("contactAddress")
  private BusinessAddress contactAddress = null;

  public BusinessDistributor disributorRef(String disributorRef) {
    this.disributorRef = disributorRef;
    return this;
  }

  /**
   * External reference of distributor
   * @return disributorRef
   **/
  @Schema(example = "esgi SA", description = "External reference of distributor")
  
    public String getDisributorRef() {
    return disributorRef;
  }

  public void setDisributorRef(String disributorRef) {
    this.disributorRef = disributorRef;
  }

  public BusinessDistributor eFacturation(BusinessDistributorEFacturation eFacturation) {
    this.eFacturation = eFacturation;
    return this;
  }

  /**
   * Get eFacturation
   * @return eFacturation
   **/
  @Schema(description = "")
  
    @Valid
    public BusinessDistributorEFacturation getEFacturation() {
    return eFacturation;
  }

  public void setEFacturation(BusinessDistributorEFacturation eFacturation) {
    this.eFacturation = eFacturation;
  }

  public BusinessDistributor contactPerson(BusinessPerson contactPerson) {
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

  public BusinessDistributor contactAddress(BusinessAddress contactAddress) {
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
    BusinessDistributor businessDistributor = (BusinessDistributor) o;
    return Objects.equals(this.disributorRef, businessDistributor.disributorRef) &&
        Objects.equals(this.eFacturation, businessDistributor.eFacturation) &&
        Objects.equals(this.contactPerson, businessDistributor.contactPerson) &&
        Objects.equals(this.contactAddress, businessDistributor.contactAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disributorRef, eFacturation, contactPerson, contactAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessDistributor {\n");
    
    sb.append("    disributorRef: ").append(toIndentedString(disributorRef)).append("\n");
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
