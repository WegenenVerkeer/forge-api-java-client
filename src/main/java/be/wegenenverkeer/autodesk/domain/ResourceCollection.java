package be.wegenenverkeer.autodesk.domain;

import com.autodesk.client.model.JsonApiVersionJsonapi;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ResourceCollection {
    @JsonProperty("jsonapi")
    private JsonApiVersionJsonapi jsonapi = null;

    @JsonProperty("data")
    private List<Resource> data = new ArrayList<Resource>();

    @JsonProperty("included")
    private List<Resource> included = new ArrayList<Resource>();

    public ResourceCollection jsonapi(JsonApiVersionJsonapi jsonapi) {
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

    public ResourceCollection included(List<Resource> included) {
        this.included = included;
        return this;
    }

    /**
     * Get data
     * @return data
     **/
    @ApiModelProperty(example = "null", required = true, value = "")
    public List<Resource> getIncluded() {
        return included;
    }

    public void setIncluded(List<Resource> included) {
        this.included = included;
    }

    public ResourceCollection data(List<Resource> data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     * @return data
     **/
    @ApiModelProperty(example = "null", required = true, value = "")
    public List<Resource> getData() {
        return data;
    }

    public void setData(List<Resource> data) {
        this.data = data;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceCollection jsonApiCollection = (ResourceCollection) o;
        return Objects.equals(this.jsonapi, jsonApiCollection.jsonapi) &&
                Objects.equals(this.data, jsonApiCollection.data) &&
                Objects.equals(this.included, jsonApiCollection.included);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jsonapi, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JsonApiCollectionFolders {\n");

        sb.append("    jsonapi: ").append(toIndentedString(jsonapi)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    included: ").append(toIndentedString(included)).append("\n");
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

