package moscvarium.models.network.response.resp2;

/**
 * Created by xTazy on 5/10/17.
 */
public class ResponseGetSalesReport {

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
        private String id;
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
        private String price;
        private String saletime;
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
