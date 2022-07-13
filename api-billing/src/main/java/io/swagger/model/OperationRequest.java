package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.OperationRequestOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes an Operation added to deferred billing
 */
@Schema(description = "Describes an Operation added to deferred billing")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:40:10.505Z[GMT]")


public class OperationRequest   {
  @JsonProperty("customerRef")
  private String customerRef = null;

  @JsonProperty("operationAt")
  private LocalDate operationAt = null;

  @JsonProperty("order")
  private OperationRequestOrder order = null;

  public OperationRequest customerRef(String customerRef) {
    this.customerRef = customerRef;
    return this;
  }

  /**
   * External identifier of the Customer
   * @return customerRef
   **/
  @Schema(example = "HA-8768376537", description = "External identifier of the Customer")
  
    public String getCustomerRef() {
    return customerRef;
  }

  public void setCustomerRef(String customerRef) {
    this.customerRef = customerRef;
  }

  public OperationRequest operationAt(LocalDate operationAt) {
    this.operationAt = operationAt;
    return this;
  }

  /**
   * Transaction date in the sales system as defined in ISO 8601 ([more information about the standar](https://www.iso.org/fr/iso-8601-date-and-time-format.html)).  Used format : YYYY-MM-DD 
   * @return operationAt
   **/
  @Schema(example = "Wed Apr 27 00:00:00 GMT 2022", description = "Transaction date in the sales system as defined in ISO 8601 ([more information about the standar](https://www.iso.org/fr/iso-8601-date-and-time-format.html)).  Used format : YYYY-MM-DD ")
  
    @Valid
    public LocalDate getOperationAt() {
    return operationAt;
  }

  public void setOperationAt(LocalDate operationAt) {
    this.operationAt = operationAt;
  }

  public OperationRequest order(OperationRequestOrder order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
   **/
  @Schema(description = "")
  
    @Valid
    public OperationRequestOrder getOrder() {
    return order;
  }

  public void setOrder(OperationRequestOrder order) {
    this.order = order;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationRequest operationRequest = (OperationRequest) o;
    return Objects.equals(this.customerRef, operationRequest.customerRef) &&
        Objects.equals(this.operationAt, operationRequest.operationAt) &&
        Objects.equals(this.order, operationRequest.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerRef, operationAt, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationRequest {\n");
    
    sb.append("    customerRef: ").append(toIndentedString(customerRef)).append("\n");
    sb.append("    operationAt: ").append(toIndentedString(operationAt)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
