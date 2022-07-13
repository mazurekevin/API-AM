package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationResponseBilling
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:40:10.505Z[GMT]")


public class OperationResponseBilling   {
  @JsonProperty("subscriptionRef")
  private String subscriptionRef = null;

  @JsonProperty("createdAt")
  private LocalDate createdAt = null;

  @JsonProperty("commingSoon")
  private Object commingSoon = null;

  public OperationResponseBilling subscriptionRef(String subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
    return this;
  }

  /**
   * Get subscriptionRef
   * @return subscriptionRef
   **/
  @Schema(description = "")
  
    public String getSubscriptionRef() {
    return subscriptionRef;
  }

  public void setSubscriptionRef(String subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
  }

  public OperationResponseBilling createdAt(LocalDate createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   **/
  @Schema(description = "")
  
    @Valid
    public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }

  public OperationResponseBilling commingSoon(Object commingSoon) {
    this.commingSoon = commingSoon;
    return this;
  }

  /**
   * Get commingSoon
   * @return commingSoon
   **/
  @Schema(description = "")
  
    public Object getCommingSoon() {
    return commingSoon;
  }

  public void setCommingSoon(Object commingSoon) {
    this.commingSoon = commingSoon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationResponseBilling operationResponseBilling = (OperationResponseBilling) o;
    return Objects.equals(this.subscriptionRef, operationResponseBilling.subscriptionRef) &&
        Objects.equals(this.createdAt, operationResponseBilling.createdAt) &&
        Objects.equals(this.commingSoon, operationResponseBilling.commingSoon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionRef, createdAt, commingSoon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationResponseBilling {\n");
    
    sb.append("    subscriptionRef: ").append(toIndentedString(subscriptionRef)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    commingSoon: ").append(toIndentedString(commingSoon)).append("\n");
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
