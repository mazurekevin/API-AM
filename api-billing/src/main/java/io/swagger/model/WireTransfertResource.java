package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.WireTransfertResourceBankCoordinates;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SEPA Informations
 */
@Schema(description = "SEPA Informations")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:40:10.505Z[GMT]")


public class WireTransfertResource   {
  @JsonProperty("rum")
  private String rum = null;

  @JsonProperty("bankCoordinates")
  private WireTransfertResourceBankCoordinates bankCoordinates = null;

  public WireTransfertResource rum(String rum) {
    this.rum = rum;
    return this;
  }

  /**
   * Référence Unique de Mandat
   * @return rum
   **/
  @Schema(example = "RUM08918098739762ABCGDF65524255658", description = "Référence Unique de Mandat")
  
    public String getRum() {
    return rum;
  }

  public void setRum(String rum) {
    this.rum = rum;
  }

  public WireTransfertResource bankCoordinates(WireTransfertResourceBankCoordinates bankCoordinates) {
    this.bankCoordinates = bankCoordinates;
    return this;
  }

  /**
   * Get bankCoordinates
   * @return bankCoordinates
   **/
  @Schema(description = "")
  
    @Valid
    public WireTransfertResourceBankCoordinates getBankCoordinates() {
    return bankCoordinates;
  }

  public void setBankCoordinates(WireTransfertResourceBankCoordinates bankCoordinates) {
    this.bankCoordinates = bankCoordinates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WireTransfertResource wireTransfertResource = (WireTransfertResource) o;
    return Objects.equals(this.rum, wireTransfertResource.rum) &&
        Objects.equals(this.bankCoordinates, wireTransfertResource.bankCoordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rum, bankCoordinates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WireTransfertResource {\n");
    
    sb.append("    rum: ").append(toIndentedString(rum)).append("\n");
    sb.append("    bankCoordinates: ").append(toIndentedString(bankCoordinates)).append("\n");
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
