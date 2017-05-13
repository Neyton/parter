package moscvarium.models.network.response.resp2;

/**
 * Created by xTazy on 5/10/17.
 */
public class ResponseGetTicketForNewOrder {
    private String idorders;
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
