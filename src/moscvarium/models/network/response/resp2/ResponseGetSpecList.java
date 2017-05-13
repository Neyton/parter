package moscvarium.models.network.response.resp2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Created by xTazy on 5/10/17.
 */
@JacksonXmlRootElement(localName = "data")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseGetSpecList {
    @JacksonXmlProperty(localName = "spectacle")
    @JacksonXmlElementWrapper(useWrapping = false)
    public Spectacle[] spectacle;


    @Override
    public String toString() {
        return "ClassPojo [spectacle = " + spectacle + "]";
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Spectacle {
        public String Name;
        public String id;
        public String open;
        public String time;
        public String AgeRestriction;
        public String hall;
        public String IdBuilding;
        public String IdHall;
        public String BuildingName;
        public String day;
        public String dow;
        public String type;

        @JsonCreator
        public Spectacle() {
        }
    }
}
