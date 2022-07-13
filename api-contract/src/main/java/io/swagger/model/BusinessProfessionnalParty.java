package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BusinessProfessionnalPartyProfessionnal;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes professionnal organisation
 */
@Schema(description = "Describes professionnal organisation")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:46:33.636Z[GMT]")


public class BusinessProfessionnalParty  implements OneOfBusinessSubscriberParty {
  @JsonProperty("professionnal")
  private BusinessProfessionnalPartyProfessionnal professionnal = null;

  public BusinessProfessionnalParty professionnal(BusinessProfessionnalPartyProfessionnal professionnal) {
    this.professionnal = professionnal;
    return this;
  }

  /**
   * Get professionnal
   * @return professionnal
   **/
  @Schema(description = "")
  
    @Valid
    public BusinessProfessionnalPartyProfessionnal getProfessionnal() {
    return professionnal;
  }

  public void setProfessionnal(BusinessProfessionnalPartyProfessionnal professionnal) {
    this.professionnal = professionnal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessProfessionnalParty businessProfessionnalParty = (BusinessProfessionnalParty) o;
    return Objects.equals(this.professionnal, businessProfessionnalParty.professionnal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(professionnal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessProfessionnalParty {\n");
    
    sb.append("    professionnal: ").append(toIndentedString(professionnal)).append("\n");
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
