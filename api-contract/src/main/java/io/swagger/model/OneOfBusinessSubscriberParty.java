package io.swagger.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfBusinessSubscriberParty
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = BusinessProfessionnalParty.class, name = "BusinessProfessionnalParty"),
  @JsonSubTypes.Type(value = BusinessParticularParty.class, name = "BusinessParticularParty")
})
public interface OneOfBusinessSubscriberParty {

}
