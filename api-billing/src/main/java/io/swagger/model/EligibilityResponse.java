package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BusinessAddress;
import io.swagger.model.EligibilityResponseBillingInProgress;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Returns
 */
@Schema(description = "Returns")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:40:10.505Z[GMT]")


public class EligibilityResponse   {
  @JsonProperty("customerRef")
  private String customerRef = null;

  @JsonProperty("subscriptionRef")
  private String subscriptionRef = null;

  @JsonProperty("contractRef")
  private String contractRef = null;

  @JsonProperty("contractStatus")
  private String contractStatus = null;

  @JsonProperty("billingAddress")
  private BusinessAddress billingAddress = null;

  @JsonProperty("billingInProgress")
  private EligibilityResponseBillingInProgress billingInProgress = null;

  public EligibilityResponse customerRef(String customerRef) {
    this.customerRef = customerRef;
    return this;
  }

  /**
   * Get customerRef
   * @return customerRef
   **/
  @Schema(description = "")
  
    public String getCustomerRef() {
    return customerRef;
  }

  public void setCustomerRef(String customerRef) {
    this.customerRef = customerRef;
  }

  public EligibilityResponse subscriptionRef(String subscriptionRef) {
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

  public EligibilityResponse contractRef(String contractRef) {
    this.contractRef = contractRef;
    return this;
  }

  /**
   * Get contractRef
   * @return contractRef
   **/
  @Schema(description = "")
  
    public String getContractRef() {
    return contractRef;
  }

  public void setContractRef(String contractRef) {
    this.contractRef = contractRef;
  }

  public EligibilityResponse contractStatus(String contractStatus) {
    this.contractStatus = contractStatus;
    return this;
  }

  /**
   * Get contractStatus
   * @return contractStatus
   **/
  @Schema(description = "")
  
    public String getContractStatus() {
    return contractStatus;
  }

  public void setContractStatus(String contractStatus) {
    this.contractStatus = contractStatus;
  }

  public EligibilityResponse billingAddress(BusinessAddress billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

  /**
   * Get billingAddress
   * @return billingAddress
   **/
  @Schema(description = "")
  
    @Valid
    public BusinessAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(BusinessAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  public EligibilityResponse billingInProgress(EligibilityResponseBillingInProgress billingInProgress) {
    this.billingInProgress = billingInProgress;
    return this;
  }

  /**
   * Get billingInProgress
   * @return billingInProgress
   **/
  @Schema(description = "")
  
    @Valid
    public EligibilityResponseBillingInProgress getBillingInProgress() {
    return billingInProgress;
  }

  public void setBillingInProgress(EligibilityResponseBillingInProgress billingInProgress) {
    this.billingInProgress = billingInProgress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EligibilityResponse eligibilityResponse = (EligibilityResponse) o;
    return Objects.equals(this.customerRef, eligibilityResponse.customerRef) &&
        Objects.equals(this.subscriptionRef, eligibilityResponse.subscriptionRef) &&
        Objects.equals(this.contractRef, eligibilityResponse.contractRef) &&
        Objects.equals(this.contractStatus, eligibilityResponse.contractStatus) &&
        Objects.equals(this.billingAddress, eligibilityResponse.billingAddress) &&
        Objects.equals(this.billingInProgress, eligibilityResponse.billingInProgress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerRef, subscriptionRef, contractRef, contractStatus, billingAddress, billingInProgress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EligibilityResponse {\n");
    
    sb.append("    customerRef: ").append(toIndentedString(customerRef)).append("\n");
    sb.append("    subscriptionRef: ").append(toIndentedString(subscriptionRef)).append("\n");
    sb.append("    contractRef: ").append(toIndentedString(contractRef)).append("\n");
    sb.append("    contractStatus: ").append(toIndentedString(contractStatus)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    billingInProgress: ").append(toIndentedString(billingInProgress)).append("\n");
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
