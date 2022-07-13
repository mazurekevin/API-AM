package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.BusinessBuyer;
import io.swagger.model.BusinessContract;
import io.swagger.model.BusinessPayment;
import io.swagger.model.BusinessSeller;
import io.swagger.model.SubscriptionRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubscriptionResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:40:10.505Z[GMT]")


public class SubscriptionResponse   {
  /**
   * Type of subscription
   */
  public enum SubscriptionTypeEnum {
    DEFERRED_BILLING("DEFERRED_BILLING");

    private String value;

    SubscriptionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SubscriptionTypeEnum fromValue(String text) {
      for (SubscriptionTypeEnum b : SubscriptionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("subscriptionType")
  private SubscriptionTypeEnum subscriptionType = null;

  @JsonProperty("contract")
  private BusinessContract contract = null;

  @JsonProperty("seller")
  private BusinessSeller seller = null;

  @JsonProperty("buyer")
  private BusinessBuyer buyer = null;

  @JsonProperty("payment")
  private BusinessPayment payment = null;

  public SubscriptionResponse subscriptionType(SubscriptionTypeEnum subscriptionType) {
    this.subscriptionType = subscriptionType;
    return this;
  }

  /**
   * Type of subscription
   * @return subscriptionType
   **/
  @Schema(example = "DEFERRED_BILLING", required = true, description = "Type of subscription")
      @NotNull

    public SubscriptionTypeEnum getSubscriptionType() {
    return subscriptionType;
  }

  public void setSubscriptionType(SubscriptionTypeEnum subscriptionType) {
    this.subscriptionType = subscriptionType;
  }

  public SubscriptionResponse contract(BusinessContract contract) {
    this.contract = contract;
    return this;
  }

  /**
   * Get contract
   * @return contract
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public BusinessContract getContract() {
    return contract;
  }

  public void setContract(BusinessContract contract) {
    this.contract = contract;
  }

  public SubscriptionResponse seller(BusinessSeller seller) {
    this.seller = seller;
    return this;
  }

  /**
   * Get seller
   * @return seller
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public BusinessSeller getSeller() {
    return seller;
  }

  public void setSeller(BusinessSeller seller) {
    this.seller = seller;
  }

  public SubscriptionResponse buyer(BusinessBuyer buyer) {
    this.buyer = buyer;
    return this;
  }

  /**
   * Get buyer
   * @return buyer
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public BusinessBuyer getBuyer() {
    return buyer;
  }

  public void setBuyer(BusinessBuyer buyer) {
    this.buyer = buyer;
  }

  public SubscriptionResponse payment(BusinessPayment payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
   **/
  @Schema(required = true, description = "")
      @NotNull

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
    SubscriptionResponse subscriptionResponse = (SubscriptionResponse) o;
    return Objects.equals(this.subscriptionType, subscriptionResponse.subscriptionType) &&
        Objects.equals(this.contract, subscriptionResponse.contract) &&
        Objects.equals(this.seller, subscriptionResponse.seller) &&
        Objects.equals(this.buyer, subscriptionResponse.buyer) &&
        Objects.equals(this.payment, subscriptionResponse.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionType, contract, seller, buyer, payment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionResponse {\n");
    
    sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
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
