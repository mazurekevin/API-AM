package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describe business contract
 */
@Schema(description = "Describe business contract")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:40:10.505Z[GMT]")


public class BusinessContract   {
  @JsonProperty("contractId")
  private Integer contractId = null;

  @JsonProperty("contractRef")
  private String contractRef = null;

  @JsonProperty("createdAt")
  private LocalDate createdAt = null;

  @JsonProperty("activatedAt")
  private LocalDate activatedAt = null;

  @JsonProperty("expireAt")
  private LocalDate expireAt = null;

  /**
   * Status of contact
   */
  public enum StatusEnum {
    CREATED("CREATED"),
    
    ACTIVATED("ACTIVATED"),
    
    SUSPENDED("SUSPENDED"),
    
    EXPIRED("EXPIRED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  public BusinessContract contractId(Integer contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Internal identifier of the subscription
   * @return contractId
   **/
  @Schema(example = "786876725453", description = "Internal identifier of the subscription")
  
    public Integer getContractId() {
    return contractId;
  }

  public void setContractId(Integer contractId) {
    this.contractId = contractId;
  }

  public BusinessContract contractRef(String contractRef) {
    this.contractRef = contractRef;
    return this;
  }

  /**
   * External contract reference
   * @return contractRef
   **/
  @Schema(example = "CTR-JHKJQGFSHFHGS", description = "External contract reference")
  
    public String getContractRef() {
    return contractRef;
  }

  public void setContractRef(String contractRef) {
    this.contractRef = contractRef;
  }

  public BusinessContract createdAt(LocalDate createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation date of contract (use ISO 8601 format YYYY-MM-DD)
   * @return createdAt
   **/
  @Schema(example = "Fri Apr 22 00:00:00 GMT 2022", description = "Creation date of contract (use ISO 8601 format YYYY-MM-DD)")
  
    @Valid
    public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }

  public BusinessContract activatedAt(LocalDate activatedAt) {
    this.activatedAt = activatedAt;
    return this;
  }

  /**
   * Activation date of contract (use ISO 8601 format YYYY-MM-DD)
   * @return activatedAt
   **/
  @Schema(example = "Sun Apr 24 00:00:00 GMT 2022", description = "Activation date of contract (use ISO 8601 format YYYY-MM-DD)")
  
    @Valid
    public LocalDate getActivatedAt() {
    return activatedAt;
  }

  public void setActivatedAt(LocalDate activatedAt) {
    this.activatedAt = activatedAt;
  }

  public BusinessContract expireAt(LocalDate expireAt) {
    this.expireAt = expireAt;
    return this;
  }

  /**
   * Expiration date of contract (use ISO 8601 format YYYY-MM-DD)
   * @return expireAt
   **/
  @Schema(example = "Sat Apr 01 00:00:00 GMT 2023", description = "Expiration date of contract (use ISO 8601 format YYYY-MM-DD)")
  
    @Valid
    public LocalDate getExpireAt() {
    return expireAt;
  }

  public void setExpireAt(LocalDate expireAt) {
    this.expireAt = expireAt;
  }

  public BusinessContract status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of contact
   * @return status
   **/
  @Schema(example = "ACTIVE", description = "Status of contact")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessContract businessContract = (BusinessContract) o;
    return Objects.equals(this.contractId, businessContract.contractId) &&
        Objects.equals(this.contractRef, businessContract.contractRef) &&
        Objects.equals(this.createdAt, businessContract.createdAt) &&
        Objects.equals(this.activatedAt, businessContract.activatedAt) &&
        Objects.equals(this.expireAt, businessContract.expireAt) &&
        Objects.equals(this.status, businessContract.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, contractRef, createdAt, activatedAt, expireAt, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessContract {\n");
    
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    contractRef: ").append(toIndentedString(contractRef)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    activatedAt: ").append(toIndentedString(activatedAt)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
