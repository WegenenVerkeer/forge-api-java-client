package be.wegenenverkeer.autodesk.domain;

import com.autodesk.client.model.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Eigen versie van Version klasse met completere storage relatie om objectId te achterhalen van bestand in bucket
 */
public class ExtendedVersion {

  public static class Attributes {
    @JsonProperty("displayName")
    private String displayName;


    public String getDisplayName() {
      return displayName;
    }

    public void setDisplayName(String displayName) {
      this.displayName = displayName;
    }
  }

  public static class Data {

    @JsonProperty("id")
    private String id;

    @JsonProperty("relationships")
    private Relationship.Relationships relationships;

    @JsonProperty("attributes")
    private Attributes attributes;


    public Relationship.Relationships getRelationships() {
      return relationships;
    }

    public void setRelationships(Relationship.Relationships relationships) {
      this.relationships = relationships;
    }

    public Attributes getAttributes() {
      return attributes;
    }

    public void setAttributes(Attributes attributes) {
      this.attributes = attributes;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }
  }

  @JsonProperty("jsonapi")
  private JsonApiVersionJsonapi jsonapi = null;

  @JsonProperty("data")
  private Data data = null;

  @JsonProperty("included")
  private List<Resource> included = new ArrayList<Resource>();

  @JsonProperty("links")
  private JsonApiLinks links = null;

  @JsonProperty("id")
  private String id = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    VERSIONS("versions");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("attributes")
  private VersionAttributes attributes = null;

  @JsonProperty("meta")
  private JsonApiMeta meta = null;

  @JsonProperty("relationships")
  private VersionRelationships relationships = null;

  public ExtendedVersion jsonapi(JsonApiVersionJsonapi jsonapi) {
    this.jsonapi = jsonapi;
    return this;
  }

   /**
   * Get jsonapi
   * @return jsonapi
  **/
  @ApiModelProperty(example = "null", value = "")
  public JsonApiVersionJsonapi getJsonapi() {
    return jsonapi;
  }

  public void setJsonapi(JsonApiVersionJsonapi jsonapi) {
    this.jsonapi = jsonapi;
  }

  public Data data(Data data) {
    this.data = data;
    return data;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Data getData() {
    return data;
  }

  public void setData(Data data) {
    this.data = data;
  }

  public ExtendedVersion included(List<Resource> included) {
    this.included = included;
    return this;
  }

   /**
   * Get included
   * @return included
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Resource> getIncluded() {
    return included;
  }

  public void setIncluded(List<Resource> included) {
    this.included = included;
  }

  public ExtendedVersion links(JsonApiLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public JsonApiLinks getLinks() {
    return links;
  }

  public void setLinks(JsonApiLinks links) {
    this.links = links;
  }

  public ExtendedVersion id(String id) {
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

  public ExtendedVersion type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ExtendedVersion attributes(VersionAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(example = "null", value = "")
  public VersionAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(VersionAttributes attributes) {
    this.attributes = attributes;
  }

  public ExtendedVersion meta(JsonApiMeta meta) {
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

  public ExtendedVersion relationships(VersionRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @ApiModelProperty(example = "null", value = "")
  public VersionRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(VersionRelationships relationships) {
    this.relationships = relationships;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendedVersion version = (ExtendedVersion) o;
    return Objects.equals(this.jsonapi, version.jsonapi) &&
        Objects.equals(this.data, version.data) &&
        Objects.equals(this.included, version.included) &&
        Objects.equals(this.links, version.links) &&
        Objects.equals(this.id, version.id) &&
        Objects.equals(this.type, version.type) &&
        Objects.equals(this.attributes, version.attributes) &&
        Objects.equals(this.meta, version.meta) &&
        Objects.equals(this.relationships, version.relationships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jsonapi, data, included, links, id, type, attributes, meta, relationships);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Version {\n");
    
    sb.append("    jsonapi: ").append(toIndentedString(jsonapi)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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

