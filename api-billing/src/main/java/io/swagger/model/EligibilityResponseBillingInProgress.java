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
 * EligibilityResponseBillingInProgress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:40:10.505Z[GMT]")


public class EligibilityResponseBillingInProgress   {
  @JsonProperty("amountWithoutTax")
  private BigDecimal amountWithoutTax = null;

  @JsonProperty("amountTax")
  private BigDecimal amountTax = null;

  @JsonProperty("amountWithTax")
  private BigDecimal amountWithTax = null;

  @JsonProperty("amountEcoParticipation")
  private BigDecimal amountEcoParticipation = null;

  public EligibilityResponseBillingInProgress amountWithoutTax(BigDecimal amountWithoutTax) {
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

  public EligibilityResponseBillingInProgress amountTax(BigDecimal amountTax) {
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

  public EligibilityResponseBillingInProgress amountWithTax(BigDecimal amountWithTax) {
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

  public EligibilityResponseBillingInProgress amountEcoParticipation(BigDecimal amountEcoParticipation) {
    this.amountEcoParticipation = amountEcoParticipation;
    return this;
  }

  /**
   * Get amountEcoParticipation
   * @return amountEcoParticipation
   **/
  @Schema(description = "")
  
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
    EligibilityResponseBillingInProgress eligibilityResponseBillingInProgress = (EligibilityResponseBillingInProgress) o;
    return Objects.equals(this.amountWithoutTax, eligibilityResponseBillingInProgress.amountWithoutTax) &&
        Objects.equals(this.amountTax, eligibilityResponseBillingInProgress.amountTax) &&
        Objects.equals(this.amountWithTax, eligibilityResponseBillingInProgress.amountWithTax) &&
        Objects.equals(this.amountEcoParticipation, eligibilityResponseBillingInProgress.amountEcoParticipation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountWithoutTax, amountTax, amountWithTax, amountEcoParticipation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EligibilityResponseBillingInProgress {\n");
    
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
