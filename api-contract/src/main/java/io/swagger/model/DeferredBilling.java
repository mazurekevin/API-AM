package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BusinessPayment;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describe billing contract
 */
@Schema(description = "Describe billing contract")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:46:33.636Z[GMT]")


public class DeferredBilling  implements OneOfContractRequestCustom {
  @JsonProperty("creditLimit")
  private Integer creditLimit = null;

  @JsonProperty("payment")
  private BusinessPayment payment = null;

  public DeferredBilling creditLimit(Integer creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

  /**
   * Get creditLimit
   * @return creditLimit
   **/
  @Schema(example = "3000", description = "")
  
    public Integer getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(Integer creditLimit) {
    this.creditLimit = creditLimit;
  }

  public DeferredBilling payment(BusinessPayment payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
   **/
  @Schema(description = "")
  
    @Valid
    public BusinessPayment getPayment() {
    return payment;
  }

  public void setPayment(BusinessPayment payment) {
    this.payment = payment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeferredBilling deferredBilling = (DeferredBilling) o;
    return Objects.equals(this.creditLimit, deferredBilling.creditLimit) &&
        Objects.equals(this.payment, deferredBilling.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditLimit, payment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeferredBilling {\n");
    
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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
