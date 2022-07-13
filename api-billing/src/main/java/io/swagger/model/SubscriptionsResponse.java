package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.QueryMetadataResponse;
import io.swagger.model.SubscriptionResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List of subscriptions that meet the search criteria
 */
@Schema(description = "List of subscriptions that meet the search criteria")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:40:10.505Z[GMT]")


public class SubscriptionsResponse   {
  @JsonProperty("subscriptions")
  @Valid
  private List<SubscriptionResponse> subscriptions = null;

  @JsonProperty("metadata")
  private QueryMetadataResponse metadata = null;

  public SubscriptionsResponse subscriptions(List<SubscriptionResponse> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public SubscriptionsResponse addSubscriptionsItem(SubscriptionResponse subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<SubscriptionResponse>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

  /**
   * Get subscriptions
   * @return subscriptions
   **/
  @Schema(description = "")
      @Valid
    public List<SubscriptionResponse> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<SubscriptionResponse> subscriptions) {
    this.subscriptions = subscriptions;
  }

  public SubscriptionsResponse metadata(QueryMetadataResponse metadata) {
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
    SubscriptionsResponse subscriptionsResponse = (SubscriptionsResponse) o;
    return Objects.equals(this.subscriptions, subscriptionsResponse.subscriptions) &&
        Objects.equals(this.metadata, subscriptionsResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptions, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionsResponse {\n");
    
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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
