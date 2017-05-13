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
public class ResponseGetSalesReport {
    @JacksonXmlProperty(localName = "sales_report")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Sales_report sales_report;

    public Sales_report getSales_report() {
        return sales_report;
    }

    public void setSales_report(Sales_report sales_report) {
        this.sales_report = sales_report;
    }

    @Override
    public String toString() {
        return "ClassPojo [sales_report = " + sales_report + "]";
    }

    public class Sales_report {
        @JacksonXmlProperty(localName = "spectacle")
        @JacksonXmlElementWrapper(useWrapping = false)
        private Spectacle spectacle;

        public Spectacle getSpectacle() {
            return spectacle;
        }

        public void setSpectacle(Spectacle spectacle) {
            this.spectacle = spectacle;
        }

        @Override
        public String toString() {
            return "ClassPojo [spectacle = " + spectacle + "]";
        }
    }

    public class Spectacle {
        @JacksonXmlProperty(localName = "id")
        private String id;
        @JacksonXmlProperty(localName = "ticket")
        @JacksonXmlElementWrapper(useWrapping = false)
        private Ticket[] ticket;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Ticket[] getTicket() {
            return ticket;
        }

        public void setTicket(Ticket[] ticket) {
            this.ticket = ticket;
        }

        @Override
        public String toString() {
            return "ClassPojo [id = " + id + ", ticket = " + ticket + "]";
        }
    }

    public class Ticket {
        @JacksonXmlProperty(localName = "price")
        private String price;
        @JacksonXmlProperty(localName = "saletime")
        private String saletime;
        @JacksonXmlProperty(localName = "ticketid")
        private String ticketid;

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getSaletime() {
            return saletime;
        }

        public void setSaletime(String saletime) {
            this.saletime = saletime;
        }

        public String getTicketid() {
            return ticketid;
        }

        public void setTicketid(String ticketid) {
            this.ticketid = ticketid;
        }

        @Override
        public String toString() {
            return "ClassPojo [price = " + price + ", saletime = " + saletime + ", ticketid = " + ticketid + "]";
        }
    }

}
