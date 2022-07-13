package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Informations on current query &amp; count of items and pages
 */
@Schema(description = "Informations on current query & count of items and pages")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:40:10.505Z[GMT]")


public class QueryMetadataResponse   {
  @JsonProperty("query")
  private String query = null;

  @JsonProperty("countItems")
  private Integer countItems = null;

  @JsonProperty("totalItems")
  private Integer totalItems = null;

  @JsonProperty("totalPages")
  private Integer totalPages = null;

  public QueryMetadataResponse query(String query) {
    this.query = query;
    return this;
  }

  /**
   * URI of current query
   * @return query
   **/
  @Schema(description = "URI of current query")
  
    public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public QueryMetadataResponse countItems(Integer countItems) {
    this.countItems = countItems;
    return this;
  }

  /**
   * Number of items in current response
   * @return countItems
   **/
  @Schema(description = "Number of items in current response")
  
    public Integer getCountItems() {
    return countItems;
  }

  public void setCountItems(Integer countItems) {
    this.countItems = countItems;
  }

  public QueryMetadataResponse totalItems(Integer totalItems) {
    this.totalItems = totalItems;
    return this;
  }

  /**
   * Total number of items for current query
   * @return totalItems
   **/
  @Schema(description = "Total number of items for current query")
  
    public Integer getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }

  public QueryMetadataResponse totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Total number of pages for current query
   * @return totalPages
   **/
  @Schema(description = "Total number of pages for current query")
  
    public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryMetadataResponse queryMetadataResponse = (QueryMetadataResponse) o;
    return Objects.equals(this.query, queryMetadataResponse.query) &&
        Objects.equals(this.countItems, queryMetadataResponse.countItems) &&
        Objects.equals(this.totalItems, queryMetadataResponse.totalItems) &&
        Objects.equals(this.totalPages, queryMetadataResponse.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, countItems, totalItems, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryMetadataResponse {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    countItems: ").append(toIndentedString(countItems)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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
