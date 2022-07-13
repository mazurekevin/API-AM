package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BusinessPerson
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:40:10.505Z[GMT]")


public class BusinessPerson   {
  /**
   * Gender of the contact
   */
  public enum GenderEnum {
    M("M"),
    
    MME("MME");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderEnum fromValue(String text) {
      for (GenderEnum b : GenderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("gender")
  private GenderEnum gender = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("mail")
  private String mail = null;

  @JsonProperty("phone")
  private String phone = null;

  public BusinessPerson gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Gender of the contact
   * @return gender
   **/
  @Schema(example = "M", description = "Gender of the contact")
  
    public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public BusinessPerson firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of the contact
   * @return firstName
   **/
  @Schema(example = "John", description = "First name of the contact")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public BusinessPerson lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of the contact
   * @return lastName
   **/
  @Schema(example = "DOE", required = true, description = "Last name of the contact")
      @NotNull

    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public BusinessPerson mail(String mail) {
    this.mail = mail;
    return this;
  }

  /**
   * Mail address of the contact
   * @return mail
   **/
  @Schema(example = "john.doe@acme.com", required = true, description = "Mail address of the contact")
      @NotNull

    public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public BusinessPerson phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Phone number of the contact
   * @return phone
   **/
  @Schema(example = "+33 (0)1 56 87 65 78", description = "Phone number of the contact")
  
    public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessPerson businessPerson = (BusinessPerson) o;
    return Objects.equals(this.gender, businessPerson.gender) &&
        Objects.equals(this.firstName, businessPerson.firstName) &&
        Objects.equals(this.lastName, businessPerson.lastName) &&
        Objects.equals(this.mail, businessPerson.mail) &&
        Objects.equals(this.phone, businessPerson.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gender, firstName, lastName, mail, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessPerson {\n");
    
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
