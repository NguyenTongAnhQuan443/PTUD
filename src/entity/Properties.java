package entity;

import java.util.Objects;

public class Properties {

    private String idProperties;
    private String properties;

//    get set
    public String getIdProperties() {
        return idProperties;
    }

    public void setIdProperties(String idProperties) {
        this.idProperties = idProperties;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

//     constructor
    public Properties() {
        super();
    }

    public Properties(String idProperties) {
        super();
        this.idProperties = idProperties;
    }

    public Properties(String idProperties, String properties) {
        super();
        this.idProperties = idProperties;
        this.properties = properties;
    }

//    Hashcode equals 
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.idProperties);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Properties other = (Properties) obj;
        return Objects.equals(this.idProperties, other.idProperties);
    }

//    toString
    @Override
    public String toString() {
        return "Properties{" + "idProperties=" + idProperties + ", properties=" + properties + '}';
    }

}
