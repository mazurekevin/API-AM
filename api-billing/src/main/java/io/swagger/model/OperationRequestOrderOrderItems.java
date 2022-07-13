package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BusinessAddress;
import io.swagger.model.BusinessPerson;
import io.swagger.model.OperationRequestOrderProductItems;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationRequestOrderOrderItems
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:40:10.505Z[GMT]")


public class OperationRequestOrderOrderItems   {
  @JsonProperty("shipmentAddress")
  private BusinessAddress shipmentAddress = null;

  @JsonProperty("shipmentContact")
  private BusinessPerson shipmentContact = null;

  @JsonProperty("deliveredOn")
  private LocalDate deliveredOn = null;

  @JsonProperty("productItems")
  @Valid
  private List<OperationRequestOrderProductItems> productItems = null;

  public OperationRequestOrderOrderItems shipmentAddress(BusinessAddress shipmentAddress) {
    this.shipmentAddress = shipmentAddress;
    return this;
  }

  /**
   * Get shipmentAddress
   * @return shipmentAddress
   **/
  @Schema(description = "")
  
    @Valid
    public BusinessAddress getShipmentAddress() {
    return shipmentAddress;
  }

  public void setShipmentAddress(BusinessAddress shipmentAddress) {
    this.shipmentAddress = shipmentAddress;
  }

  public OperationRequestOrderOrderItems shipmentContact(BusinessPerson shipmentContact) {
    this.shipmentContact = shipmentContact;
    return this;
  }

  /**
   * Get shipmentContact
   * @return shipmentContact
   **/
  @Schema(description = "")
  
    @Valid
    public BusinessPerson getShipmentContact() {
    return shipmentContact;
  }

  public void setShipmentContact(BusinessPerson shipmentContact) {
    this.shipmentContact = shipmentContact;
  }

  public OperationRequestOrderOrderItems deliveredOn(LocalDate deliveredOn) {
    this.deliveredOn = deliveredOn;
    return this;
  }

  /**
   * Order delivery date
   * @return deliveredOn
   **/
  @Schema(example = "Thu Apr 28 00:00:00 GMT 2022", description = "Order delivery date")
  
    @Valid
    public LocalDate getDeliveredOn() {
    return deliveredOn;
  }

  public void setDeliveredOn(LocalDate deliveredOn) {
    this.deliveredOn = deliveredOn;
  }

  public OperationRequestOrderOrderItems productItems(List<OperationRequestOrderProductItems> productItems) {
    this.productItems = productItems;
    return this;
  }

  public OperationRequestOrderOrderItems addProductItemsItem(OperationRequestOrderProductItems productItemsItem) {
    if (this.productItems == null) {
      this.productItems = new ArrayList<OperationRequestOrderProductItems>();
    }
    this.productItems.add(productItemsItem);
    return this;
  }

  /**
   * Get productItems
   * @return productItems
   **/
  @Schema(description = "")
      @Valid
    public List<OperationRequestOrderProductItems> getProductItems() {
    return productItems;
  }

  public void setProductItems(List<OperationRequestOrderProductItems> productItems) {
    this.productItems = productItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationRequestOrderOrderItems operationRequestOrderOrderItems = (OperationRequestOrderOrderItems) o;
    return Objects.equals(this.shipmentAddress, operationRequestOrderOrderItems.shipmentAddress) &&
        Objects.equals(this.shipmentContact, operationRequestOrderOrderItems.shipmentContact) &&
        Objects.equals(this.deliveredOn, operationRequestOrderOrderItems.deliveredOn) &&
        Objects.equals(this.productItems, operationRequestOrderOrderItems.productItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentAddress, shipmentContact, deliveredOn, productItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationRequestOrderOrderItems {\n");
    
    sb.append("    shipmentAddress: ").append(toIndentedString(shipmentAddress)).append("\n");
    sb.append("    shipmentContact: ").append(toIndentedString(shipmentContact)).append("\n");
    sb.append("    deliveredOn: ").append(toIndentedString(deliveredOn)).append("\n");
    sb.append("    productItems: ").append(toIndentedString(productItems)).append("\n");
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
