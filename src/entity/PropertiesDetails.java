package entity;

import java.util.Objects;

public class PropertiesDetails {

    private String idPropertiesDetails;
    private String propertiesDetails;
    private Properties properties;

//    get set
    public String getIdPropertiesDetails() {
        return idPropertiesDetails;
    }

    public void setIdPropertiesDetails(String idPropertiesDetails) {
        this.idPropertiesDetails = idPropertiesDetails;
    }

    public String getPropertiesDetails() {
        return propertiesDetails;
    }

    public void setPropertiesDetails(String propertiesDetails) {
        this.propertiesDetails = propertiesDetails;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

//    constructor
    public PropertiesDetails() {
        super();
    }

    public PropertiesDetails(String idPropertiesDetails) {
        super();
        this.idPropertiesDetails = idPropertiesDetails;
    }

    public PropertiesDetails(String idPropertiesDetails, String propertiesDetails, Properties properties) {
        super();
        this.idPropertiesDetails = idPropertiesDetails;
        this.propertiesDetails = propertiesDetails;
        this.properties = properties;
    }

//    Hashcode equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.idPropertiesDetails);
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
        final PropertiesDetails other = (PropertiesDetails) obj;
        return Objects.equals(this.idPropertiesDetails, other.idPropertiesDetails);
    }

//    toString
    @Override
    public String toString() {
        return "PropertiesDetails{" + "idPropertiesDetails=" + idPropertiesDetails + ", propertiesDetails=" + propertiesDetails + ", properties=" + properties + '}';
    }

}
