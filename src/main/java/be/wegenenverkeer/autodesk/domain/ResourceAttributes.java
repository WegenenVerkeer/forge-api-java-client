package be.wegenenverkeer.autodesk.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

public class ResourceAttributes {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("displayName")
  private String displayName = null;


  public ResourceAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * filename used when synced to local disk
   * @return name
   **/
  @ApiModelProperty(example = "null", required = true, value = "filename used when synced to local disk")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResourceAttributes displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * displayable name of the folder
   * @return displayName
   **/
  @ApiModelProperty(example = "null", required = true, value = "displayable name of the folder")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceAttributes folderAttributes = (ResourceAttributes) o;
    return Objects.equals(this.name, folderAttributes.name) &&
            Objects.equals(this.displayName, folderAttributes.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, displayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FolderAttributes {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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
