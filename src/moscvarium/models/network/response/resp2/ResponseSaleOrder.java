package moscvarium.models.network.response.resp2;

/**
 * Created by xTazy on 5/10/17.
 */
public class ResponseSaleOrder {
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
        private String id;
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
