package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.OperationResponse;
import io.swagger.model.QueryMetadataResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List of operations that meet the search criteria
 */
@Schema(description = "List of operations that meet the search criteria")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:40:10.505Z[GMT]")


public class OperationsResponse   {
  @JsonProperty("operations")
  @Valid
  private List<OperationResponse> operations = null;

  @JsonProperty("metadata")
  private QueryMetadataResponse metadata = null;

  public OperationsResponse operations(List<OperationResponse> operations) {
    this.operations = operations;
    return this;
  }

  public OperationsResponse addOperationsItem(OperationResponse operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<OperationResponse>();
    }
    this.operations.add(operationsItem);
    return this;
  }

  /**
   * Get operations
   * @return operations
   **/
  @Schema(description = "")
      @Valid
    public List<OperationResponse> getOperations() {
    return operations;
  }

  public void setOperations(List<OperationResponse> operations) {
    this.operations = operations;
  }

  public OperationsResponse metadata(QueryMetadataResponse metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   **/
  @Schema(description = "")
  
    @Valid
    public QueryMetadataResponse getMetadata() {
    return metadata;
  }

  public void setMetadata(QueryMetadataResponse metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationsResponse operationsResponse = (OperationsResponse) o;
    return Objects.equals(this.operations, operationsResponse.operations) &&
        Objects.equals(this.metadata, operationsResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operations, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationsResponse {\n");
    
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
