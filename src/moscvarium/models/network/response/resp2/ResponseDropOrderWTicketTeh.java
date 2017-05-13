package moscvarium.models.network.response.resp2;

/**
 * Created by xTazy on 5/10/17.
 */
public class ResponseDropOrderWTicketTeh {
    private Return_res return_res;

    public Return_res getReturn_res() {
        return return_res;
    }

    public void setReturn_res(Return_res return_res) {
        this.return_res = return_res;
    }

    @Override
    public String toString() {
        return "ClassPojo [return_res = " + return_res + "]";
    }

    public class Return_res {
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
        private String result;
        private String idt;
        private String ido;

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public String getIdt() {
            return idt;
        }

        public void setIdt(String idt) {
            this.idt = idt;
        }

        public String getIdo() {
            return ido;
        }

        public void setIdo(String ido) {
            this.ido = ido;
        }

        @Override
        public String toString() {
            return "ClassPojo [result = " + result + ", idt = " + idt + ", ido = " + ido + "]";
        }
    }

}
