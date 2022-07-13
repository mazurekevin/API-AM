package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BusinessParticularPartyParticular
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:40:10.505Z[GMT]")


public class BusinessParticularPartyParticular   {
  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("customerRef")
  private String customerRef = null;

  public BusinessParticularPartyParticular customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Internal Identifier of person
   * @return customerId
   **/
  @Schema(example = "PRO-8996786873", description = "Internal Identifier of person")
  
    public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public BusinessParticularPartyParticular customerRef(String customerRef) {
    this.customerRef = customerRef;
    return this;
  }

  /**
   * External identifier of organisation (i.e. firstName + lastName)
   * @return customerRef
   **/
  @Schema(example = "John DOE", description = "External identifier of organisation (i.e. firstName + lastName)")
  
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
    BusinessParticularPartyParticular businessParticularPartyParticular = (BusinessParticularPartyParticular) o;
    return Objects.equals(this.customerId, businessParticularPartyParticular.customerId) &&
        Objects.equals(this.customerRef, businessParticularPartyParticular.customerRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, customerRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessParticularPartyParticular {\n");
    
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
