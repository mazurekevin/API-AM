package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BusinessParticularPartyParticular;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes particular physical person
 */
@Schema(description = "Describes particular physical person")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:40:10.505Z[GMT]")


public class BusinessParticularParty  implements OneOfBusinessBuyerParty {
  @JsonProperty("particular")
  private BusinessParticularPartyParticular particular = null;

  public BusinessParticularParty particular(BusinessParticularPartyParticular particular) {
    this.particular = particular;
    return this;
  }

  /**
   * Get particular
   * @return particular
   **/
  @Schema(description = "")
  
    @Valid
    public BusinessParticularPartyParticular getParticular() {
    return particular;
  }

  public void setParticular(BusinessParticularPartyParticular particular) {
    this.particular = particular;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessParticularParty businessParticularParty = (BusinessParticularParty) o;
    return Objects.equals(this.particular, businessParticularParty.particular);
  }

  @Override
  public int hashCode() {
    return Objects.hash(particular);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessParticularParty {\n");
    
    sb.append("    particular: ").append(toIndentedString(particular)).append("\n");
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
