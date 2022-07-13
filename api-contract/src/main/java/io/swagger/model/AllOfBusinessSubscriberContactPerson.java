package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.BusinessPerson;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AllOfBusinessSubscriberContactPerson
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:46:33.636Z[GMT]")


public class AllOfBusinessSubscriberContactPerson extends BusinessPerson  {
  @JsonProperty("contactId")
  private String contactId = null;

  public AllOfBusinessSubscriberContactPerson contactId(String contactId) {
    this.contactId = contactId;
    return this;
  }

  /**
   * Internal contact identifier (legal represenative of entity)
   * @return contactId
   **/
  @Schema(example = "CCU-001524", required = true, description = "Internal contact identifier (legal represenative of entity)")
      @NotNull

    public String getContactId() {
    return contactId;
  }

  public void setContactId(String contactId) {
    this.contactId = contactId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllOfBusinessSubscriberContactPerson allOfBusinessSubscriberContactPerson = (AllOfBusinessSubscriberContactPerson) o;
    return Objects.equals(this.contactId, allOfBusinessSubscriberContactPerson.contactId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOfBusinessSubscriberContactPerson {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
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
