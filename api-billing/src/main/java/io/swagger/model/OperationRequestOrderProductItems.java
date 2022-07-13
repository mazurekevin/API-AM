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
 * OperationRequestOrderProductItems
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:40:10.505Z[GMT]")


public class OperationRequestOrderProductItems   {
  @JsonProperty("productRef")
  private String productRef = null;

  @JsonProperty("productLabel")
  private String productLabel = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("packaging")
  private String packaging = null;

  @JsonProperty("unitPrice")
  private BigDecimal unitPrice = null;

  @JsonProperty("vatRate")
  private BigDecimal vatRate = null;

  @JsonProperty("amountWithoutTax")
  private BigDecimal amountWithoutTax = null;

  @JsonProperty("amountTax")
  private BigDecimal amountTax = null;

  @JsonProperty("amountWithTax")
  private BigDecimal amountWithTax = null;

  @JsonProperty("amountEcoParticipation")
  private BigDecimal amountEcoParticipation = null;

  public OperationRequestOrderProductItems productRef(String productRef) {
    this.productRef = productRef;
    return this;
  }

  /**
   * Get productRef
   * @return productRef
   **/
  @Schema(description = "")
  
    public String getProductRef() {
    return productRef;
  }

  public void setProductRef(String productRef) {
    this.productRef = productRef;
  }

  public OperationRequestOrderProductItems productLabel(String productLabel) {
    this.productLabel = productLabel;
    return this;
  }

  /**
   * Get productLabel
   * @return productLabel
   **/
  @Schema(description = "")
  
    public String getProductLabel() {
    return productLabel;
  }

  public void setProductLabel(String productLabel) {
    this.productLabel = productLabel;
  }

  public OperationRequestOrderProductItems quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
   **/
  @Schema(description = "")
  
    public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public OperationRequestOrderProductItems packaging(String packaging) {
    this.packaging = packaging;
    return this;
  }

  /**
   * Get packaging
   * @return packaging
   **/
  @Schema(description = "")
  
    public String getPackaging() {
    return packaging;
  }

  public void setPackaging(String packaging) {
    this.packaging = packaging;
  }

  public OperationRequestOrderProductItems unitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * Get unitPrice
   * @return unitPrice
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }

  public OperationRequestOrderProductItems vatRate(BigDecimal vatRate) {
    this.vatRate = vatRate;
    return this;
  }

  /**
   * Get vatRate
   * @return vatRate
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getVatRate() {
    return vatRate;
  }

  public void setVatRate(BigDecimal vatRate) {
    this.vatRate = vatRate;
  }

  public OperationRequestOrderProductItems amountWithoutTax(BigDecimal amountWithoutTax) {
    this.amountWithoutTax = amountWithoutTax;
    return this;
  }

  /**
   * Get amountWithoutTax
   * @return amountWithoutTax
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getAmountWithoutTax() {
    return amountWithoutTax;
  }

  public void setAmountWithoutTax(BigDecimal amountWithoutTax) {
    this.amountWithoutTax = amountWithoutTax;
  }

  public OperationRequestOrderProductItems amountTax(BigDecimal amountTax) {
    this.amountTax = amountTax;
    return this;
  }

  /**
   * Get amountTax
   * @return amountTax
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getAmountTax() {
    return amountTax;
  }

  public void setAmountTax(BigDecimal amountTax) {
    this.amountTax = amountTax;
  }

  public OperationRequestOrderProductItems amountWithTax(BigDecimal amountWithTax) {
    this.amountWithTax = amountWithTax;
    return this;
  }

  /**
   * Get amountWithTax
   * @return amountWithTax
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getAmountWithTax() {
    return amountWithTax;
  }

  public void setAmountWithTax(BigDecimal amountWithTax) {
    this.amountWithTax = amountWithTax;
  }

  public OperationRequestOrderProductItems amountEcoParticipation(BigDecimal amountEcoParticipation) {
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
    OperationRequestOrderProductItems operationRequestOrderProductItems = (OperationRequestOrderProductItems) o;
    return Objects.equals(this.productRef, operationRequestOrderProductItems.productRef) &&
        Objects.equals(this.productLabel, operationRequestOrderProductItems.productLabel) &&
        Objects.equals(this.quantity, operationRequestOrderProductItems.quantity) &&
        Objects.equals(this.packaging, operationRequestOrderProductItems.packaging) &&
        Objects.equals(this.unitPrice, operationRequestOrderProductItems.unitPrice) &&
        Objects.equals(this.vatRate, operationRequestOrderProductItems.vatRate) &&
        Objects.equals(this.amountWithoutTax, operationRequestOrderProductItems.amountWithoutTax) &&
        Objects.equals(this.amountTax, operationRequestOrderProductItems.amountTax) &&
        Objects.equals(this.amountWithTax, operationRequestOrderProductItems.amountWithTax) &&
        Objects.equals(this.amountEcoParticipation, operationRequestOrderProductItems.amountEcoParticipation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productRef, productLabel, quantity, packaging, unitPrice, vatRate, amountWithoutTax, amountTax, amountWithTax, amountEcoParticipation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationRequestOrderProductItems {\n");
    
    sb.append("    productRef: ").append(toIndentedString(productRef)).append("\n");
    sb.append("    productLabel: ").append(toIndentedString(productLabel)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    packaging: ").append(toIndentedString(packaging)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    vatRate: ").append(toIndentedString(vatRate)).append("\n");
    sb.append("    amountWithoutTax: ").append(toIndentedString(amountWithoutTax)).append("\n");
    sb.append("    amountTax: ").append(toIndentedString(amountTax)).append("\n");
    sb.append("    amountWithTax: ").append(toIndentedString(amountWithTax)).append("\n");
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
