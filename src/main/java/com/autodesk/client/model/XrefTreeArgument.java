


package com.autodesk.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


public class XrefTreeArgument {
  @JsonProperty("url")
  private String url = null;

  @JsonProperty("verb")
  private String verb = null;

  public XrefTreeArgument url(String url) {
    this.url = url;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public XrefTreeArgument verb(String verb) {
    this.verb = verb;
    return this;
  }

  @ApiModelProperty(example = "put", value = "Possible values: put, get")
  public String getVerb() {
    return verb;
  }

  public void setVerb(String verb) {
    this.verb = verb;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XrefTreeArgument task = (XrefTreeArgument) o;
    return Objects.equals(this.verb, task.verb) &&
        Objects.equals(this.url, task.url) ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, verb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
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

