package be.wegenenverkeer.autodesk.domain;

import com.autodesk.client.model.Folder;
import com.autodesk.client.model.JsonApiVersionJsonapi;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * JsonApiCollection
 */

public class JsonApiCollectionFolders   {
    @JsonProperty("jsonapi")
    private JsonApiVersionJsonapi jsonapi = null;

    @JsonProperty("data")
    private List<Folder> data = new ArrayList<Folder>();

    public JsonApiCollectionFolders jsonapi(JsonApiVersionJsonapi jsonapi) {
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

    public JsonApiCollectionFolders data(List<Folder> data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     * @return data
     **/
    @ApiModelProperty(example = "null", required = true, value = "")
    public List<Folder> getData() {
        return data;
    }

    public void setData(List<Folder> data) {
        this.data = data;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JsonApiCollectionFolders jsonApiCollection = (JsonApiCollectionFolders) o;
        return Objects.equals(this.jsonapi, jsonApiCollection.jsonapi) &&
                Objects.equals(this.data, jsonApiCollection.data);
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

