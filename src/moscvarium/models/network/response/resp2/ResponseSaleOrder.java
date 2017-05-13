package moscvarium.models.network.response.resp2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Created by xTazy on 5/10/17.
 */
@JacksonXmlRootElement(localName = "data")
public class ResponseSaleOrder {
    @JacksonXmlProperty(localName = "res")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Res res;

    public Res getRes() {
        return res;
    }

    public void setRes(Res res) {
        this.res = res;
    }

    @Override
    public String toString() {
        return "ClassPojo [res = " + res + "]";
    }

    public class Res {
        @JacksonXmlProperty(localName = "ticket")
        @JacksonXmlElementWrapper(useWrapping = false)
        private Ticket ticket;

        public Ticket getTicket() {
            return ticket;
        }

        public void setTicket(Ticket ticket) {
            this.ticket = ticket;
        }

        @Override
        public String toString() {
            return "ClassPojo [ticket = " + ticket + "]";
        }
    }

    public class Ticket {
        @JacksonXmlProperty(localName = "id")
        private String id;
        @JacksonXmlProperty(localName = "number")
        private String number;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "ClassPojo [id = " + id + ", number = " + number + "]";
        }
    }

}
