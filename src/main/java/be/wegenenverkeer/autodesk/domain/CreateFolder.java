package be.wegenenverkeer.autodesk.domain;

import com.autodesk.client.model.Folder;
import com.autodesk.client.model.JsonApiVersionJsonapi;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

public class CreateFolder   {
    @JsonProperty("jsonapi")
    private JsonApiVersionJsonapi jsonapi = null;

    @JsonProperty("data")
    private Folder data = null;

    public CreateFolder jsonapi(JsonApiVersionJsonapi jsonapi) {
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

    public CreateFolder data(Folder data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     * @return data
     **/
    @ApiModelProperty(example = "null", value = "")
    public Folder getData() {
        return data;
    }

    public void setData(Folder data) {
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
        CreateFolder createFolder = (CreateFolder) o;
        return Objects.equals(this.jsonapi, createFolder.jsonapi) &&
                Objects.equals(this.data, createFolder.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jsonapi, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFolder {\n");

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

