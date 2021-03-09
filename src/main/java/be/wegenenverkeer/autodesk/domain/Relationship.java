package be.wegenenverkeer.autodesk.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Relationship {

    public static class RelationshipData {
        @JsonProperty("type")
        private String type;

        @JsonProperty("id")
        private String id;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public static class Derivatives {
        @JsonProperty("data")
        private RelationshipData data;

        public RelationshipData getData() {
            return data;
        }

        public void setData(RelationshipData data) {
            this.data = data;
        }
    }

    public static class Storage {
        @JsonProperty("data")
        private RelationshipData data;

        public RelationshipData getData() {
            return data;
        }

        public void setData(RelationshipData data) {
            this.data = data;
        }
    }

    public static class Relationships {
        @JsonProperty("storage")
        private Storage storage;

        public Storage getStorage() {
            return storage;
        }

        public void setStorage(Storage storage) {
            this.storage = storage;
        }

        @JsonProperty("derivatives")
        private Derivatives derivatives;

        public Derivatives getDerivatives() {
            return derivatives;
        }

        public void setDerivatives(Derivatives derivatives) {
            this.derivatives = derivatives;
        }
    }

}
