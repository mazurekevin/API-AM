package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.OperationResponse;
import io.swagger.model.SubscriptionResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describe an invoice
 */
@Schema(description = "Describe an invoice")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:40:10.505Z[GMT]")


public class Invoice   {
  @JsonProperty("invoiceId")
  private String invoiceId = null;

  @JsonProperty("subscription")
  private SubscriptionResponse subscription = null;

  @JsonProperty("operations")
  @Valid
  private List<OperationResponse> operations = new ArrayList<OperationResponse>();

  public Invoice invoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

  /**
   * Invoice Id
   * @return invoiceId
   **/
  @Schema(required = true, description = "Invoice Id")
      @NotNull

    public String getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  public Invoice subscription(SubscriptionResponse subscription) {
    this.subscription = subscription;
    return this;
  }

  /**
   * Get subscription
   * @return subscription
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public SubscriptionResponse getSubscription() {
    return subscription;
  }

  public void setSubscription(SubscriptionResponse subscription) {
    this.subscription = subscription;
  }

  public Invoice operations(List<OperationResponse> operations) {
    this.operations = operations;
    return this;
  }

  public Invoice addOperationsItem(OperationResponse operationsItem) {
    this.operations.add(operationsItem);
    return this;
  }

  /**
   * Get operations
   * @return operations
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<OperationResponse> getOperations() {
    return operations;
  }

  public void setOperations(List<OperationResponse> operations) {
    this.operations = operations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.invoiceId, invoice.invoiceId) &&
        Objects.equals(this.subscription, invoice.subscription) &&
        Objects.equals(this.operations, invoice.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceId, subscription, operations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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
