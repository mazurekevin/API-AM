package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ContractResponse;
import io.swagger.model.QueryMetadataResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List of contracts that meet the search criteria
 */
@Schema(description = "List of contracts that meet the search criteria")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:46:33.636Z[GMT]")


public class ContractsResponse   {
  @JsonProperty("contracts")
  @Valid
  private List<ContractResponse> contracts = null;

  @JsonProperty("metadata")
  private QueryMetadataResponse metadata = null;

  public ContractsResponse contracts(List<ContractResponse> contracts) {
    this.contracts = contracts;
    return this;
  }

  public ContractsResponse addContractsItem(ContractResponse contractsItem) {
    if (this.contracts == null) {
      this.contracts = new ArrayList<ContractResponse>();
    }
    this.contracts.add(contractsItem);
    return this;
  }

  /**
   * Get contracts
   * @return contracts
   **/
  @Schema(description = "")
      @Valid
    public List<ContractResponse> getContracts() {
    return contracts;
  }

  public void setContracts(List<ContractResponse> contracts) {
    this.contracts = contracts;
  }

  public ContractsResponse metadata(QueryMetadataResponse metadata) {
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
    ContractsResponse contractsResponse = (ContractsResponse) o;
    return Objects.equals(this.contracts, contractsResponse.contracts) &&
        Objects.equals(this.metadata, contractsResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contracts, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractsResponse {\n");
    
    sb.append("    contracts: ").append(toIndentedString(contracts)).append("\n");
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
