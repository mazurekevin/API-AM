package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.WireTransfertResource;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes the payment method used
 */
@Schema(description = "Describes the payment method used")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:46:33.636Z[GMT]")


public class BusinessPayment   {
  /**
   * Payment method type (Only WIRETRANSFER for differed billing phase 1)
   */
  public enum PaymentMethodTypeEnum {
    WIRETRANSFER("WIRETRANSFER");

    private String value;

    PaymentMethodTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PaymentMethodTypeEnum fromValue(String text) {
      for (PaymentMethodTypeEnum b : PaymentMethodTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("paymentMethodType")
  private PaymentMethodTypeEnum paymentMethodType = null;

  @JsonProperty("wireTansfert")
  private WireTransfertResource wireTansfert = null;

  public BusinessPayment paymentMethodType(PaymentMethodTypeEnum paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
    return this;
  }

  /**
   * Payment method type (Only WIRETRANSFER for differed billing phase 1)
   * @return paymentMethodType
   **/
  @Schema(example = "WIRETRANSFER", required = true, description = "Payment method type (Only WIRETRANSFER for differed billing phase 1)")
      @NotNull

    public PaymentMethodTypeEnum getPaymentMethodType() {
    return paymentMethodType;
  }

  public void setPaymentMethodType(PaymentMethodTypeEnum paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }

  public BusinessPayment wireTansfert(WireTransfertResource wireTansfert) {
    this.wireTansfert = wireTansfert;
    return this;
  }

  /**
   * Get wireTansfert
   * @return wireTansfert
   **/
  @Schema(description = "")
  
    @Valid
    public WireTransfertResource getWireTansfert() {
    return wireTansfert;
  }

  public void setWireTansfert(WireTransfertResource wireTansfert) {
    this.wireTansfert = wireTansfert;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessPayment businessPayment = (BusinessPayment) o;
    return Objects.equals(this.paymentMethodType, businessPayment.paymentMethodType) &&
        Objects.equals(this.wireTansfert, businessPayment.wireTansfert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethodType, wireTansfert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessPayment {\n");
    
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    wireTansfert: ").append(toIndentedString(wireTansfert)).append("\n");
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
