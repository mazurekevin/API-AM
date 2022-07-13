package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CurrentBill
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:40:10.505Z[GMT]")


public class CurrentBill   {
  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("bill")
  private BigDecimal bill = null;

  public CurrentBill customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Customer Id
   * @return customerId
   **/
  @Schema(description = "Customer Id")
  
    public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public CurrentBill bill(BigDecimal bill) {
    this.bill = bill;
    return this;
  }

  /**
   * Customer current bill
   * @return bill
   **/
  @Schema(description = "Customer current bill")
  
    @Valid
    public BigDecimal getBill() {
    return bill;
  }

  public void setBill(BigDecimal bill) {
    this.bill = bill;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentBill currentBill = (CurrentBill) o;
    return Objects.equals(this.customerId, currentBill.customerId) &&
        Objects.equals(this.bill, currentBill.bill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, bill);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentBill {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    bill: ").append(toIndentedString(bill)).append("\n");
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
