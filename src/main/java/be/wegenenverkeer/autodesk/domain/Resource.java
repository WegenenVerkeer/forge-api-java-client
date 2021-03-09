package be.wegenenverkeer.autodesk.domain;

import com.autodesk.client.model.JsonApiLinks;
import com.autodesk.client.model.JsonApiMeta;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

public class Resource {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("attributes")
  private ResourceAttributes attributes = null;

  @JsonProperty("meta")
  private JsonApiMeta meta = null;

  @JsonProperty("relationships")
  private Relationship.Relationships relationships = null;

  @JsonProperty("links")
  private JsonApiLinks links = null;

  public Resource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * resource id
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "resource id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Resource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * resource type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "resource type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Resource attributes(ResourceAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(example = "null", value = "")
  public ResourceAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ResourceAttributes attributes) {
    this.attributes = attributes;
  }

  public Resource meta(JsonApiMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(example = "null", value = "")
  public JsonApiMeta getMeta() {
    return meta;
  }

  public void setMeta(JsonApiMeta meta) {
    this.meta = meta;
  }

  public Resource relationships(Relationship.Relationships relationships) {
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @ApiModelProperty(example = "null", value = "")
  public Relationship.Relationships getRelationships() {
    return relationships;
  }

  public void setRelationships(Relationship.Relationships relationships) {
    this.relationships = relationships;
  }

  public Resource links(JsonApiLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public JsonApiLinks getLinks() {
    return links;
  }

  public void setLinks(JsonApiLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resource jsonApiResource = (Resource) o;
    return Objects.equals(this.id, jsonApiResource.id) &&
        Objects.equals(this.type, jsonApiResource.type) &&
        Objects.equals(this.attributes, jsonApiResource.attributes) &&
        Objects.equals(this.meta, jsonApiResource.meta) &&
        Objects.equals(this.relationships, jsonApiResource.relationships) &&
        Objects.equals(this.links, jsonApiResource.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, attributes, meta, relationships, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonApiResource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

