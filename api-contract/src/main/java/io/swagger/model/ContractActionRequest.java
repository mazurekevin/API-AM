package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describe contract action
 */
@Schema(description = "Describe contract action")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:46:33.636Z[GMT]")


public class ContractActionRequest   {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("contractRef")
  private String contractRef = null;

  public ContractActionRequest action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   **/
  @Schema(example = "activation", description = "")
  
    public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public ContractActionRequest contractRef(String contractRef) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractActionRequest contractActionRequest = (ContractActionRequest) o;
    return Objects.equals(this.action, contractActionRequest.action) &&
        Objects.equals(this.contractRef, contractActionRequest.contractRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, contractRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractActionRequest {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    contractRef: ").append(toIndentedString(contractRef)).append("\n");
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
