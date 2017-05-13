package moscvarium.models.network.response.resp2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Created by xTazy on 5/10/17.
 */
@JacksonXmlRootElement(localName = "data")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseGetTicketForNewOrder {
    @JacksonXmlProperty(localName = "idorders")
    private String idorders;
    @JacksonXmlProperty(localName = "Tickets")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Tickets Tickets;

    public String getIdorders() {
        return idorders;
    }

    public void setIdorders(String idorders) {
        this.idorders = idorders;
    }

    public Tickets getTickets() {
        return Tickets;
    }

    public void setTickets(Tickets Tickets) {
        this.Tickets = Tickets;
    }

    @Override
    public String toString() {
        return "ClassPojo [idorders = " + idorders + ", Tickets = " + Tickets + "]";
    }

    public class Tickets {
        @JacksonXmlProperty(localName = "IdTicketOperation")
        private String IdTicketOperation;

        public String getIdTicketOperation() {
            return IdTicketOperation;
        }

        public void setIdTicketOperation(String IdTicketOperation) {
            this.IdTicketOperation = IdTicketOperation;
        }

        @Override
        public String toString() {
            return "ClassPojo [IdTicketOperation = " + IdTicketOperation + "]";
        }
    }

}
