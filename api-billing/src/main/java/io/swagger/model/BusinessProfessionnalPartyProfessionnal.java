package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Desribes professionnal party
 */
@Schema(description = "Desribes professionnal party")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:40:10.505Z[GMT]")


public class BusinessProfessionnalPartyProfessionnal   {
  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("customerRef")
  private String customerRef = null;

  public BusinessProfessionnalPartyProfessionnal customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Internal Identifier of organisation
   * @return customerId
   **/
  @Schema(example = "PRO-8996786873", description = "Internal Identifier of organisation")
  
    public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public BusinessProfessionnalPartyProfessionnal customerRef(String customerRef) {
    this.customerRef = customerRef;
    return this;
  }

  /**
   * External identifier of organisation
   * @return customerRef
   **/
  @Schema(example = "EXT-8996786873", description = "External identifier of organisation")
  
    public String getCustomerRef() {
    return customerRef;
  }

  public void setCustomerRef(String customerRef) {
    this.customerRef = customerRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessProfessionnalPartyProfessionnal businessProfessionnalPartyProfessionnal = (BusinessProfessionnalPartyProfessionnal) o;
    return Objects.equals(this.customerId, businessProfessionnalPartyProfessionnal.customerId) &&
        Objects.equals(this.customerRef, businessProfessionnalPartyProfessionnal.customerRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, customerRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessProfessionnalPartyProfessionnal {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerRef: ").append(toIndentedString(customerRef)).append("\n");
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
