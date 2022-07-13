package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.OperationRequestOrderOrderItems;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes Purchase or Refund Operation
 */
@Schema(description = "Describes Purchase or Refund Operation")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:40:10.505Z[GMT]")


public class OperationRequestOrder   {
  @JsonProperty("orderRef")
  private String orderRef = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  /**
   * Necessary for e-Invoicing :  LB = Livraison de Biens, PS = Prestation de Service LBPS = Double 
   */
  public enum OrderTypeEnum {
    LB("LB"),
    
    PS("PS"),
    
    LBPS("LBPS");

    private String value;

    OrderTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OrderTypeEnum fromValue(String text) {
      for (OrderTypeEnum b : OrderTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("orderType")
  private OrderTypeEnum orderType = null;

  @JsonProperty("orderItems")
  @Valid
  private List<OperationRequestOrderOrderItems> orderItems = null;

  @JsonProperty("totalWithoutTax")
  private BigDecimal totalWithoutTax = null;

  @JsonProperty("totalTax")
  private BigDecimal totalTax = null;

  @JsonProperty("totalWithTax")
  private BigDecimal totalWithTax = null;

  @JsonProperty("amountEcoParticipation")
  private BigDecimal amountEcoParticipation = null;

  public OperationRequestOrder orderRef(String orderRef) {
    this.orderRef = orderRef;
    return this;
  }

  /**
   * External Order reference
   * @return orderRef
   **/
  @Schema(example = "789e4567-e89b-12d3-a456-556642440000", description = "External Order reference")
  
    public String getOrderRef() {
    return orderRef;
  }

  public void setOrderRef(String orderRef) {
    this.orderRef = orderRef;
  }

  public OperationRequestOrder currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Billing currency code as defined in ISO 4217 ([more information about the standard](https://www.iso.org/fr/iso-4217-currency-codes.html))
   * @return currencyCode
   **/
  @Schema(example = "EUR", description = "Billing currency code as defined in ISO 4217 ([more information about the standard](https://www.iso.org/fr/iso-4217-currency-codes.html))")
  
    public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public OperationRequestOrder orderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
    return this;
  }

  /**
   * Necessary for e-Invoicing :  LB = Livraison de Biens, PS = Prestation de Service LBPS = Double 
   * @return orderType
   **/
  @Schema(example = "LB", description = "Necessary for e-Invoicing :  LB = Livraison de Biens, PS = Prestation de Service LBPS = Double ")
  
    public OrderTypeEnum getOrderType() {
    return orderType;
  }

  public void setOrderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
  }

  public OperationRequestOrder orderItems(List<OperationRequestOrderOrderItems> orderItems) {
    this.orderItems = orderItems;
    return this;
  }

  public OperationRequestOrder addOrderItemsItem(OperationRequestOrderOrderItems orderItemsItem) {
    if (this.orderItems == null) {
      this.orderItems = new ArrayList<OperationRequestOrderOrderItems>();
    }
    this.orderItems.add(orderItemsItem);
    return this;
  }

  /**
   * Get orderItems
   * @return orderItems
   **/
  @Schema(description = "")
      @Valid
    public List<OperationRequestOrderOrderItems> getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(List<OperationRequestOrderOrderItems> orderItems) {
    this.orderItems = orderItems;
  }

  public OperationRequestOrder totalWithoutTax(BigDecimal totalWithoutTax) {
    this.totalWithoutTax = totalWithoutTax;
    return this;
  }

  /**
   * Get totalWithoutTax
   * @return totalWithoutTax
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getTotalWithoutTax() {
    return totalWithoutTax;
  }

  public void setTotalWithoutTax(BigDecimal totalWithoutTax) {
    this.totalWithoutTax = totalWithoutTax;
  }

  public OperationRequestOrder totalTax(BigDecimal totalTax) {
    this.totalTax = totalTax;
    return this;
  }

  /**
   * Get totalTax
   * @return totalTax
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(BigDecimal totalTax) {
    this.totalTax = totalTax;
  }

  public OperationRequestOrder totalWithTax(BigDecimal totalWithTax) {
    this.totalWithTax = totalWithTax;
    return this;
  }

  /**
   * Get totalWithTax
   * @return totalWithTax
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getTotalWithTax() {
    return totalWithTax;
  }

  public void setTotalWithTax(BigDecimal totalWithTax) {
    this.totalWithTax = totalWithTax;
  }

  public OperationRequestOrder amountEcoParticipation(BigDecimal amountEcoParticipation) {
    this.amountEcoParticipation = amountEcoParticipation;
    return this;
  }

  /**
   * Necessary for e-Invoicing
   * @return amountEcoParticipation
   **/
  @Schema(description = "Necessary for e-Invoicing")
  
    @Valid
    public BigDecimal getAmountEcoParticipation() {
    return amountEcoParticipation;
  }

  public void setAmountEcoParticipation(BigDecimal amountEcoParticipation) {
    this.amountEcoParticipation = amountEcoParticipation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationRequestOrder operationRequestOrder = (OperationRequestOrder) o;
    return Objects.equals(this.orderRef, operationRequestOrder.orderRef) &&
        Objects.equals(this.currencyCode, operationRequestOrder.currencyCode) &&
        Objects.equals(this.orderType, operationRequestOrder.orderType) &&
        Objects.equals(this.orderItems, operationRequestOrder.orderItems) &&
        Objects.equals(this.totalWithoutTax, operationRequestOrder.totalWithoutTax) &&
        Objects.equals(this.totalTax, operationRequestOrder.totalTax) &&
        Objects.equals(this.totalWithTax, operationRequestOrder.totalWithTax) &&
        Objects.equals(this.amountEcoParticipation, operationRequestOrder.amountEcoParticipation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderRef, currencyCode, orderType, orderItems, totalWithoutTax, totalTax, totalWithTax, amountEcoParticipation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationRequestOrder {\n");
    
    sb.append("    orderRef: ").append(toIndentedString(orderRef)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
    sb.append("    totalWithoutTax: ").append(toIndentedString(totalWithoutTax)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    totalWithTax: ").append(toIndentedString(totalWithTax)).append("\n");
    sb.append("    amountEcoParticipation: ").append(toIndentedString(amountEcoParticipation)).append("\n");
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
